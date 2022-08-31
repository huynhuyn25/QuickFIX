
package quickfix.field;

import quickfix.FieldNotFound;


public class Stock extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "S";
	

	public Stock() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.field.IDIndex value) {
		setField(value);
	}

	public quickfix.field.IDIndex get(quickfix.field.IDIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IDIndex getIDIndex() throws FieldNotFound {
		return get(new quickfix.field.IDIndex());
	}

	public boolean isSet(quickfix.field.IDIndex field) {
		return isSetField(field);
	}

	public boolean isSetIDIndex() {
		return isSetField(1);
	}

	public void set(quickfix.field.IndexCode value) {
		setField(value);
	}

	public quickfix.field.IndexCode get(quickfix.field.IndexCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IndexCode getIndexCode() throws FieldNotFound {
		return get(new quickfix.field.IndexCode());
	}

	public boolean isSet(quickfix.field.IndexCode field) {
		return isSetField(field);
	}

	public boolean isSetIndexCode() {
		return isSetField(2);
	}

	public void set(quickfix.field.IDSymbol value) {
		setField(value);
	}

	public quickfix.field.IDSymbol get(quickfix.field.IDSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IDSymbol getIDSymbol() throws FieldNotFound {
		return get(new quickfix.field.IDSymbol());
	}

	public boolean isSet(quickfix.field.IDSymbol field) {
		return isSetField(field);
	}

	public boolean isSetIDSymbol() {
		return isSetField(15);
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

	public void set(quickfix.field.TotalQtty value) {
		setField(value);
	}

	public quickfix.field.TotalQtty get(quickfix.field.TotalQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotalQtty getTotalQtty() throws FieldNotFound {
		return get(new quickfix.field.TotalQtty());
	}

	public boolean isSet(quickfix.field.TotalQtty field) {
		return isSetField(field);
	}

	public boolean isSetTotalQtty() {
		return isSetField(7);
	}

	public void set(quickfix.field.Weighted value) {
		setField(value);
	}

	public quickfix.field.Weighted get(quickfix.field.Weighted value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Weighted getWeighted() throws FieldNotFound {
		return get(new quickfix.field.Weighted());
	}

	public boolean isSet(quickfix.field.Weighted field) {
		return isSetField(field);
	}

	public boolean isSetWeighted() {
		return isSetField(12);
	}

	public void set(quickfix.field.AddDate value) {
		setField(value);
	}

	public quickfix.field.AddDate get(quickfix.field.AddDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AddDate getAddDate() throws FieldNotFound {
		return get(new quickfix.field.AddDate());
	}

	public boolean isSet(quickfix.field.AddDate field) {
		return isSetField(field);
	}

	public boolean isSetAddDate() {
		return isSetField(28);
	}

}
