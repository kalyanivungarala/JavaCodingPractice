package com.selenium.utils;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowserWindowSizeDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//Set Bowser Window size - Maximize, Minimize and Set Specific Size.
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().setSize(new Dimension(1000, 400));
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			
		}
		windowHandles.size();
	}

}
