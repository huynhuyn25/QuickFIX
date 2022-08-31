
package quickfix.field;

import quickfix.FieldNotFound;


public class Index extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "I";
	

	public Index() {
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

	public void set(quickfix.field.Value value) {
		setField(value);
	}

	public quickfix.field.Value get(quickfix.field.Value value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Value getValue() throws FieldNotFound {
		return get(new quickfix.field.Value());
	}

	public boolean isSet(quickfix.field.Value field) {
		return isSetField(field);
	}

	public boolean isSetValue() {
		return isSetField(3);
	}

	public void set(quickfix.field.CalTime value) {
		setField(value);
	}

	public quickfix.field.CalTime get(quickfix.field.CalTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CalTime getCalTime() throws FieldNotFound {
		return get(new quickfix.field.CalTime());
	}

	public boolean isSet(quickfix.field.CalTime field) {
		return isSetField(field);
	}

	public boolean isSetCalTime() {
		return isSetField(4);
	}

	public void set(quickfix.field.Change value) {
		setField(value);
	}

	public quickfix.field.Change get(quickfix.field.Change value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Change getChange() throws FieldNotFound {
		return get(new quickfix.field.Change());
	}

	public boolean isSet(quickfix.field.Change field) {
		return isSetField(field);
	}

	public boolean isSetChange() {
		return isSetField(5);
	}

	public void set(quickfix.field.RatioChange value) {
		setField(value);
	}

	public quickfix.field.RatioChange get(quickfix.field.RatioChange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RatioChange getRatioChange() throws FieldNotFound {
		return get(new quickfix.field.RatioChange());
	}

	public boolean isSet(quickfix.field.RatioChange field) {
		return isSetField(field);
	}

	public boolean isSetRatioChange() {
		return isSetField(6);
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

	public void set(quickfix.field.TotalValue value) {
		setField(value);
	}

	public quickfix.field.TotalValue get(quickfix.field.TotalValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotalValue getTotalValue() throws FieldNotFound {
		return get(new quickfix.field.TotalValue());
	}

	public boolean isSet(quickfix.field.TotalValue field) {
		return isSetField(field);
	}

	public boolean isSetTotalValue() {
		return isSetField(14);
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

	public void set(quickfix.field.CurrentStatus value) {
		setField(value);
	}

	public quickfix.field.CurrentStatus get(quickfix.field.CurrentStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CurrentStatus getCurrentStatus() throws FieldNotFound {
		return get(new quickfix.field.CurrentStatus());
	}

	public boolean isSet(quickfix.field.CurrentStatus field) {
		return isSetField(field);
	}

	public boolean isSetCurrentStatus() {
		return isSetField(21);
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

	public void set(quickfix.field.PriorIndexVal value) {
		setField(value);
	}

	public quickfix.field.PriorIndexVal get(quickfix.field.PriorIndexVal value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriorIndexVal getPriorIndexVal() throws FieldNotFound {
		return get(new quickfix.field.PriorIndexVal());
	}

	public boolean isSet(quickfix.field.PriorIndexVal field) {
		return isSetField(field);
	}

	public boolean isSetPriorIndexVal() {
		return isSetField(23);
	}

	public void set(quickfix.field.HighestIndex value) {
		setField(value);
	}

	public quickfix.field.HighestIndex get(quickfix.field.HighestIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HighestIndex getHighestIndex() throws FieldNotFound {
		return get(new quickfix.field.HighestIndex());
	}

	public boolean isSet(quickfix.field.HighestIndex field) {
		return isSetField(field);
	}

	public boolean isSetHighestIndex() {
		return isSetField(24);
	}

	public void set(quickfix.field.LowestIndex value) {
		setField(value);
	}

	public quickfix.field.LowestIndex get(quickfix.field.LowestIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LowestIndex getLowestIndex() throws FieldNotFound {
		return get(new quickfix.field.LowestIndex());
	}

	public boolean isSet(quickfix.field.LowestIndex field) {
		return isSetField(field);
	}

	public boolean isSetLowestIndex() {
		return isSetField(25);
	}

	public void set(quickfix.field.CloseIndex value) {
		setField(value);
	}

	public quickfix.field.CloseIndex get(quickfix.field.CloseIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CloseIndex getCloseIndex() throws FieldNotFound {
		return get(new quickfix.field.CloseIndex());
	}

	public boolean isSet(quickfix.field.CloseIndex field) {
		return isSetField(field);
	}

	public boolean isSetCloseIndex() {
		return isSetField(26);
	}

	public void set(quickfix.field.TypeIndex value) {
		setField(value);
	}

	public quickfix.field.TypeIndex get(quickfix.field.TypeIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TypeIndex getTypeIndex() throws FieldNotFound {
		return get(new quickfix.field.TypeIndex());
	}

	public boolean isSet(quickfix.field.TypeIndex field) {
		return isSetField(field);
	}

	public boolean isSetTypeIndex() {
		return isSetField(27);
	}

	public void set(quickfix.field.IndexName value) {
		setField(value);
	}

	public quickfix.field.IndexName get(quickfix.field.IndexName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IndexName getIndexName() throws FieldNotFound {
		return get(new quickfix.field.IndexName());
	}

	public boolean isSet(quickfix.field.IndexName field) {
		return isSetField(field);
	}

	public boolean isSetIndexName() {
		return isSetField(18);
	}

}
