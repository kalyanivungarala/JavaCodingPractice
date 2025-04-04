package com.selenium.revision.latest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectLastDropDown {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("");
		Select select = new Select(driver.findElement(By.id("dropdownElement")));
		List<WebElement> options = select.getOptions();
		options.get(options.size()-1).click();
	}

}
