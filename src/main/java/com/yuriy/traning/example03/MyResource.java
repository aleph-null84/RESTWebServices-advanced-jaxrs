package com.yuriy.traning.example03;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("{pathParam}/test03")
public class MyResource {

	@PathParam("pathParam")
	private String pathParamExample;
	
	@QueryParam("query")
	private String queryParamExample;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod() {
		return "It works! \nPath param used " + pathParamExample + " \nand Query param used " + queryParamExample;
	}

}