package com.selenium.utils;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AssertionFailureBuilder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		WebDriver driver = new ChromeDriver();
		TakesScreenshot takesScreenshot = (TakesScreenshot)(driver);
		File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C://Users//admin/Desktop/Kalyani/JMeterInputFiles");
		try {
			FileHandler.copy(screenshotAs, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assert
	}
	
	

}
