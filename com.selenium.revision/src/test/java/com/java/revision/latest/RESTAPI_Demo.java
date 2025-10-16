package com.java.revision.latest;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RESTAPI_Demo {

	public static void main(String[] args) {

		postOrder();
	}

	private static void postOrder() {
		//baseURI can be set in the base class setUp() method for all testcases.
		//baseURI = "";
		String postOrdersUrl = "https://www.amazon.com";

		//We can also verify for StatusLine, time taken (< 3 sec etc), Contetnt Type.
		given().when().post(postOrdersUrl).contentType(ContentType.JSON).body("").
		statusCode(200).
		log();

		Response response2 = given().when().get(postOrdersUrl);

		System.out.println("Response of the api is "+response2.asPrettyString());

	}

}
