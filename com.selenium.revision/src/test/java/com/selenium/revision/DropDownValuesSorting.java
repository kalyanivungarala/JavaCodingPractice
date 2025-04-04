package com.selenium.revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownValuesSorting {


	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		Select select = new Select(driver.findElement(By.xpath("//li[@id='Select Country']")));
		List<WebElement> options = select.getOptions();

		List<String> dropDownValues = new ArrayList<String>();
		for (WebElement selectedDropDownValue : options) {
			dropDownValues.add(selectedDropDownValue.getText());
		}
		
		System.out.println("Before Sorting "+dropDownValues);
		Collections.sort(dropDownValues);
		System.out.println("After Sorting "+dropDownValues);
	}
}
