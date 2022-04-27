package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignments {

	public static void main(String[] args) {

		// Setuping Browser property
		WebDriverManager.chromedriver().setup();

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		System.out.println("The First Page Edit.html");

		// Load the URL
		driver.get("http://leafground.com/pages/Edit.html");

		// Maximize browser window
		driver.manage().window().maximize();

		// Entering email id,password input using locator by.id
		driver.findElement(By.id("email")).sendKeys("parudns3333@gmail.com");

		// Finding email attribute using Relative Xpath and sending values and pressing
		// tab key
		driver.findElement(By.xpath("(//label[@for='email']/following-sibling::input)[2]")).sendKeys("Text");
		driver.findElement(By.xpath("(//label[@for='email']/following-sibling::input)[2]")).sendKeys(Keys.TAB);

		// Prints the default text entered in given attribute
		System.out.println(driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value"));

		// Clears the text in given Attribute name
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();

		// Assigning boolean value to string
		boolean str = driver.findElement(By.xpath("//label[@for='disabled']/following-sibling::input")).isEnabled();

		// Checking the field is enabled or disabled using if condition and printing
		// respectively
		if (str == false) {

			System.out.println("The Edit Field is Disabled");
		} else {
			System.out.println("The Edit field is Enabled");
		}

	}

}
