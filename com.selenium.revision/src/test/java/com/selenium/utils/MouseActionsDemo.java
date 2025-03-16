package com.selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDemo {
	
	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		Actions actions = new Actions(driver);
		actions.click();
		actions.contextClick(); //Right click
		actions.doubleClick();
		actions.dragAndDrop();
		actions.build();
		actions.dragAndDrop();
		actions.keyUp(null);
		actions.keyDown(null);
		actions.moveToElement(null);
		actions.perform();
		
		//Right click
		actions.contextClick().perform();
		//Mouse hover
		actions.moveToElement(null).perform();
		//Drag and drop
		actions.dragAndDrop(null, null).perform();
		actions.clickAndHold(null).release(null).perform();
		
	}

}
