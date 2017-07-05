package com.yuriy.traning.example01;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType; 

@Path("test01")
public class MyResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod() {
		return "It works!";
	}
	
} 
