package com.selenium.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {

	By text_searchBox = By.name("q");
	By button_searchBox = By.name("btnk");
	private static WebDriver driver = null;

	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public  void setSearchText(String searchText) {
		driver.findElement(text_searchBox).sendKeys(searchText);
	}

	public  void enterSearchText() {
		driver.findElement(button_searchBox).sendKeys(Keys.RETURN);
	}
}
