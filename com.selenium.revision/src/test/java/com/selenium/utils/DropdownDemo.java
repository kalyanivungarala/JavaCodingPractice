package com.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebElement dropdownElement = driver.findElement(By.id("dropDownId"));
		Select select = new Select(dropdownElement);
		//select options by three methods
		select.selectByIndex(0);
		select.selectByValue("value"); //U.S.
		select.selectByVisibleText("textDisplayedonScreen"); //UnitedStesOfAmerica
	}

}
