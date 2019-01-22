package nbp.data;
import javax.xml.bind.annotation.*;
import java.util.* ; 

@XmlRootElement (name = "ExchangeRatesSeries")
public class Ratings {

	private String table, currency, code ; 
	List <Data> ratings = new ArrayList<Data>() ;
	
	public Ratings() {}
	
	public Ratings(String table, String currency, String code) {
		this.table = table;
		this.currency = currency;
		this.code = code;
	}
	@XmlElement (name = "Table")
	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}
	@XmlElement (name = "Currency")
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@XmlElement (name = "Code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	@XmlElementWrapper (name = "Rates")
	@XmlElement (name = "Rate")
	public List<Data> getRatings() {
		return ratings;
	}

	public void setRatings(List<Data> ratings) {
		this.ratings = ratings;
	} 
	public double midBid() {
		double sum, elements , mid ; 
		int i ; 
		sum = 0 ; 
		elements = ratings.size() ; 
		for (i = 0 ; i <elements ; i++) {
			sum = sum + ratings.get(i).getBid() ; 
		}
		mid = sum/elements ; 
		return mid ; 
	}
	public double midAsk() {
		double sum, mid ; 
		int elements ; 
		int i ; 
		sum = 0 ; 
		elements = ratings.size() ; 
		for (i = 0 ; i <elements ; i++) {
			sum = sum + ratings.get(i).getAsk() ; 
		}
		mid = sum/elements ; 
		return mid ; 
	}
}
