package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssert3 {
	
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

		softAssert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
		System.out.println("softAssert.assertEquals(driver.getCurrentUrl(), \"https://www.saucedemo.com/\")");

		softAssert.assertEquals(driver.getTitle(), "SWAG LABS DEMO");
		System.out.println("softAssert.assertEquals(driver.getTitle(), \"SWAG LABS DEMO");

		softAssert.assertEquals(driver.findElement(By.className("login_logo")).isDisplayed(), true);
		System.out.println("softAssert.assertEquals(driver.findElement(By.className(\"login_logo\")).isDisplayed(), true);");
		
		softAssert.assertAll();
	}

	@AfterClass

	public void browserClose() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
