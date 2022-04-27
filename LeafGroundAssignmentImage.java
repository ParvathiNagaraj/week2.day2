package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignmentImage {

	public static void main(String[] args) {

		// Setuping Browser property
		WebDriverManager.chromedriver().setup();

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		System.out.println("The Fourth Page Image.html");

		// Load the URL
		driver.get("http://leafground.com/pages/Image.html");

		// Maximize browser window
		driver.manage().window().maximize();

		// to go to homepage
		driver.findElement(By.xpath("//label[@for='home']/following::img[@src='../images/home.png']")).click();

		// going back to previous page
		driver.navigate().back();

		// Checking image is Broken
		String str = driver.findElement(By.xpath("//label[@for='position']/following::img[@src='../images/abcd.jpg']"))
				.getAttribute("onclick");

		if (str == null) {

			System.out.println("The Image is Broken");
		}

		else {
			System.out.println("The image is not Broken");
		}

		// clicking using keyboard
		driver.findElement(By.xpath("//label[@for='position']/following::img[@src='../images/keyboard.png']")).click();

		// going back to previous page
		driver.navigate().back();

		// clicking using Mouse
		WebElement element = driver
				.findElement(By.xpath("//label[@for='position']/following::img[@src='../images/keyboard.png']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).doubleClick().build().perform();
	}

}
