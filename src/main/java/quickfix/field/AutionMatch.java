
package quickfix.field;

import quickfix.FieldNotFound;


public class AutionMatch extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "EP";
	

	public AutionMatch() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.field.ActionType value) {
		setField(value);
	}

	public quickfix.field.ActionType get(quickfix.field.ActionType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ActionType getActionType() throws FieldNotFound {
		return get(new quickfix.field.ActionType());
	}

	public boolean isSet(quickfix.field.ActionType field) {
		return isSetField(field);
	}

	public boolean isSetActionType() {
		return isSetField(33);
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

	public void set(quickfix.field.MatchPrice value) {
		setField(value);
	}

	public quickfix.field.MatchPrice get(quickfix.field.MatchPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MatchPrice getMatchPrice() throws FieldNotFound {
		return get(new quickfix.field.MatchPrice());
	}

	public boolean isSet(quickfix.field.MatchPrice field) {
		return isSetField(field);
	}

	public boolean isSetMatchPrice() {
		return isSetField(31);
	}

	public void set(quickfix.field.MatchQtty value) {
		setField(value);
	}

	public quickfix.field.MatchQtty get(quickfix.field.MatchQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MatchQtty getMatchQtty() throws FieldNotFound {
		return get(new quickfix.field.MatchQtty());
	}

	public boolean isSet(quickfix.field.MatchQtty field) {
		return isSetField(field);
	}

	public boolean isSetMatchQtty() {
		return isSetField(32);
	}

}
