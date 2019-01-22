package nbp.marshmallow;
import javax.xml.bind.* ; 
import com.google.gson.*;
import java.util.*;
import nbp.data.*;
import nbp.jsondata.*;
import java.io.* ; 
import javax.xml.transform.stream.StreamSource; 
public class Unmarshmaller {
	public static Ratings unmarshalling(String xmlAnswer) {
		try {
			JAXBContext jContext = JAXBContext.newInstance(Ratings.class, Data.class);
			Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
			StringReader reader = new StringReader(xmlAnswer);
			Ratings rates = (Ratings) unmarshallerObj.unmarshal(new StreamSource(reader));
	    	return rates;
	} catch (JAXBException e) {
		Ratings r = new Ratings() ; 
		r.setCurrency(e.getLocalizedMessage());
		r.setCode("XXX");
		r.setTable("Z");
		ArrayList<Data>ratings = new ArrayList<Data>() ; 
		ratings.add(new Data("None","None",0,0)) ;
		ratings.add(new Data("Empty" , "Empty", 0 ,0 )) ; 
		r.setRatings(ratings);
		return r  ;	
	}
		
	}
	public static JRatings jsonToClass(String jsonAnswer) {
		try {
			Gson gson = new GsonBuilder().create()  ;  
			JRatings ratings = gson.fromJson(jsonAnswer, JRatings.class) ; 
			return ratings;  
		}
		catch (Exception e) {
			JRatings r = new JRatings() ; 
			r.setCurrency(e.getLocalizedMessage());
			r.setCode("XXX");
			r.setTable("Z");
			ArrayList<JData>ratings = new ArrayList<JData>() ; 
			ratings.add(new JData("None","None","0","0")) ;
			ratings.add(new JData("Empty" , "Empty", "0" ,"0" )) ; 
			r.setRatings(ratings);
			return r  ;	
			
		}
	}
}
