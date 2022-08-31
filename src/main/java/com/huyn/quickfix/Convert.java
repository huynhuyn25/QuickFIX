package com.huyn.quickfix;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.maven.plugin.MojoExecutionException;
import quickfix.*;
import quickfix.field.ApplVerID;
import quickfix.field.Message;
import quickfix.field.MessageFactory;
import quickfix.field.MsgType;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Convert {
    public static void main(String[] args) throws ConfigError, IOException, InvalidMessage, FieldNotFound {
        Convert convert = new Convert();
        convert.ConvertStO(new File("src/main/resources/infogateclient.20200529.dat"));


    }

    public void ConvertStO(File file) throws IOException, ConfigError, InvalidMessage, FieldNotFound {
        DataDictionary dictionary = new DataDictionary("src/main/resources/CustomFIX.xml");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int count = 0;
        Gson gson = new Gson();
        String line;
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/dataSI"));
        while ((line = reader.readLine()) != null) {
            count++;
//            quickfix.MessageFactory messageFactory = new DefaultMessageFactory(ApplVerID.FIX44);
//            quickfix.Message messageFromMessageUtils = quickfix.MessageUtils.parse(messageFactory, null, line);
            Message messageFromMessageUtils = (Message) MessageUtils.parse(new MessageFactory(), dictionary, line, false);
            List<JsonObject> listJsonData = new ArrayList<>();
            JsonObject jsonObject = new JsonObject();
            String msgType = ((Message.Header) messageFromMessageUtils.getHeader()).getMsgType().getValue();
//            System.out.println(((Message.Header) messageFromMessageUtils.getHeader()).getSendingTime());
            jsonObject.addProperty("MsgType",msgType);
            Iterator<Field<?>> iterator = messageFromMessageUtils.iterator();
            while (iterator.hasNext()) {
                Field<?> field = iterator.next();
                jsonObject.addProperty(dictionary.getFieldName(field.getField()) != null ? dictionary.getFieldName(field.getField()) : "" + field.getTag() + "", (String) (field.getObject() != null ? field.getObject() : ""));
//                jsonObject.addProperty(dictionary.getFieldName(field.getField()), (String) field.getObject());
//                System.out.println(dictionary.getFieldName(field.getField()) + ": " + field.getObject());
            }
            listJsonData.add(jsonObject);
            Iterator<Integer> iteratorKeys = messageFromMessageUtils.groupKeyIterator();
            int key;
            while (iteratorKeys.hasNext()) {
                key = iteratorKeys.next();
                for (Group group : messageFromMessageUtils.getGroups(key)) {
                    iterator = group.iterator();
                    jsonObject = new JsonObject();
                    while (iterator.hasNext()) {
                        Field<?> field = iterator.next();
                        jsonObject.addProperty(dictionary.getFieldName(field.getField()) != null ? dictionary.getFieldName(field.getField()) : "" + field.getTag() + "", (String) (field.getObject() != null ? field.getObject() : ""));
                    }
                    listJsonData.add(jsonObject);
                }
            }

            if(msgType.equals("SI"))  {
                writer.write(gson.toJson(listJsonData));
                writer.newLine();
//                System.out.println(count);
            }

//            if (count == 3) break;
//            try {
//
//                ObjectMapper mapper = new ObjectMapper();
//                String json = mapper.writeValueAsString(messageFromMessageUtils);
//
//                System.out.println(json);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

        }
    }
}
