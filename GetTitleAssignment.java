package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitleAssignment {

	public static void main(String[] args) {

		// Setuping Browser property
		WebDriverManager.chromedriver().setup();

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://acme-test.uipath.com/login");

		// Maximize browser window
		driver.manage().window().maximize();

		// Entering email id,password input using locator by.id
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");

		// Clicking Login button using Text based xpath
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

		// Printing title of the page usng getTitle method
		System.out.println("The Title of the Page is " + driver.getTitle());

		// Close Browser
		driver.close();

	}

}
