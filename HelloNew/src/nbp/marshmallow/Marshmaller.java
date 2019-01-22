package nbp.marshmallow;
import javax.xml.bind.* ; 
import nbp.data.*;
import java.io.* ; 
import java.nio.file.*;
import com.google.gson.*;
import nbp.jsondata.*;

public class Marshmaller {

    public static String marshalling(Results ratings) {
    	
    	try
		{
			File file = new File ("results.txt");
		    JAXBContext jContext = JAXBContext.newInstance(Results.class);
		    Marshaller marshallObj = jContext.createMarshaller();
		    marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    marshallObj.marshal(ratings, file);
		    if ( file.exists() )
		    {
		    	String content = new String ( Files.readAllBytes( Paths.get("results.txt") ) );
			    file.delete();
			    return content;
		    }
		    else
		    	return "Unsuccesfull marshalling";
		}
		catch ( Exception e)
		{
			return "Something went wrong, sorry.";
		}
    	
    }
    public static String classToJson(JResults ratings) {
    	try {
    		Gson gson = new GsonBuilder().create() ;
    		String result = gson.toJson(ratings) ;
    		return result  ;
    	}
    	catch (Exception e) {
    		return e.getLocalizedMessage() ; 
    	}
    }
}
