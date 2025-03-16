package com.selenium.revision;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	public static void main(String[] args) {
		googeleSearchTest();
	}

	private static void googeleSearchTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Automation Step By Step");
		WebElement searchBtn = driver.findElement(By.name("btnk"));
		searchBtn.sendKeys(Keys.RETURN);
		driver.close();
		
	}

}
