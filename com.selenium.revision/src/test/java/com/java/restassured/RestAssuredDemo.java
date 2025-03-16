package com.java.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredDemo {
	
	@Test
	void test_01() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
//		System.out.println(response.getStatusLine());
//		System.out.println(response.getContentType());
//		System.out.println(response.getHeader("content-type"));
//		System.out.println(response.getBody());
//		System.out.println(response.asPrettyString());
//		System.out.println(response.asString());
	}
	
	@Test
	void test_02() {
		given().
				get("https://reqres.in/api/users?page=2").
		then().
		      statusCode(200).
		      body("data.id[0]", equalTo(7));
	}

}
