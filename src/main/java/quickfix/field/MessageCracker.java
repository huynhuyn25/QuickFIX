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

import quickfix.*;
import quickfix.field.*;

public class MessageCracker {

	/**
	 * Callback for quickfix.Message message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(quickfix.Message message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}

	/**
	 * Callback for FIXHeartbeat message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Heartbeat message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXLogon message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Logon message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXAutionMatch message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(AutionMatch message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXBoardInfo message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(BoardInfo message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXDerivativesInfo message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(DerivativesInfo message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXIndex message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Index message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXStock message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Stock message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXStockInfo message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(StockInfo message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXTopNPrice message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TopNPrice message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXTopPriceOddLot message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TopPriceOddLot message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	public void crack(quickfix.Message message, SessionID sessionID)
			throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {
		crack44((Message) message, sessionID);
	}

	/**
	 * Cracker method for 44 messages.
	 *
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void crack44(Message message, SessionID sessionID)
			throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {

		String type = message.getHeader().getString(MsgType.FIELD);

		if (type.equals(Heartbeat.MSGTYPE))
			onMessage((Heartbeat)message, sessionID);
		else if (type.equals(Logon.MSGTYPE))
			onMessage((Logon)message, sessionID);
		else if (type.equals(AutionMatch.MSGTYPE))
			onMessage((AutionMatch)message, sessionID);
		else if (type.equals(BoardInfo.MSGTYPE))
			onMessage((BoardInfo)message, sessionID);
		else if (type.equals(DerivativesInfo.MSGTYPE))
			onMessage((DerivativesInfo)message, sessionID);
		else if (type.equals(Index.MSGTYPE))
			onMessage((Index)message, sessionID);
		else if (type.equals(Stock.MSGTYPE))
			onMessage((Stock)message, sessionID);
		else if (type.equals(StockInfo.MSGTYPE))
			onMessage((StockInfo)message, sessionID);
		else if (type.equals(TopNPrice.MSGTYPE))
			onMessage((TopNPrice)message, sessionID);
		else if (type.equals(TopPriceOddLot.MSGTYPE))
			onMessage((TopPriceOddLot)message, sessionID);
		else
			onMessage(message, sessionID);
	}

}
