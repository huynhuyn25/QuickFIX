
package quickfix.field;

import quickfix.FieldNotFound;


public class BoardInfo extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BI";
	

	public BoardInfo() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.field.BoardCode value) {
		setField(value);
	}

	public quickfix.field.BoardCode get(quickfix.field.BoardCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BoardCode getBoardCode() throws FieldNotFound {
		return get(new quickfix.field.BoardCode());
	}

	public boolean isSet(quickfix.field.BoardCode field) {
		return isSetField(field);
	}

	public boolean isSetBoardCode() {
		return isSetField(425);
	}

	public void set(quickfix.field.BoardStatus value) {
		setField(value);
	}

	public quickfix.field.BoardStatus get(quickfix.field.BoardStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BoardStatus getBoardStatus() throws FieldNotFound {
		return get(new quickfix.field.BoardStatus());
	}

	public boolean isSet(quickfix.field.BoardStatus field) {
		return isSetField(field);
	}

	public boolean isSetBoardStatus() {
		return isSetField(426);
	}

	public void set(quickfix.field.TradingSessionID value) {
		setField(value);
	}

	public quickfix.field.TradingSessionID get(quickfix.field.TradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradingSessionID getTradingSessionID() throws FieldNotFound {
		return get(new quickfix.field.TradingSessionID());
	}

	public boolean isSet(quickfix.field.TradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionID() {
		return isSetField(336);
	}

	public void set(quickfix.field.TradSecStatus value) {
		setField(value);
	}

	public quickfix.field.TradSecStatus get(quickfix.field.TradSecStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSecStatus getTradSecStatus() throws FieldNotFound {
		return get(new quickfix.field.TradSecStatus());
	}

	public boolean isSet(quickfix.field.TradSecStatus field) {
		return isSetField(field);
	}

	public boolean isSetTradSecStatus() {
		return isSetField(340);
	}

	public void set(quickfix.field.Name value) {
		setField(value);
	}

	public quickfix.field.Name get(quickfix.field.Name value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Name getName() throws FieldNotFound {
		return get(new quickfix.field.Name());
	}

	public boolean isSet(quickfix.field.Name field) {
		return isSetField(field);
	}

	public boolean isSetName() {
		return isSetField(421);
	}

	public void set(quickfix.field.Shortname value) {
		setField(value);
	}

	public quickfix.field.Shortname get(quickfix.field.Shortname value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Shortname getShortname() throws FieldNotFound {
		return get(new quickfix.field.Shortname());
	}

	public boolean isSet(quickfix.field.Shortname field) {
		return isSetField(field);
	}

	public boolean isSetShortname() {
		return isSetField(422);
	}

	public void set(quickfix.field.TradingDate value) {
		setField(value);
	}

	public quickfix.field.TradingDate get(quickfix.field.TradingDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradingDate getTradingDate() throws FieldNotFound {
		return get(new quickfix.field.TradingDate());
	}

	public boolean isSet(quickfix.field.TradingDate field) {
		return isSetField(field);
	}

	public boolean isSetTradingDate() {
		return isSetField(388);
	}

	public void set(quickfix.field.Time value) {
		setField(value);
	}

	public quickfix.field.Time get(quickfix.field.Time value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Time getTime() throws FieldNotFound {
		return get(new quickfix.field.Time());
	}

	public boolean isSet(quickfix.field.Time field) {
		return isSetField(field);
	}

	public boolean isSetTime() {
		return isSetField(399);
	}

	public void set(quickfix.field.TotalTrade value) {
		setField(value);
	}

	public quickfix.field.TotalTrade get(quickfix.field.TotalTrade value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotalTrade getTotalTrade() throws FieldNotFound {
		return get(new quickfix.field.TotalTrade());
	}

	public boolean isSet(quickfix.field.TotalTrade field) {
		return isSetField(field);
	}

	public boolean isSetTotalTrade() {
		return isSetField(270);
	}

	public void set(quickfix.field.TotalStock value) {
		setField(value);
	}

	public quickfix.field.TotalStock get(quickfix.field.TotalStock value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotalStock getTotalStock() throws FieldNotFound {
		return get(new quickfix.field.TotalStock());
	}

	public boolean isSet(quickfix.field.TotalStock field) {
		return isSetField(field);
	}

	public boolean isSetTotalStock() {
		return isSetField(22);
	}

	public void set(quickfix.field.numSymbolAdvances value) {
		setField(value);
	}

	public quickfix.field.numSymbolAdvances get(quickfix.field.numSymbolAdvances value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.numSymbolAdvances getnumSymbolAdvances() throws FieldNotFound {
		return get(new quickfix.field.numSymbolAdvances());
	}

	public boolean isSet(quickfix.field.numSymbolAdvances field) {
		return isSetField(field);
	}

	public boolean isSetnumSymbolAdvances() {
		return isSetField(251);
	}

	public void set(quickfix.field.numSymbolNochange value) {
		setField(value);
	}

	public quickfix.field.numSymbolNochange get(quickfix.field.numSymbolNochange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.numSymbolNochange getnumSymbolNochange() throws FieldNotFound {
		return get(new quickfix.field.numSymbolNochange());
	}

	public boolean isSet(quickfix.field.numSymbolNochange field) {
		return isSetField(field);
	}

	public boolean isSetnumSymbolNochange() {
		return isSetField(252);
	}

	public void set(quickfix.field.numSymbolDeclines value) {
		setField(value);
	}

	public quickfix.field.numSymbolDeclines get(quickfix.field.numSymbolDeclines value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.numSymbolDeclines getnumSymbolDeclines() throws FieldNotFound {
		return get(new quickfix.field.numSymbolDeclines());
	}

	public boolean isSet(quickfix.field.numSymbolDeclines field) {
		return isSetField(field);
	}

	public boolean isSetnumSymbolDeclines() {
		return isSetField(253);
	}

	public void set(quickfix.field.DateNo value) {
		setField(value);
	}

	public quickfix.field.DateNo get(quickfix.field.DateNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DateNo getDateNo() throws FieldNotFound {
		return get(new quickfix.field.DateNo());
	}

	public boolean isSet(quickfix.field.DateNo field) {
		return isSetField(field);
	}

	public boolean isSetDateNo() {
		return isSetField(17);
	}

	public void set(quickfix.field.totalNormalTradedQttyRd value) {
		setField(value);
	}

	public quickfix.field.totalNormalTradedQttyRd get(quickfix.field.totalNormalTradedQttyRd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.totalNormalTradedQttyRd gettotalNormalTradedQttyRd() throws FieldNotFound {
		return get(new quickfix.field.totalNormalTradedQttyRd());
	}

	public boolean isSet(quickfix.field.totalNormalTradedQttyRd field) {
		return isSetField(field);
	}

	public boolean isSettotalNormalTradedQttyRd() {
		return isSetField(220);
	}

	public void set(quickfix.field.totalNormalTradedValueRd value) {
		setField(value);
	}

	public quickfix.field.totalNormalTradedValueRd get(quickfix.field.totalNormalTradedValueRd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.totalNormalTradedValueRd gettotalNormalTradedValueRd() throws FieldNotFound {
		return get(new quickfix.field.totalNormalTradedValueRd());
	}

	public boolean isSet(quickfix.field.totalNormalTradedValueRd field) {
		return isSetField(field);
	}

	public boolean isSettotalNormalTradedValueRd() {
		return isSetField(221);
	}

	public void set(quickfix.field.totalNormalTradedQttyOd value) {
		setField(value);
	}

	public quickfix.field.totalNormalTradedQttyOd get(quickfix.field.totalNormalTradedQttyOd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.totalNormalTradedQttyOd gettotalNormalTradedQttyOd() throws FieldNotFound {
		return get(new quickfix.field.totalNormalTradedQttyOd());
	}

	public boolean isSet(quickfix.field.totalNormalTradedQttyOd field) {
		return isSetField(field);
	}

	public boolean isSettotalNormalTradedQttyOd() {
		return isSetField(210);
	}

	public void set(quickfix.field.totalNormalTradedValueOd value) {
		setField(value);
	}

	public quickfix.field.totalNormalTradedValueOd get(quickfix.field.totalNormalTradedValueOd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.totalNormalTradedValueOd gettotalNormalTradedValueOd() throws FieldNotFound {
		return get(new quickfix.field.totalNormalTradedValueOd());
	}

	public boolean isSet(quickfix.field.totalNormalTradedValueOd field) {
		return isSetField(field);
	}

	public boolean isSettotalNormalTradedValueOd() {
		return isSetField(211);
	}

	public void set(quickfix.field.totalPTTradedQtty value) {
		setField(value);
	}

	public quickfix.field.totalPTTradedQtty get(quickfix.field.totalPTTradedQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.totalPTTradedQtty gettotalPTTradedQtty() throws FieldNotFound {
		return get(new quickfix.field.totalPTTradedQtty());
	}

	public boolean isSet(quickfix.field.totalPTTradedQtty field) {
		return isSetField(field);
	}

	public boolean isSettotalPTTradedQtty() {
		return isSetField(240);
	}

	public void set(quickfix.field.totalPTTradedValue value) {
		setField(value);
	}

	public quickfix.field.totalPTTradedValue get(quickfix.field.totalPTTradedValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.totalPTTradedValue gettotalPTTradedValue() throws FieldNotFound {
		return get(new quickfix.field.totalPTTradedValue());
	}

	public boolean isSet(quickfix.field.totalPTTradedValue field) {
		return isSetField(field);
	}

	public boolean isSettotalPTTradedValue() {
		return isSetField(241);
	}

	public void set(quickfix.field.MarketCode value) {
		setField(value);
	}

	public quickfix.field.MarketCode get(quickfix.field.MarketCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MarketCode getMarketCode() throws FieldNotFound {
		return get(new quickfix.field.MarketCode());
	}

	public boolean isSet(quickfix.field.MarketCode field) {
		return isSetField(field);
	}

	public boolean isSetMarketCode() {
		return isSetField(341);
	}

}
