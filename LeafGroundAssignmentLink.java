package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignmentLink {

	public static void main(String[] args) {

		// Setuping Browser property
		WebDriverManager.chromedriver().setup();

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		System.out.println("The Third Page Link.html");

		// Load the URL
		driver.get("http://leafground.com/pages/Link.html");

		// Maximize browser window
		driver.manage().window().maximize();

		// to go to homepage
		driver.findElement(By.linkText("Go to Home Page")).click();

		// going back to previous page
		driver.navigate().back();

		// to find page with out clicking link
		System.out.println("The Page supposed to be is "
				+ driver.findElement(By.xpath("//a[contains(text(),'Find')]")).getAttribute("href"));

		// to find Page is broken
		driver.findElement(By.xpath("//a[contains(text(),'Verify')]")).click();
		String str1 = driver.findElement(By.tagName("h1")).getText();

		if (str1.contains("404")) {
			System.out.println("The Page is Broken");

		} else {
			System.out.println("The Page is Not Broken");
		}

		// back to previous page
		driver.navigate().back();

		// Go to Home Page(Interact with same link
		// driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();

		// back to previous page
		driver.navigate().back();

		// To check No.of.Links in webpage
		int linksCount = driver.findElements(By.tagName("a")).size();
		System.out.println("The Total No.of.Links in this page = " + linksCount);

	}

}
