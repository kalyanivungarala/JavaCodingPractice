import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsDemo {
	
	@Test
	public void testImplicitWait() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		//Explicit Wait
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		explicitWait.until(ExpectedConditions.titleContains("Google"));
		WebElement element = driver.findElement(By.id("Id of searchKey"));
		element.sendKeys("Kalyani");
		element.sendKeys(Keys.ENTER);
	}

}
