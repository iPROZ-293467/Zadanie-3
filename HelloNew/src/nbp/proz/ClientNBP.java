package nbp.proz;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;
import java.net.URI;

public class ClientNBP {
	public static String getRatings(String table, String code, String topcount) {
		String sourceUrl = new String("http://api.nbp.pl/api/exchangerates/rates/" + table + "/" + code + "/last/" 
					+ topcount + "/");
		Client client = ClientBuilder.newClient();
		URI uri = URI.create(sourceUrl);
		WebTarget webTarget = client.target(uri);

		String response = webTarget.request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
		String xmlAnswer = webTarget.request().accept(MediaType.TEXT_XML).get(String.class);
		if (response.contains("OK") )return xmlAnswer;
		else return "Couldn't get it";	
	}
	public static String getRatingsJSON(String table, String code, String topcount) {
		String sourceUrl = new String("http://api.nbp.pl/api/exchangerates/rates/" + table + "/" + code + "/last/" 
					+ topcount + "/");
		Client client = ClientBuilder.newClient();
		URI uri = URI.create(sourceUrl);
		WebTarget webTarget = client.target(uri);

		String response = webTarget.request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
		String JSONAnswer = webTarget.request().accept(MediaType.APPLICATION_JSON).get(String.class);
		if (response.contains("OK") )return JSONAnswer;
		else return "Couldn't get it";
		
	}
}
