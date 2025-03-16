package com.selenium.revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		WebElement bookStoreElement = driver.findElement(By.name("bookstore"));
		List<WebElement> books = bookStoreElement.findElements(By.name("book"));
		for (WebElement book : books) {
			WebElement titleElement = book.findElement(By.tagName("title"));
			String title = titleElement.getText();
			if (title.equals("The Alchemist")) {
				System.out.println("Title of the book ---"+title);
			}
		}
	}

}
