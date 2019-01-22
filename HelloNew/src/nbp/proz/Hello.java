package nbp.proz;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.*;
import nbp.data.*;
// klasa g³ówna implementuj¹ca polecenia HTTP
// jest adnotowana @Path
// jest publiczna
// ma domyœlny i publiczny konstruktor 
@Path("{table}/{code}/{topcount}")
public class Hello {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(@PathParam("table") String table , @PathParam("code") String code,
			@PathParam("topcount") String topcount) {
		return Operator.getResultXML(table, code, topcount) ;
		
		
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML) 
	public String getHTML(@PathParam("table") String table , @PathParam("code") String code,
			@PathParam("topcount") String topcount) { 
		
		return "Nothing yet" ; 
	}
	
	@GET
	@Produces(MediaType.TEXT_XML) 
	public String getXML(@PathParam("table") String table , @PathParam("code") String code,
			@PathParam("topcount") String topcount) { 
	return Operator.getResultXML(table, code, topcount) ;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON) 
	public String getJSON(@PathParam("table") String table , @PathParam("code") String code,
			@PathParam("topcount") String topcount) { 
		return Operator.getResultJSON(table, code, topcount) ; 
	
	}
	
	
	
	
}
