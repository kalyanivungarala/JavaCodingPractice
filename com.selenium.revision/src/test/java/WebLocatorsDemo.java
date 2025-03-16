import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLocatorsDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("ID1"));
		driver.findElement(By.name("ID1"));
		driver.findElement(By.className("ID1"));
		driver.findElement(By.linkText("ID1"));
		driver.findElement(By.partialLinkText("ID1"));
		driver.findElement(By.tagName("ID1"));
		driver.findElement(By.xpath("ID1"));
		driver.findElement(By.cssSelector("ID1"));
	}

}
