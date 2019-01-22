package nbp.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "Results")
public class Results {

	private String midBid, midAsk ; 
	private String table, currency, code ; 
	
	public Results() {}
	public Results(Ratings ratings) {
		table = ratings.getTable() ;
		currency = ratings.getCurrency() ; 
		code = ratings.getCode() ; 
		midBid = Double.toString(ratings.midBid()) ; 
		midAsk = Double.toString(ratings.midAsk()) ; 
	}
	@XmlElement(name = "MediumBid")
	public String getMidBid() {
		return midBid;
	}
	public void setMidBid(String midBid) {
		this.midBid = midBid;
	}
	@XmlElement(name = "MediumAsk")
	public String getMidAsk() {
		return midAsk;
	}
	public void setMidAsk(String midAsk) {
		this.midAsk = midAsk;
	}
	@XmlElement(name = "Table")
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	@XmlElement(name = "Currency")
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@XmlElement(name = "Code")
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
