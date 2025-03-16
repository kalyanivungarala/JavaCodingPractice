package com.selenium.utils;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendTextDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebElement element = driver.findElement(By.id("q"));
		//For entering text
		element.sendKeys("Entering the values");
		WebElement link = driver.findElement(By.linkText("Today's deals"));
		//for clicking or navigating to the page
		link.click();
		
		//Get Title
		String title = driver.getTitle();
	}

}
