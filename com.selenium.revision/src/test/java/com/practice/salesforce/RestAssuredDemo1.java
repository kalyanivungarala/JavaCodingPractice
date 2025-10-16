package com.practice.salesforce;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class RestAssuredDemo1 extends BaseClass implements IRetryAnalyzer{
	
	@Test
	public void testGetEndPoint()  {
		int maxNumberOfAttempts = 3;
		RestAssured.given().when().get("").then().statusCode(200);
		
	}

	@Override
	public boolean retry(ITestResult result) {
		ValidatableResponse response = RestAssured.given().when().get("").then();
		response.statusCode(0)
		
		int maxNumberOfAttempts = 3;
		while(maxNumberOfAttempts > 0) {
			
			maxNumberOfAttempts--;
		}
		return false;
	}
	
	

}
