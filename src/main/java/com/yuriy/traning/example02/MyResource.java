package com.yuriy.traning.example02;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test02")
@Singleton
public class MyResource {
	
	private int count;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod() {
		count = count + 1;
		return "It works! This method was called " + count + " time(s)";
	}
	
}
