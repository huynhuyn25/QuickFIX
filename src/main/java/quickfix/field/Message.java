/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/
package quickfix.field;

import quickfix.FieldNotFound;
  
import quickfix.field.*;


public class Message extends quickfix.Message {

	static final long serialVersionUID = 20050617;

	public Message() {
		this(null);
	}

	protected Message(int[] fieldOrder) {
		super(fieldOrder);
		
		getHeader().setField(new BeginString("FIX.4.4"));
			
	}

    @Override
    protected Header newHeader() {
        return new Header(this);
    }

	public static class Header extends quickfix.Message.Header {

		static final long serialVersionUID = 20050617;

		public Header(Message msg) {
			// JNI compatibility
		}
		
	public void set(quickfix.field.BeginString value) {
		setField(value);
	}

	public quickfix.field.BeginString get(quickfix.field.BeginString value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BeginString getBeginString() throws FieldNotFound {
		return get(new quickfix.field.BeginString());
	}

	public boolean isSet(quickfix.field.BeginString field) {
		return isSetField(field);
	}

	public boolean isSetBeginString() {
		return isSetField(8);
	}

	public void set(quickfix.field.BodyLength value) {
		setField(value);
	}

	public quickfix.field.BodyLength get(quickfix.field.BodyLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BodyLength getBodyLength() throws FieldNotFound {
		return get(new quickfix.field.BodyLength());
	}

	public boolean isSet(quickfix.field.BodyLength field) {
		return isSetField(field);
	}

	public boolean isSetBodyLength() {
		return isSetField(9);
	}

	public void set(quickfix.field.MsgType value) {
		setField(value);
	}

	public quickfix.field.MsgType get(quickfix.field.MsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MsgType getMsgType() throws FieldNotFound {
		return get(new quickfix.field.MsgType());
	}

	public boolean isSet(quickfix.field.MsgType field) {
		return isSetField(field);
	}

	public boolean isSetMsgType() {
		return isSetField(35);
	}

	public void set(quickfix.field.SenderCompID value) {
		setField(value);
	}

	public quickfix.field.SenderCompID get(quickfix.field.SenderCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SenderCompID getSenderCompID() throws FieldNotFound {
		return get(new quickfix.field.SenderCompID());
	}

	public boolean isSet(quickfix.field.SenderCompID field) {
		return isSetField(field);
	}

	public boolean isSetSenderCompID() {
		return isSetField(49);
	}

	public void set(quickfix.field.SendingTime value) {
		setField(value);
	}

	public quickfix.field.SendingTime get(quickfix.field.SendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SendingTime getSendingTime() throws FieldNotFound {
		return get(new quickfix.field.SendingTime());
	}

	public boolean isSet(quickfix.field.SendingTime field) {
		return isSetField(field);
	}

	public boolean isSetSendingTime() {
		return isSetField(52);
	}

	}
	
	
	public void set(quickfix.field.SignatureLength value) {
		setField(value);
	}

	public quickfix.field.SignatureLength get(quickfix.field.SignatureLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SignatureLength getSignatureLength() throws FieldNotFound {
		return get(new quickfix.field.SignatureLength());
	}

	public boolean isSet(quickfix.field.SignatureLength field) {
		return isSetField(field);
	}

	public boolean isSetSignatureLength() {
		return isSetField(93);
	}

	public void set(quickfix.field.Signature value) {
		setField(value);
	}

	public quickfix.field.Signature get(quickfix.field.Signature value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Signature getSignature() throws FieldNotFound {
		return get(new quickfix.field.Signature());
	}

	public boolean isSet(quickfix.field.Signature field) {
		return isSetField(field);
	}

	public boolean isSetSignature() {
		return isSetField(89);
	}

	public void set(quickfix.field.CheckSum value) {
		setField(value);
	}

	public quickfix.field.CheckSum get(quickfix.field.CheckSum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CheckSum getCheckSum() throws FieldNotFound {
		return get(new quickfix.field.CheckSum());
	}

	public boolean isSet(quickfix.field.CheckSum field) {
		return isSetField(field);
	}

	public boolean isSetCheckSum() {
		return isSetField(10);
	}

}
