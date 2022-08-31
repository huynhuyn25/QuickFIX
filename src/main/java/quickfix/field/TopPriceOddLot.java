
package quickfix.field;

import quickfix.FieldNotFound;


public class TopPriceOddLot extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "PO";
	

	public TopPriceOddLot() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.field.Symbol value) {
		setField(value);
	}

	public quickfix.field.Symbol get(quickfix.field.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Symbol getSymbol() throws FieldNotFound {
		return get(new quickfix.field.Symbol());
	}

	public boolean isSet(quickfix.field.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
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

	public void set(quickfix.field.BestBidPrice value) {
		setField(value);
	}

	public quickfix.field.BestBidPrice get(quickfix.field.BestBidPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BestBidPrice getBestBidPrice() throws FieldNotFound {
		return get(new quickfix.field.BestBidPrice());
	}

	public boolean isSet(quickfix.field.BestBidPrice field) {
		return isSetField(field);
	}

	public boolean isSetBestBidPrice() {
		return isSetField(132);
	}

	public void set(quickfix.field.BestBidQtty value) {
		setField(value);
	}

	public quickfix.field.BestBidQtty get(quickfix.field.BestBidQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BestBidQtty getBestBidQtty() throws FieldNotFound {
		return get(new quickfix.field.BestBidQtty());
	}

	public boolean isSet(quickfix.field.BestBidQtty field) {
		return isSetField(field);
	}

	public boolean isSetBestBidQtty() {
		return isSetField(1321);
	}

	public void set(quickfix.field.BestOfferPrice value) {
		setField(value);
	}

	public quickfix.field.BestOfferPrice get(quickfix.field.BestOfferPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BestOfferPrice getBestOfferPrice() throws FieldNotFound {
		return get(new quickfix.field.BestOfferPrice());
	}

	public boolean isSet(quickfix.field.BestOfferPrice field) {
		return isSetField(field);
	}

	public boolean isSetBestOfferPrice() {
		return isSetField(133);
	}

	public void set(quickfix.field.BestOfferQtty value) {
		setField(value);
	}

	public quickfix.field.BestOfferQtty get(quickfix.field.BestOfferQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BestOfferQtty getBestOfferQtty() throws FieldNotFound {
		return get(new quickfix.field.BestOfferQtty());
	}

	public boolean isSet(quickfix.field.BestOfferQtty field) {
		return isSetField(field);
	}

	public boolean isSetBestOfferQtty() {
		return isSetField(1331);
	}

	public void set(quickfix.field.TotalBidQtty_OD value) {
		setField(value);
	}

	public quickfix.field.TotalBidQtty_OD get(quickfix.field.TotalBidQtty_OD value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotalBidQtty_OD getTotalBidQtty_OD() throws FieldNotFound {
		return get(new quickfix.field.TotalBidQtty_OD());
	}

	public boolean isSet(quickfix.field.TotalBidQtty_OD field) {
		return isSetField(field);
	}

	public boolean isSetTotalBidQtty_OD() {
		return isSetField(1341);
	}

	public void set(quickfix.field.TotalOfferQtty value) {
		setField(value);
	}

	public quickfix.field.TotalOfferQtty get(quickfix.field.TotalOfferQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotalOfferQtty getTotalOfferQtty() throws FieldNotFound {
		return get(new quickfix.field.TotalOfferQtty());
	}

	public boolean isSet(quickfix.field.TotalOfferQtty field) {
		return isSetField(field);
	}

	public boolean isSetTotalOfferQtty() {
		return isSetField(135);
	}

	public void set(quickfix.field.TotalOfferQtty_OD value) {
		setField(value);
	}

	public quickfix.field.TotalOfferQtty_OD get(quickfix.field.TotalOfferQtty_OD value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotalOfferQtty_OD getTotalOfferQtty_OD() throws FieldNotFound {
		return get(new quickfix.field.TotalOfferQtty_OD());
	}

	public boolean isSet(quickfix.field.TotalOfferQtty_OD field) {
		return isSetField(field);
	}

	public boolean isSetTotalOfferQtty_OD() {
		return isSetField(1351);
	}

	public void set(quickfix.field.OfferPrice_2 value) {
		setField(value);
	}

	public quickfix.field.OfferPrice_2 get(quickfix.field.OfferPrice_2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OfferPrice_2 getOfferPrice_2() throws FieldNotFound {
		return get(new quickfix.field.OfferPrice_2());
	}

	public boolean isSet(quickfix.field.OfferPrice_2 field) {
		return isSetField(field);
	}

	public boolean isSetOfferPrice_2() {
		return isSetField(136);
	}

	public void set(quickfix.field.OfferQtty_2 value) {
		setField(value);
	}

	public quickfix.field.OfferQtty_2 get(quickfix.field.OfferQtty_2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OfferQtty_2 getOfferQtty_2() throws FieldNotFound {
		return get(new quickfix.field.OfferQtty_2());
	}

	public boolean isSet(quickfix.field.OfferQtty_2 field) {
		return isSetField(field);
	}

	public boolean isSetOfferQtty_2() {
		return isSetField(1361);
	}

	public void set(quickfix.field.OpenPrice value) {
		setField(value);
	}

	public quickfix.field.OpenPrice get(quickfix.field.OpenPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OpenPrice getOpenPrice() throws FieldNotFound {
		return get(new quickfix.field.OpenPrice());
	}

	public boolean isSet(quickfix.field.OpenPrice field) {
		return isSetField(field);
	}

	public boolean isSetOpenPrice() {
		return isSetField(137);
	}

	public void set(quickfix.field.OfferQtty_3 value) {
		setField(value);
	}

	public quickfix.field.OfferQtty_3 get(quickfix.field.OfferQtty_3 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OfferQtty_3 getOfferQtty_3() throws FieldNotFound {
		return get(new quickfix.field.OfferQtty_3());
	}

	public boolean isSet(quickfix.field.OfferQtty_3 field) {
		return isSetField(field);
	}

	public boolean isSetOfferQtty_3() {
		return isSetField(1371);
	}

}
