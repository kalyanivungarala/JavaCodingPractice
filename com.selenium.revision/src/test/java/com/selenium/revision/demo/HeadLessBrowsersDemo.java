package com.selenium.revision.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowsersDemo {
	
	public void runHeadLessBrowsers() {
		//For Chrome
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(options);
		
		//For Edge
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--headless");
		EdgeDriver edgeDriver = new EdgeDriver();
		
		//For Firefox
		FirefoxOptions fireFoxOptions = new FirefoxOptions();
		fireFoxOptions.addArguments("--headless");
		FirefoxDriver firefoxDriver = new FirefoxDriver(fireFoxOptions);
		
		
	}

}
