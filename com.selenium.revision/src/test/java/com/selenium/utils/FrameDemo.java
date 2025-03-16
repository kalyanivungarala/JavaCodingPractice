	package com.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.switchTo().frame(0);
		driver.switchTo().frame("");
		driver.switchTo().frame(driver.findElement(By.tagName("tag")));
	}

}
