package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssert4 {
	
	public String baseUrl = "https://www.saucedemo.com/";
	public WebDriver driver;

	@BeforeClass

	public void initiate() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	public void softAssertverification() {
		
		SoftAssert softAssert = new SoftAssert();

		softAssert.assertEquals(driver.findElement(By.xpath("//input[@id='login-button']")).isDisplayed(), true);
		System.out.println("softAssert.assertEquals(driver.findElement(By.xpath(\"//input[@id='login-button']\")).isDisplayed(), true )");

		softAssert.assertEquals(driver.findElement(By.xpath("//h4[text()='Accepted usernames are:']")).getText(), "Accepted usernames are:" );
		System.out.println("softAssert.assertEquals(driver.findElement(By.xpath(\"//h4[text()='Accepted usernames are:']\")).getText(), \"Accepted usernames are:\")");

		softAssert.assertEquals(driver.findElement(By.xpath("//h4[text()='Password for all users:']")).getText(), "Password for all users:");
		System.out.println("softAssert.assertEquals(driver.findElement(By.xpath(\"//h4[text()='Password for all users:']\")).getText(), \"Password for all users:\")");
		
		softAssert.assertAll();
	}

	@AfterClass

	public void browserClose() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
