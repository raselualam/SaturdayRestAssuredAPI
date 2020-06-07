package com.talentech.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetAllEmployeeRecords {
	
	@Test
	public void GetAllEmployeeRecord(){
		
		//Getting API HTTP response using RestAssurd
		
		Response resp = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		
		//Getting Status Code & Validating 
		
		int statusCode = resp.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
		
		//Getting the response body
		
		String responseBody = resp.asString();
		
		//Printing Status Code & Response body 
		
		System.out.println("Status Code ::: " + statusCode);
		System.out.println("Response Body ::: " + responseBody);
		
	}
	

}
