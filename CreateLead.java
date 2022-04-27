package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		// Setuping Browser property
		WebDriverManager.chromedriver().setup();

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

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

		// clickingin Leads link
		driver.findElement(By.linkText("Leads")).click();

		// clicking on Create Lead Link
		driver.findElement(By.linkText("Create Lead")).click();

		// Entering companyname using id locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IBM");

		// Entering firstname using id locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Parvathi");

		// Entering lastname using id locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ArunKumar");

		// clicking create button using name attribute
		driver.findElement(By.name("submitButton")).click();

		// getting title of the page
		System.out.println("The Title of the Page is " + driver.getTitle());

		// closing the browser
		driver.close();

	}

}
