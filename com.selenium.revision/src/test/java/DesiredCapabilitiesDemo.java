import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DesiredCapabilitiesDemo{
	
	private WebDriver driver = null;
	
	@BeforeTest
	private void setUp() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("", true);
		driver = new InternetExplorerDriver();
	
		driver.get("http://google.com");
	}
	
	@Test
	public void searchTextInGoogle() {
		driver.findElement(By.name("q")).sendKeys("Jeevithamastu");
//		driver.findElement(By.id("btnk")).sendKeys(Keys.RETURN);
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("Kalyani HTML Report.html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		ExtentTest test = reports.createTest("First test");
		test.log(Status.INFO, "Putting Info:");
		
		   // log(Status, details)
        test.log(Status.DEBUG, "This step shows usage of log(status, details)");
        
        test.log(Status.ERROR, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
       
		reports.flush();
	}
	
	@AfterTest
	private void tearDown() {
		driver.close();
	}
	

}
