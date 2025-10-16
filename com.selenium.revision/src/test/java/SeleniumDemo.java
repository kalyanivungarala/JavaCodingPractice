import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	
	public static void main(String[] args) {
		clickAddToCartButton();
		
		
		checkPalindrome();
	}

	private static void checkPalindrome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number ");
		int input = scanner.nextInt();
		int number = input;
		int reminder = 0;
		int modifiedNumber = 0;
		
		while(number > 0) {
			reminder = number%10;
			
			//logic to check first and last numbers - replace 
			number = number/10;
			modifiedNumber = modifiedNumber*10+reminder;
		}
		
		if (number == modifiedNumber) {
			System.out.println("Number is Palindrome");
			
		}else 
			givemeNearestPalindrome(number);
		
		
	}

	private static void givemeNearestPalindrome(int number) {
		
		
	}

	private static void clickAddToCartButton() {}

}
