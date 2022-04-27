package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenuimBasics {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		// driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		// driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		// driver.findElement(By.className("decorativeSubmit")).click();
		// driver.findElement(By.linkText("CRM/SFA")).click();
		// driver.findElement(By.linkText("Leads")).click();
		// driver.findElement(By.linkText("Create Lead")).click();

		// driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IBM");
		// driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Parvathi");
		// driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nagaraj");
		// driver.findElement(By.className("smallSubmit")).click();
		// String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		// System.out.println("Company Name = " + text);
		// String text1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		// System.out.println("Company Name = " + text1);
		// String text2 = driver.findElement(By.id("viewLead_lastName_sp")).getText();
		// System.out.println("Company Name = " + text2);

		// finding username using AttributeBased Xpath
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		// finding username using Partial AttributeBased Xpath
		driver.findElement(By.xpath("//input[contains(@name,'PASS')]")).sendKeys("crmsfa");

		// finding username using AttributeBased Xpath
		driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();

		// finding username using Partial text based Xpath
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text() = 'Create Lead']")).click();

		// finding username using Collections Xpath
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("NMS");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Pavi");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Arun");

		// finding username using Basic Attribute
		driver.findElement(By.className("smallSubmit")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Company Name = " + text);
		String text1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Company Name = " + text1);
		String text2 = driver.findElement(By.id("viewLead_lastName_sp")).getText();
		System.out.println("Company Name = " + text2);

	}

}
