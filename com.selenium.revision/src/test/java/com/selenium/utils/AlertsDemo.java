package com.selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
	}

}
