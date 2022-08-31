
package quickfix.field;

import quickfix.FieldNotFound;


public class DerivativesInfo extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "DI";
	

	public DerivativesInfo() {
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

	public void set(quickfix.field.SymbolID value) {
		setField(value);
	}

	public quickfix.field.SymbolID get(quickfix.field.SymbolID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SymbolID getSymbolID() throws FieldNotFound {
		return get(new quickfix.field.SymbolID());
	}

	public boolean isSet(quickfix.field.SymbolID field) {
		return isSetField(field);
	}

	public boolean isSetSymbolID() {
		return isSetField(15);
	}

	public void set(quickfix.field.Underlying value) {
		setField(value);
	}

	public quickfix.field.Underlying get(quickfix.field.Underlying value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Underlying getUnderlying() throws FieldNotFound {
		return get(new quickfix.field.Underlying());
	}

	public boolean isSet(quickfix.field.Underlying field) {
		return isSetField(field);
	}

	public boolean isSetUnderlying() {
		return isSetField(800);
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

	public void set(quickfix.field.TradeSesStatus value) {
		setField(value);
	}

	public quickfix.field.TradeSesStatus get(quickfix.field.TradeSesStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeSesStatus getTradeSesStatus() throws FieldNotFound {
		return get(new quickfix.field.TradeSesStatus());
	}

	public boolean isSet(quickfix.field.TradeSesStatus field) {
		return isSetField(field);
	}

	public boolean isSetTradeSesStatus() {
		return isSetField(340);
	}

	public void set(quickfix.field.SecurityTradingStatus value) {
		setField(value);
	}

	public quickfix.field.SecurityTradingStatus get(quickfix.field.SecurityTradingStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityTradingStatus getSecurityTradingStatus() throws FieldNotFound {
		return get(new quickfix.field.SecurityTradingStatus());
	}

	public boolean isSet(quickfix.field.SecurityTradingStatus field) {
		return isSetField(field);
	}

	public boolean isSetSecurityTradingStatus() {
		return isSetField(326);
	}

	public void set(quickfix.field.ListingStatus value) {
		setField(value);
	}

	public quickfix.field.ListingStatus get(quickfix.field.ListingStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ListingStatus getListingStatus() throws FieldNotFound {
		return get(new quickfix.field.ListingStatus());
	}

	public boolean isSet(quickfix.field.ListingStatus field) {
		return isSetField(field);
	}

	public boolean isSetListingStatus() {
		return isSetField(327);
	}

	public void set(quickfix.field.SecurityType value) {
		setField(value);
	}

	public quickfix.field.SecurityType get(quickfix.field.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityType getSecurityType() throws FieldNotFound {
		return get(new quickfix.field.SecurityType());
	}

	public boolean isSet(quickfix.field.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(quickfix.field.OpenInterest value) {
		setField(value);
	}

	public quickfix.field.OpenInterest get(quickfix.field.OpenInterest value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OpenInterest getOpenInterest() throws FieldNotFound {
		return get(new quickfix.field.OpenInterest());
	}

	public boolean isSet(quickfix.field.OpenInterest field) {
		return isSetField(field);
	}

	public boolean isSetOpenInterest() {
		return isSetField(801);
	}

	public void set(quickfix.field.OpenInterestChange value) {
		setField(value);
	}

	public quickfix.field.OpenInterestChange get(quickfix.field.OpenInterestChange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OpenInterestChange getOpenInterestChange() throws FieldNotFound {
		return get(new quickfix.field.OpenInterestChange());
	}

	public boolean isSet(quickfix.field.OpenInterestChange field) {
		return isSetField(field);
	}

	public boolean isSetOpenInterestChange() {
		return isSetField(8011);
	}

	public void set(quickfix.field.FirstTradingDate value) {
		setField(value);
	}

	public quickfix.field.FirstTradingDate get(quickfix.field.FirstTradingDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FirstTradingDate getFirstTradingDate() throws FieldNotFound {
		return get(new quickfix.field.FirstTradingDate());
	}

	public boolean isSet(quickfix.field.FirstTradingDate field) {
		return isSetField(field);
	}

	public boolean isSetFirstTradingDate() {
		return isSetField(802);
	}

	public void set(quickfix.field.LastTradingDate value) {
		setField(value);
	}

	public quickfix.field.LastTradingDate get(quickfix.field.LastTradingDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastTradingDate getLastTradingDate() throws FieldNotFound {
		return get(new quickfix.field.LastTradingDate());
	}

	public boolean isSet(quickfix.field.LastTradingDate field) {
		return isSetField(field);
	}

	public boolean isSetLastTradingDate() {
		return isSetField(803);
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

	public void set(quickfix.field.TotalBidQtty value) {
		setField(value);
	}

	public quickfix.field.TotalBidQtty get(quickfix.field.TotalBidQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotalBidQtty getTotalBidQtty() throws FieldNotFound {
		return get(new quickfix.field.TotalBidQtty());
	}

	public boolean isSet(quickfix.field.TotalBidQtty field) {
		return isSetField(field);
	}

	public boolean isSetTotalBidQtty() {
		return isSetField(134);
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

	public void set(quickfix.field.BasicPrice value) {
		setField(value);
	}

	public quickfix.field.BasicPrice get(quickfix.field.BasicPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BasicPrice getBasicPrice() throws FieldNotFound {
		return get(new quickfix.field.BasicPrice());
	}

	public boolean isSet(quickfix.field.BasicPrice field) {
		return isSetField(field);
	}

	public boolean isSetBasicPrice() {
		return isSetField(260);
	}

	public void set(quickfix.field.FloorPrice value) {
		setField(value);
	}

	public quickfix.field.FloorPrice get(quickfix.field.FloorPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FloorPrice getFloorPrice() throws FieldNotFound {
		return get(new quickfix.field.FloorPrice());
	}

	public boolean isSet(quickfix.field.FloorPrice field) {
		return isSetField(field);
	}

	public boolean isSetFloorPrice() {
		return isSetField(333);
	}

	public void set(quickfix.field.CeilingPrice value) {
		setField(value);
	}

	public quickfix.field.CeilingPrice get(quickfix.field.CeilingPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CeilingPrice getCeilingPrice() throws FieldNotFound {
		return get(new quickfix.field.CeilingPrice());
	}

	public boolean isSet(quickfix.field.CeilingPrice field) {
		return isSetField(field);
	}

	public boolean isSetCeilingPrice() {
		return isSetField(332);
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

	public void set(quickfix.field.PriorOpenPrice value) {
		setField(value);
	}

	public quickfix.field.PriorOpenPrice get(quickfix.field.PriorOpenPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriorOpenPrice getPriorOpenPrice() throws FieldNotFound {
		return get(new quickfix.field.PriorOpenPrice());
	}

	public boolean isSet(quickfix.field.PriorOpenPrice field) {
		return isSetField(field);
	}

	public boolean isSetPriorOpenPrice() {
		return isSetField(138);
	}

	public void set(quickfix.field.OpenQtty value) {
		setField(value);
	}

	public quickfix.field.OpenQtty get(quickfix.field.OpenQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OpenQtty getOpenQtty() throws FieldNotFound {
		return get(new quickfix.field.OpenQtty());
	}

	public boolean isSet(quickfix.field.OpenQtty field) {
		return isSetField(field);
	}

	public boolean isSetOpenQtty() {
		return isSetField(804);
	}

	public void set(quickfix.field.ClosePrice value) {
		setField(value);
	}

	public quickfix.field.ClosePrice get(quickfix.field.ClosePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClosePrice getClosePrice() throws FieldNotFound {
		return get(new quickfix.field.ClosePrice());
	}

	public boolean isSet(quickfix.field.ClosePrice field) {
		return isSetField(field);
	}

	public boolean isSetClosePrice() {
		return isSetField(139);
	}

	public void set(quickfix.field.PriorClosePrice value) {
		setField(value);
	}

	public quickfix.field.PriorClosePrice get(quickfix.field.PriorClosePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriorClosePrice getPriorClosePrice() throws FieldNotFound {
		return get(new quickfix.field.PriorClosePrice());
	}

	public boolean isSet(quickfix.field.PriorClosePrice field) {
		return isSetField(field);
	}

	public boolean isSetPriorClosePrice() {
		return isSetField(140);
	}

	public void set(quickfix.field.CloseQtty value) {
		setField(value);
	}

	public quickfix.field.CloseQtty get(quickfix.field.CloseQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CloseQtty getCloseQtty() throws FieldNotFound {
		return get(new quickfix.field.CloseQtty());
	}

	public boolean isSet(quickfix.field.CloseQtty field) {
		return isSetField(field);
	}

	public boolean isSetCloseQtty() {
		return isSetField(805);
	}

	public void set(quickfix.field.TotalVolumeTraded value) {
		setField(value);
	}

	public quickfix.field.TotalVolumeTraded get(quickfix.field.TotalVolumeTraded value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotalVolumeTraded getTotalVolumeTraded() throws FieldNotFound {
		return get(new quickfix.field.TotalVolumeTraded());
	}

	public boolean isSet(quickfix.field.TotalVolumeTraded field) {
		return isSetField(field);
	}

	public boolean isSetTotalVolumeTraded() {
		return isSetField(387);
	}

	public void set(quickfix.field.TotalValueTraded value) {
		setField(value);
	}

	public quickfix.field.TotalValueTraded get(quickfix.field.TotalValueTraded value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotalValueTraded getTotalValueTraded() throws FieldNotFound {
		return get(new quickfix.field.TotalValueTraded());
	}

	public boolean isSet(quickfix.field.TotalValueTraded field) {
		return isSetField(field);
	}

	public boolean isSetTotalValueTraded() {
		return isSetField(3871);
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

	public void set(quickfix.field.TradingUnit value) {
		setField(value);
	}

	public quickfix.field.TradingUnit get(quickfix.field.TradingUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradingUnit getTradingUnit() throws FieldNotFound {
		return get(new quickfix.field.TradingUnit());
	}

	public boolean isSet(quickfix.field.TradingUnit field) {
		return isSetField(field);
	}

	public boolean isSetTradingUnit() {
		return isSetField(400);
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

	public void set(quickfix.field.CurrentPrice value) {
		setField(value);
	}

	public quickfix.field.CurrentPrice get(quickfix.field.CurrentPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CurrentPrice getCurrentPrice() throws FieldNotFound {
		return get(new quickfix.field.CurrentPrice());
	}

	public boolean isSet(quickfix.field.CurrentPrice field) {
		return isSetField(field);
	}

	public boolean isSetCurrentPrice() {
		return isSetField(255);
	}

	public void set(quickfix.field.CurrentQtty value) {
		setField(value);
	}

	public quickfix.field.CurrentQtty get(quickfix.field.CurrentQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CurrentQtty getCurrentQtty() throws FieldNotFound {
		return get(new quickfix.field.CurrentQtty());
	}

	public boolean isSet(quickfix.field.CurrentQtty field) {
		return isSetField(field);
	}

	public boolean isSetCurrentQtty() {
		return isSetField(2551);
	}

	public void set(quickfix.field.HighestPrice value) {
		setField(value);
	}

	public quickfix.field.HighestPrice get(quickfix.field.HighestPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HighestPrice getHighestPrice() throws FieldNotFound {
		return get(new quickfix.field.HighestPrice());
	}

	public boolean isSet(quickfix.field.HighestPrice field) {
		return isSetField(field);
	}

	public boolean isSetHighestPrice() {
		return isSetField(266);
	}

	public void set(quickfix.field.LowestPrice value) {
		setField(value);
	}

	public quickfix.field.LowestPrice get(quickfix.field.LowestPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LowestPrice getLowestPrice() throws FieldNotFound {
		return get(new quickfix.field.LowestPrice());
	}

	public boolean isSet(quickfix.field.LowestPrice field) {
		return isSetField(field);
	}

	public boolean isSetLowestPrice() {
		return isSetField(2661);
	}

	public void set(quickfix.field.MatchValue value) {
		setField(value);
	}

	public quickfix.field.MatchValue get(quickfix.field.MatchValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MatchValue getMatchValue() throws FieldNotFound {
		return get(new quickfix.field.MatchValue());
	}

	public boolean isSet(quickfix.field.MatchValue field) {
		return isSetField(field);
	}

	public boolean isSetMatchValue() {
		return isSetField(310);
	}

	public void set(quickfix.field.OfferCount value) {
		setField(value);
	}

	public quickfix.field.OfferCount get(quickfix.field.OfferCount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OfferCount getOfferCount() throws FieldNotFound {
		return get(new quickfix.field.OfferCount());
	}

	public boolean isSet(quickfix.field.OfferCount field) {
		return isSetField(field);
	}

	public boolean isSetOfferCount() {
		return isSetField(320);
	}

	public void set(quickfix.field.BidCount value) {
		setField(value);
	}

	public quickfix.field.BidCount get(quickfix.field.BidCount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BidCount getBidCount() throws FieldNotFound {
		return get(new quickfix.field.BidCount());
	}

	public boolean isSet(quickfix.field.BidCount field) {
		return isSetField(field);
	}

	public boolean isSetBidCount() {
		return isSetField(321);
	}

	public void set(quickfix.field.NM_TotalTradedQtty value) {
		setField(value);
	}

	public quickfix.field.NM_TotalTradedQtty get(quickfix.field.NM_TotalTradedQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NM_TotalTradedQtty getNM_TotalTradedQtty() throws FieldNotFound {
		return get(new quickfix.field.NM_TotalTradedQtty());
	}

	public boolean isSet(quickfix.field.NM_TotalTradedQtty field) {
		return isSetField(field);
	}

	public boolean isSetNM_TotalTradedQtty() {
		return isSetField(391);
	}

	public void set(quickfix.field.NM_TotalTradedValue value) {
		setField(value);
	}

	public quickfix.field.NM_TotalTradedValue get(quickfix.field.NM_TotalTradedValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NM_TotalTradedValue getNM_TotalTradedValue() throws FieldNotFound {
		return get(new quickfix.field.NM_TotalTradedValue());
	}

	public boolean isSet(quickfix.field.NM_TotalTradedValue field) {
		return isSetField(field);
	}

	public boolean isSetNM_TotalTradedValue() {
		return isSetField(392);
	}

	public void set(quickfix.field.PT_MatchQtty value) {
		setField(value);
	}

	public quickfix.field.PT_MatchQtty get(quickfix.field.PT_MatchQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PT_MatchQtty getPT_MatchQtty() throws FieldNotFound {
		return get(new quickfix.field.PT_MatchQtty());
	}

	public boolean isSet(quickfix.field.PT_MatchQtty field) {
		return isSetField(field);
	}

	public boolean isSetPT_MatchQtty() {
		return isSetField(393);
	}

	public void set(quickfix.field.PT_MatchPrice value) {
		setField(value);
	}

	public quickfix.field.PT_MatchPrice get(quickfix.field.PT_MatchPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PT_MatchPrice getPT_MatchPrice() throws FieldNotFound {
		return get(new quickfix.field.PT_MatchPrice());
	}

	public boolean isSet(quickfix.field.PT_MatchPrice field) {
		return isSetField(field);
	}

	public boolean isSetPT_MatchPrice() {
		return isSetField(3931);
	}

	public void set(quickfix.field.PT_TotalTradedQtty value) {
		setField(value);
	}

	public quickfix.field.PT_TotalTradedQtty get(quickfix.field.PT_TotalTradedQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PT_TotalTradedQtty getPT_TotalTradedQtty() throws FieldNotFound {
		return get(new quickfix.field.PT_TotalTradedQtty());
	}

	public boolean isSet(quickfix.field.PT_TotalTradedQtty field) {
		return isSetField(field);
	}

	public boolean isSetPT_TotalTradedQtty() {
		return isSetField(394);
	}

	public void set(quickfix.field.PT_TotalTradedValue value) {
		setField(value);
	}

	public quickfix.field.PT_TotalTradedValue get(quickfix.field.PT_TotalTradedValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PT_TotalTradedValue getPT_TotalTradedValue() throws FieldNotFound {
		return get(new quickfix.field.PT_TotalTradedValue());
	}

	public boolean isSet(quickfix.field.PT_TotalTradedValue field) {
		return isSetField(field);
	}

	public boolean isSetPT_TotalTradedValue() {
		return isSetField(9141);
	}

	public void set(quickfix.field.NM_BuyForeignQtty value) {
		setField(value);
	}

	public quickfix.field.NM_BuyForeignQtty get(quickfix.field.NM_BuyForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NM_BuyForeignQtty getNM_BuyForeignQtty() throws FieldNotFound {
		return get(new quickfix.field.NM_BuyForeignQtty());
	}

	public boolean isSet(quickfix.field.NM_BuyForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetNM_BuyForeignQtty() {
		return isSetField(814);
	}

	public void set(quickfix.field.PT_BuyForeignQtty value) {
		setField(value);
	}

	public quickfix.field.PT_BuyForeignQtty get(quickfix.field.PT_BuyForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PT_BuyForeignQtty getPT_BuyForeignQtty() throws FieldNotFound {
		return get(new quickfix.field.PT_BuyForeignQtty());
	}

	public boolean isSet(quickfix.field.PT_BuyForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetPT_BuyForeignQtty() {
		return isSetField(815);
	}

	public void set(quickfix.field.BuyForeignQtty value) {
		setField(value);
	}

	public quickfix.field.BuyForeignQtty get(quickfix.field.BuyForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BuyForeignQtty getBuyForeignQtty() throws FieldNotFound {
		return get(new quickfix.field.BuyForeignQtty());
	}

	public boolean isSet(quickfix.field.BuyForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetBuyForeignQtty() {
		return isSetField(397);
	}

	public void set(quickfix.field.NM_BuyForeignValue value) {
		setField(value);
	}

	public quickfix.field.NM_BuyForeignValue get(quickfix.field.NM_BuyForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NM_BuyForeignValue getNM_BuyForeignValue() throws FieldNotFound {
		return get(new quickfix.field.NM_BuyForeignValue());
	}

	public boolean isSet(quickfix.field.NM_BuyForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetNM_BuyForeignValue() {
		return isSetField(8141);
	}

	public void set(quickfix.field.PT_BuyForeignValue value) {
		setField(value);
	}

	public quickfix.field.PT_BuyForeignValue get(quickfix.field.PT_BuyForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PT_BuyForeignValue getPT_BuyForeignValue() throws FieldNotFound {
		return get(new quickfix.field.PT_BuyForeignValue());
	}

	public boolean isSet(quickfix.field.PT_BuyForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetPT_BuyForeignValue() {
		return isSetField(8151);
	}

	public void set(quickfix.field.BuyForeignValue value) {
		setField(value);
	}

	public quickfix.field.BuyForeignValue get(quickfix.field.BuyForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BuyForeignValue getBuyForeignValue() throws FieldNotFound {
		return get(new quickfix.field.BuyForeignValue());
	}

	public boolean isSet(quickfix.field.BuyForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetBuyForeignValue() {
		return isSetField(3971);
	}

	public void set(quickfix.field.NM_SellForeignQtty value) {
		setField(value);
	}

	public quickfix.field.NM_SellForeignQtty get(quickfix.field.NM_SellForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NM_SellForeignQtty getNM_SellForeignQtty() throws FieldNotFound {
		return get(new quickfix.field.NM_SellForeignQtty());
	}

	public boolean isSet(quickfix.field.NM_SellForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetNM_SellForeignQtty() {
		return isSetField(816);
	}

	public void set(quickfix.field.PT_SellForeignQtty value) {
		setField(value);
	}

	public quickfix.field.PT_SellForeignQtty get(quickfix.field.PT_SellForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PT_SellForeignQtty getPT_SellForeignQtty() throws FieldNotFound {
		return get(new quickfix.field.PT_SellForeignQtty());
	}

	public boolean isSet(quickfix.field.PT_SellForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetPT_SellForeignQtty() {
		return isSetField(817);
	}

	public void set(quickfix.field.SellForeignQtty value) {
		setField(value);
	}

	public quickfix.field.SellForeignQtty get(quickfix.field.SellForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SellForeignQtty getSellForeignQtty() throws FieldNotFound {
		return get(new quickfix.field.SellForeignQtty());
	}

	public boolean isSet(quickfix.field.SellForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetSellForeignQtty() {
		return isSetField(398);
	}

	public void set(quickfix.field.NM_SellForeignValue value) {
		setField(value);
	}

	public quickfix.field.NM_SellForeignValue get(quickfix.field.NM_SellForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NM_SellForeignValue getNM_SellForeignValue() throws FieldNotFound {
		return get(new quickfix.field.NM_SellForeignValue());
	}

	public boolean isSet(quickfix.field.NM_SellForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetNM_SellForeignValue() {
		return isSetField(8161);
	}

	public void set(quickfix.field.PT_SellForeignValue value) {
		setField(value);
	}

	public quickfix.field.PT_SellForeignValue get(quickfix.field.PT_SellForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PT_SellForeignValue getPT_SellForeignValue() throws FieldNotFound {
		return get(new quickfix.field.PT_SellForeignValue());
	}

	public boolean isSet(quickfix.field.PT_SellForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetPT_SellForeignValue() {
		return isSetField(8171);
	}

	public void set(quickfix.field.SellForeignValue value) {
		setField(value);
	}

	public quickfix.field.SellForeignValue get(quickfix.field.SellForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SellForeignValue getSellForeignValue() throws FieldNotFound {
		return get(new quickfix.field.SellForeignValue());
	}

	public boolean isSet(quickfix.field.SellForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetSellForeignValue() {
		return isSetField(3981);
	}

}
