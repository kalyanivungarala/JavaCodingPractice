package com.practice.salesforce;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	//AAA
	@BeforeClass
	public void setUP() {
		RestAssured.baseURI = "https://google.com";
		RequestSpecification requestSpec = new RequestSpecBuilder().setAccept(ContentType.JSON).build();
		//																	.setAuth(null);
		
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("").addHeader("Authorization", "Bearer token").build();

	}

	@AfterClass
	public void tearDown() {

	}


}
