
package quickfix.field;

import quickfix.FieldNotFound;


public class Logon extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "A";
	

	public Logon() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public Logon(quickfix.field.Status status) {
		this();
		setField(status);
	}
	
	public void set(quickfix.field.Username value) {
		setField(value);
	}

	public quickfix.field.Username get(quickfix.field.Username value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Username getUsername() throws FieldNotFound {
		return get(new quickfix.field.Username());
	}

	public boolean isSet(quickfix.field.Username field) {
		return isSetField(field);
	}

	public boolean isSetUsername() {
		return isSetField(553);
	}

	public void set(quickfix.field.Password value) {
		setField(value);
	}

	public quickfix.field.Password get(quickfix.field.Password value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Password getPassword() throws FieldNotFound {
		return get(new quickfix.field.Password());
	}

	public boolean isSet(quickfix.field.Password field) {
		return isSetField(field);
	}

	public boolean isSetPassword() {
		return isSetField(554);
	}

	public void set(quickfix.field.Status value) {
		setField(value);
	}

	public quickfix.field.Status get(quickfix.field.Status value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Status getStatus() throws FieldNotFound {
		return get(new quickfix.field.Status());
	}

	public boolean isSet(quickfix.field.Status field) {
		return isSetField(field);
	}

	public boolean isSetStatus() {
		return isSetField(552);
	}

}
