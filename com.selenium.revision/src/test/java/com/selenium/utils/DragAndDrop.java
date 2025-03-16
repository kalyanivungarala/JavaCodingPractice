package com.selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public void test1() {
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		actions.dragAndDrop(null, null).perform();
		
	}

}
