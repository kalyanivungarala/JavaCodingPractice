package com.selenium.revision.demo;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompleteRevisionDemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//driver.get("https://tutorialsninja.com/demo");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement alertButton = driver.findElement(By.id("alert1"));
		jse.executeScript("arguments[0].click()",alertButton);
		Thread.sleep(3000);

		
		driver.quit();
	}

}
