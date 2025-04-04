package com.selenium.utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkDemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("");

		List<WebElement> anchorTagElements = driver.findElements(By.tagName("a"));
		for (WebElement anchorTagElement : anchorTagElements) {
			String url = anchorTagElement.getDomAttribute("href");

			checkBrokenLink(url);
		}

	}

	private static void checkBrokenLink(String url) throws IOException {
		URL linkUrl = new URL(url);
		HttpURLConnection httpURLConnection =
				(HttpURLConnection) (linkUrl.openConnection());
		httpURLConnection.setRequestMethod("HEAD");
		httpURLConnection.connect();

		int responseCode = httpURLConnection.getResponseCode();
		if (responseCode >= 400) {
			System.out.println("Broken:ink "+url);
		}else if (responseCode >= 200 && responseCode < 400) {
			System.out.println("Valid Link "+url);
		}
	}

}
