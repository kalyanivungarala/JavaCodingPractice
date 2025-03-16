import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
		actions.click();
	}

}
