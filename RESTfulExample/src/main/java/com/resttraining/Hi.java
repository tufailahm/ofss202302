package com.resttraining;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class Hi {

	@Path(value = "msg")			//http://localhost:8080/RESTfulExample/rest/hello/msg
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String  hello() {
			return "Hi Anshul";
	}
	@Path(value = "product")			//http://localhost:8080/RESTfulExample/rest/hello/msg
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String  hi() {
			return "Hi Product App";
	}
}
