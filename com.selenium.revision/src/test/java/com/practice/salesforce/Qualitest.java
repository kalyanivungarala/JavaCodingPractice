package com.practice.salesforce;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapper;

public class Qualitest {
	
	public static void main(String[] args) {
		
		String str = "Kal$%$45yani#$#44";
		String modString =  "";
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if (Character.isAlphabetic(c)) {
				modString = modString+c;
			}
		}
		System.out.println(modString);
		
	}
	//Arrange
	//Act
	//Assert
	
	@Test
	public void testGetAPI() {
		RestAssured.given().
					when().get("").
					then().statusCode(200);
		
//		ObjectMapper obj = new ObjectMapper("data.json",Employee.class)
	}

}
