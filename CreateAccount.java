package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

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

		// finding accountname using AttributeBased Xpath
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");

		// finding description using name attribute
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		// finding localname using AttributeBased Xpath and sending keys
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("TCR");

		// finding sitename using AttributeBased Xpath and sending keys
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");

		// finding annual revenue using xpath locator and class attribute
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("5LPA");

		// finding create account button using xpath locator
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		// closing the browser
		driver.close();

	}

}
