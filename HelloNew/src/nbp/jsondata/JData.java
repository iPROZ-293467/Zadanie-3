package nbp.jsondata;

public class JData {

	private String no ; 
	private String effectiveDate , bid, ask;
	
	public JData() {} 
	
	
	public JData(String number, String effectiveDate, String bid, String ask) {
		this.no = number;
		this.effectiveDate = effectiveDate;
		this.bid = bid;
		this.ask = ask;
	}



	public String getNumber() {
		return no;
	}

	public void setNumber(String number) {
		this.no = number;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}
	
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public double getBid() {
		return Double.parseDouble(bid);
	}
	public void setBid(String bid) {
		this.bid = bid;
	}

	public double getAsk() {
		return Double.parseDouble(ask);
	}
	public void setAsk(String ask) {
		this.ask = ask;
	} 
	
	
	

}