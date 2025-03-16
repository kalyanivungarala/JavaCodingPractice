package com.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebElement browse = driver.findElement(By.id("uploadButtonId"));
		browse.sendKeys("<path to Upload file location>");
		browse.sendKeys("C://Users//admin//Desktop//Kalyani/PreparationPlan.txt");
	}

}
