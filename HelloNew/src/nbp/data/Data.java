package nbp.data;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Rate")
public class Data {

	private String number ; 
	private String effectiveDate ; 
	private double bid ; 
	private double ask ;
	
	public Data() {} 
	
	
	public Data(String number, String effectiveDate, double bid, double ask) {
		this.number = number;
		this.effectiveDate = effectiveDate;
		this.bid = bid;
		this.ask = ask;
	}


	@XmlElement (name = "No")
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	@XmlElement (name = "EffectiveDate")
	public String getEffectiveDate() {
		return effectiveDate;
	}
	
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	@XmlElement (name = "Bid")
	public double getBid() {
		return bid;
	}
	public void setBid(double bid) {
		this.bid = bid;
	}
	@XmlElement (name = "Ask")
	public double getAsk() {
		return ask;
	}
	public void setAsk(double ask) {
		this.ask = ask;
	} 
	
	
	

}
