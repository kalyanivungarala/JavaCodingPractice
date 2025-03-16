package com.selenium.utils;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File screenshotAs2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	}

}
