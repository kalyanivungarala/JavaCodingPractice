package com.selenium.revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.selenium.dev/");
		//driver.close();
		
		WebDriver ieDriver = new InternetExplorerDriver();
		ieDriver.get("https://www.selenium.dev/");
	}

}
