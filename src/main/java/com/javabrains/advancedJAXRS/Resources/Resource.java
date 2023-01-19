package com.javabrains.advancedJAXRS.Resources;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("{pathParam}/test")
public class Resource {
	@PathParam("pathParam") private String pathParam;
	@QueryParam("query") private String queryParam;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String welcome() {
		
		return "it works ! path used :" + pathParam + "  and Query used : "+ queryParam;
	}

}