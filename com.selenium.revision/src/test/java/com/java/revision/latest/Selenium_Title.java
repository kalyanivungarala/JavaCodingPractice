package com.java.revision.latest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Title {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https:google.com");
		driver.manage().window().maximize();

		getTile(driver);
		enterText(driver);

		driver.close();
	}

	private static void enterText(WebDriver driver) {
		if (driver != null) {
			WebElement serachTextBox = driver.findElement(By.id("APjFqb"));
			serachTextBox.sendKeys("Selenium Automation");
			
			WebElement searchBtn = driver.findElement(By.name("btnk"));
			searchBtn.sendKeys(Keys.RETURN);
		}		
	}

	private static void getTile(WebDriver driver) {
		if (driver != null) {
			String title = driver.getTitle();
			System.out.println("Title of the page is -- "+title);
		}
	}

}
