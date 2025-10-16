package com.practice.salesforce;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

import java.io.File;
import java.time.Duration;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SyntaxCheck {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'sucess')]")));
	}


	@DataProvider(name = "loginData")
	public Object[][] loginData(){ 
		return new Object[][]{{"user1","pwd1"},{"user2","pwd2"}}; 

	}

	@Test (dataProvider = "loginData")
	public void testLogin(String username, String password){
		RestAssured.given().when().get("https://google.com").then().statusCode(200).body("data.id", Matchers.hasItems(1,2,3));
	}
	
	@Test
	public void testAuth(){
	RestAssured.given().auth().basic("username","password").when().get("");
	RestAssured.given().header("Authorizarion","Bearer "+token).when().get("");
	
	given().auth().oauth2("accesstoke");
	
	given().
		baseUri("https://google.com").
	when().
		get("").
	then().
		statusCode(200).
		body("name",equalTo("John"));

	}
	
	public void testQueryAndPAthPAram() {
		given().
		headers("Authorization","Bearer "+"token").
		pathParam("userID",121).
		queryParam("status","Active").
	when().
		get("/users/{userID}").
	then().
		statusCode(200).and().
//		body("data.id[0]",equalTo(1).
		body("data.email", hasItem("kalyani.vungarala@gmail.com"));
				
	}
	
	public void testUpload() {
		given().
		multiPart(new File("file123.json")).
		when().
		    post("/upload").
		    then().body(JsonSchemaValidator.);
		
	}
}

