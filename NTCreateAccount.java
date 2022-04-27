package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

	public static void main(String[] args) {

		// Setuping Browser property
		WebDriverManager.chromedriver().setup();

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize web page
		driver.manage().window().maximize();

		// locating username by id locator and sending keys
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// locating password by id locator and sending keys
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// locating submit using classname and login
		driver.findElement(By.className("decorativeSubmit")).click();

		// clicking on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// clickingin Accounts link
		driver.findElement(By.linkText("Accounts")).click();

		// clicking on CreateAccount Link
		driver.findElement(By.linkText("Create Account")).click();

		// selecting currency value using SelectByvalue method
		Select currency = new Select(driver.findElement(By.id("currencyUomId")));
		currency.selectByValue("INR");

		// Entering description value
		driver.findElement(By.name("description")).sendKeys("NRI Account");

		// finding localname using AttributeBased Xpath and sending keys
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("TCL");

		// finding sitename using AttributeBased Xpath and sending keys
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");

		// finding annual revenue using xpath locator and class attribute
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("12LPA");

		// finding create account button using xpath locator
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		// getting error message using xpath locator
		String err = driver.findElement(By.xpath("//div[@class='errorMessageHeader']")).getText();
		String err1 = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();

		// Printing Error message
		System.out.println("The Shown Error Message is " + err + err1);

	}

}
