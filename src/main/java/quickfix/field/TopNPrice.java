
package quickfix.field;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TopNPrice extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "TP";
	

	public TopNPrice() {
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

	public void set(quickfix.field.NoTopPrice value) {
		setField(value);
	}

	public quickfix.field.NoTopPrice get(quickfix.field.NoTopPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoTopPrice getNoTopPrice() throws FieldNotFound {
		return get(new quickfix.field.NoTopPrice());
	}

	public boolean isSet(quickfix.field.NoTopPrice field) {
		return isSetField(field);
	}

	public boolean isSetNoTopPrice() {
		return isSetField(555);
	}

	public static class NoTopPrice extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {556, 132, 1321, 133, 1331, 0};

		public NoTopPrice() {
			super(555, 556, ORDER);
		}
		
	public void set(quickfix.field.NumTopPrice value) {
		setField(value);
	}

	public quickfix.field.NumTopPrice get(quickfix.field.NumTopPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NumTopPrice getNumTopPrice() throws FieldNotFound {
		return get(new quickfix.field.NumTopPrice());
	}

	public boolean isSet(quickfix.field.NumTopPrice field) {
		return isSetField(field);
	}

	public boolean isSetNumTopPrice() {
		return isSetField(556);
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

	}

}
