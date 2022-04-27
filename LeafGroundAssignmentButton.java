package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignmentButton {

	public static void main(String[] args) {

		// Setuping Browser property
		WebDriverManager.chromedriver().setup();

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		System.out.println("The Second Page Button.html");

		// Load the URL
		driver.get("http://leafground.com/pages/Button.html");

		// Maximize browser window
		driver.manage().window().maximize();

		// Click to travel to homepage
		driver.findElement(By.xpath("//label[@for='home']/following-sibling::button")).click();

		// Navigating to previous page
		driver.navigate().back();

		// checking position of button using getLocation method
		System.out.println("The Position of button is " + driver.findElement(By.id("position")).getLocation());

		// Finding button colour
		System.out
				.println("The Button colour is " + driver.findElement(By.id("color")).getCssValue("background-color"));

		// Finding height and width using getSize method
		System.out.println("The Height and Width is " + driver.findElement(By.id("size")).getSize());

	}

}
