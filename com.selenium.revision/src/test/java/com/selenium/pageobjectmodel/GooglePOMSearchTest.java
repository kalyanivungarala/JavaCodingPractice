package com.selenium.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePOMSearchTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		setSearchText();
	}

	private static void setSearchText() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		GoogleSearchPageObjects obj = new GoogleSearchPageObjects(driver);
		obj.setSearchText("Jeevithamastu");
		obj.enterSearchText();
	}

}
