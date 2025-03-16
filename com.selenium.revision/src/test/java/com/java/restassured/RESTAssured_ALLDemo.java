package com.java.restassured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class RESTAssured_ALLDemo {

	//@Test
	void testGET() {
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		body("data.id[2]", equalTo(9)).
		statusCode(200);
		//		log().all();
	}



	//	@Test
	void testPOST() {
		JSONObject request = new JSONObject();
		request.put("name", "Kalyani");
		request.put("job", "Software Engineer");

		given().
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201).
		log().all();
	}

	//@Test
	void testPUT() {
		JSONObject request = new JSONObject();
		request.put("name", "Kalyani222333");
		request.put("job", "Software Engineer");

		given().
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users/2").
		then().
		statusCode(201).
		log().all();
	}
	
	@Test
	void testDelete() {
		given().
			when().
			delete("https://reqres.in/api/users/2").
			then().
			statusCode(204);
	}


}
