package nbp.jsondata;


public class JResults {

	private String table, currency, code ; 
	private String  mediumAsk, mediumBid ; 

	public JResults() {}
	
	public JResults(JRatings ratings) {
		table = ratings.getTable() ;
		currency = ratings.getCurrency() ; 
		code = ratings.getCode() ; 
		mediumBid = Double.toString(ratings.midBid()) ; 
		mediumAsk = Double.toString(ratings.midAsk()) ; 
	}

	public String getMidBid() {
		return mediumBid;
	}
	public void setMidBid(String midBid) {
		this.mediumBid = midBid;
	}
	public String getMidAsk() {
		return mediumAsk;
	}
	public void setMidAsk(String midAsk) {
		this.mediumAsk = midAsk;
	}
	
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
