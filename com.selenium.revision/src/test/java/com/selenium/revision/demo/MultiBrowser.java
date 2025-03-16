package com.selenium.revision.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {

	WebDriver driver = null;

	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {
		System.out.println("In Setup method");
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}else if (browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
	}

	@Test
	public void test1() {

		System.out.println("*********************"+driver.getTitle());
		driver.get("https://www.google.co.in/");

	}


	@AfterTest
	public void tearDown() {
		driver.close();

	}

}
