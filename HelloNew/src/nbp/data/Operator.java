package nbp.data;
import nbp.marshmallow.*;
import nbp.proz.*;
import nbp.jsondata.*;
public class Operator {
	
	public static String getResultXML(String table , String code ,String topcount) {
		
		String answer = ClientNBP.getRatings(table, code, topcount);  
		Ratings ratings = Unmarshmaller.unmarshalling(answer) ;
		Results rates = new Results(ratings) ; 
		String result = Marshmaller.marshalling(rates);
		//String result = "Medium Ask: " + Double.toString(rates.getMidAsk()) + " Medium Bid: " + 
			//	Double.toString(rates.getMidBid()) ; 
		return result ; 
	}
	public static String getResultJSON(String table, String code, String topcount) {
		String answer = ClientNBP.getRatingsJSON(table, code, topcount) ; 
		JRatings ratings = Unmarshmaller.jsonToClass(answer) ;
		JResults rates = new JResults(ratings) ; 
		//rates.setMidAsk(Double.toString(ratings.midAsk()));
		//rates.setMidBid(Double.toString(ratings.midBid()));
		String result = Marshmaller.classToJson(rates); 

		return result ; 
	}

}
