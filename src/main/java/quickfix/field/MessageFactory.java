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

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case quickfix.field.Heartbeat.MSGTYPE:
				return new quickfix.field.Heartbeat();
	
			case quickfix.field.Logon.MSGTYPE:
				return new quickfix.field.Logon();
	
			case quickfix.field.AutionMatch.MSGTYPE:
				return new quickfix.field.AutionMatch();
	
			case quickfix.field.BoardInfo.MSGTYPE:
				return new quickfix.field.BoardInfo();
	
			case quickfix.field.DerivativesInfo.MSGTYPE:
				return new quickfix.field.DerivativesInfo();
	
			case quickfix.field.Index.MSGTYPE:
				return new quickfix.field.Index();
	
			case quickfix.field.Stock.MSGTYPE:
				return new quickfix.field.Stock();
	
			case quickfix.field.StockInfo.MSGTYPE:
				return new quickfix.field.StockInfo();
	
			case quickfix.field.TopNPrice.MSGTYPE:
				return new quickfix.field.TopNPrice();
	
			case quickfix.field.TopPriceOddLot.MSGTYPE:
				return new quickfix.field.TopPriceOddLot();
	
		}

		return new quickfix.field.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case quickfix.field.TopNPrice.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoTopPrice.FIELD:
					return new quickfix.field.TopNPrice.NoTopPrice();
	
				}
				break;
	
		}

		return null;
	}
}
