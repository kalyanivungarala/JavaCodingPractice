package com.selenium.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	WebDriver driver;
	
	private static WebElement searchTextBox(WebDriver driver) {
		WebElement element = driver.findElement(By.name("q"));
		return element;
		
	}
	
	private static WebElement searchButton(WebDriver driver) {
		WebElement element = driver.findElement(By.id("btnk"));
		return element;
		
	}

}
