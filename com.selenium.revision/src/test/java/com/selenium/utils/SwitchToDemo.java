package com.selenium.utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);
		
		//Window Handles
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandleIdentifier : windowHandles) {
			driver.switchTo().window(windowHandleIdentifier);
		}
	}

}
