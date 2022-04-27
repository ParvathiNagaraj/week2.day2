package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

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

		// clicking in Accounts link
		driver.findElement(By.linkText("Accounts")).click();

		// clicking on Find Account Link
		driver.findElement(By.linkText("Find Accounts")).click();

		// finding accountname using AttributeBased Xpath
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");

		// finding FindAccount button using xpath locator and performing click action
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();

		// clicking on Credit Limited Account link
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewAccount?partyId=accountlimit100']")).click();

		// clicking on Edit button
		driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]")).click();

		// getting accountname and printing
		System.out.println("The Account Name is " + driver.findElement(By.id("accountName")).getAttribute("value"));

		// getting description and printing
		System.out.println("The Description is " + driver.findElement(By.name("description")).getText());

		// getting current title of page
		System.out.println("The Title of the Page is " + driver.getTitle());

		// closing the browser
		// driver.close();

	}

}
