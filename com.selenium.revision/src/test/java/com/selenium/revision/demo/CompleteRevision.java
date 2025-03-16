package com.selenium.revision.demo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompleteRevision {
	
	public static void main(String[] args) throws InterruptedException {
		//From Video 11 started
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com");
		System.out.println("Able to launch the url sucessfully");
		
		
		//************************************************************//
		
		//Implicit is a global wait, once specified in automation script applicable equally to all elements and it's a dynamic wait.
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("dropbtn")).click();
//		driver.findElement(By.linkText("Facebook")).click();
		
		//2.Explicit wait : It will wait for a specific web element.
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
//		WebElement timerButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
//		timerButton.click();
		

		//2.Fluent wait : It is an advanced version of FluentWait. Polling time can be customized in the Fluent wait.
//		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).
//								withTimeout(Duration.ofSeconds(30)).
//								pollingEvery(Duration.ofSeconds(1)).
//										ignoring(NoSuchElementException.class);
		
		
		
		//Enter text into searchBox without using SendKeys method- use JavascriptExecutor
//		WebElement searchBoxElement = driver.findElement(By.className("searchBox"));
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0] value='iMac'", searchBoxElement);
		
		//Clear the text inside textbox fields using webDriver clear.
		WebElement textboxEement = driver.findElement(By.id("textbox1"));
		textboxEement.clear();
		
		//Get attribute value of an element using getAttribute method.
		WebElement textbox1 = driver.findElement(By.id("textbox1"));
		String attributeValue = textbox1.getAttribute("value");
		System.out.println("Attribute value : "+attributeValue);
		driver.quit();
		

		//Press Enter Key using Selenium  webDriver KEYS class
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@value='Login']")).sendKeys(Keys.ENTER);
		
		//How to pause execution using Selenium WebDriver.
		//Using Java Thread.sleep or wait but it shld in synchronized block.
		
		synchronized (driver) {
			driver.wait(3000);
		}
		

		//Alternative to driver.get() is driver.navigate.to
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		
		//Different navigation commands in selenium webdriver
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		//getCurrentURl - fetch the current page url
		driver.get("https://tutorialsninja.com/demo");
		
		WebElement macBookElement = driver.findElement(By.linkText("MacBook"));
		Thread.sleep(3000);
		macBookElement.click();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url : "+currentUrl);
		
		Thread.sleep(3000);
		
		//Delete all cookies
		driver.manage().deleteAllCookies();
		
		//5 different ways to refresh the page
		driver.get("https://tutorialsninja.com/demo");
		Thread.sleep(3000);
		//Way1 using refresh method
		driver.navigate().refresh();
		//Way2 using navigate to method
		driver.navigate().to("https://tutorialsninja.com/demo");
		//Way3 using get method
		driver.get(driver.getCurrentUrl());
		//Way 4 using Keys.F5 method
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.F5).build().perform();
		
		//Way5 using JavaScriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.location.reload();");
		
		//Handle hidden elements - using JAvascriptExecutor - otherwise well get ElementNotVisible or
		//ElementNotInteractableException
		JavascriptExecutor jse_hidden = (JavascriptExecutor)driver;
		jse_hidden.executeScript("document.getElementById('hidden-box').value='Arun Motoori '");
		
		//How to find broken links - 
		//1.First get anchor tags, get 'href' attribute value, check if is null or empty, then create a
		//HttpConnection obj with url and check its reponse code.
		//If Response code is 4XX or 5XX then they are broken links.
		//Refer CompleteRevision_BrokenLinks class
		
		//How to resd JavaScript variable
		JavascriptExecutor jseVar = (JavascriptExecutor)driver;
		@Nullable
		String executeScript = (String)jseVar.executeScript("return document.title");
		System.out.println("Title of the page is :"+executeScript);
		
		//JavaScriptExecutor - Predefined interface in selenium webdriver
		//Uses - To alert, for scroll and click
		driver.get("https://omayo.blogspot.com/");
		JavascriptExecutor jseAlert = (JavascriptExecutor)driver;
		jseAlert.executeScript("alert('Alert By Kalyani')");
		//For scrolling-
		jseAlert.executeScript("window.scrollBy(0,600)");
		
		//For clciking -
		WebElement alertButton = driver.findElement(By.id("alert1"));
		jse.executeScript("arguments[0].click()",alertButton);
		
		
		//************************************************************//
		System.out.println("Able to complete the tests sucessfully");
		
		driver.quit();
		
	}

}
