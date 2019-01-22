package nbp.jsondata;
import javax.xml.bind.annotation.*;
import java.util.* ; 


public class JRatings {

	private String table, currency, code ; 
	List <JData> rates = new ArrayList<JData>() ;
	
	public JRatings() {}
	
	public JRatings(String table, String currency, String code) {
		this.table = table;
		this.currency = currency;
		this.code = code;
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

	public List<JData> getRatings() {
		return rates;
	}

	public void setRatings(List<JData> ratings) {
		this.rates = ratings;
	} 
	public double midBid() {
		double sum, elements , mid ; 
		int i ; 
		sum = 0 ; 
		elements = rates.size() ; 
		for (i = 0 ; i <elements ; i++) {
			sum = sum + rates.get(i).getBid() ; 
		}
		mid = sum/elements ; 
		return mid ; 
	}
	public double midAsk() {
		double sum, mid ; 
		int elements ; 
		int i ; 
		sum = 0 ; 
		elements = rates.size() ; 
		for (i = 0 ; i <elements ; i++) {
			sum = sum + rates.get(i).getAsk() ; 
		}
		mid = sum/elements ; 
		return mid ; 
	}
}