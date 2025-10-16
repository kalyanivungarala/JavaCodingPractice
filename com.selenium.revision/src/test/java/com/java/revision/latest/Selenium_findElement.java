package com.java.revision.latest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_findElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https:google.com");
		driver.manage().window().maximize();

		findElementById(driver);

		driver.close();
	}

	private static void findElementById(WebDriver driver) {
		if (driver != null) {
			WebElement serachTextBox = driver.findElement(By.id("APjFqb"));
			serachTextBox.sendKeys("Selenium Automation");
			
		}		
	}

}
