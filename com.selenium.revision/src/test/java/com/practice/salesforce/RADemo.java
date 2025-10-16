package com.practice.salesforce;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class RADemo {
	
	public static void main(String[] args) {
		ValidatableResponse response = RestAssured.given().when().get().then();
		
		response.jsonPath().assertEquals("data.id",Matchers.has);
	}

}
