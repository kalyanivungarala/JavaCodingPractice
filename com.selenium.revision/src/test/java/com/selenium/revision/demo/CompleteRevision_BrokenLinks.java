package com.selenium.revision.demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteRevision_BrokenLinks {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo");
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for (WebElement webElement : elements) {
			String url = webElement.getAttribute("href");
			System.out.println("URl is -------"+url);
			if (url == null || url.isEmpty()) {
				System.out.println("URl is empty");
				continue;
			}
			
			try {
				HttpURLConnection conn = (HttpURLConnection)(new URL(url).openConnection());
				conn.connect();
				if (conn.getResponseCode() >= 400) {
					System.out.println("Url is broken");
				}else 
					System.out.println("Url is valid");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		Thread.sleep(3000);

		
		driver.quit();
	}

}
