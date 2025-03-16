package com.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NthChildDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//parent-element/*"));
	}

}
