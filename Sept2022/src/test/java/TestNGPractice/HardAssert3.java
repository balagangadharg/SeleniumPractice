package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssert3 {

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
	public void hardAssertverification() {

		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
		System.out.println("Assert.assertEquals(driver.getCurrentUrl(), \"https://www.saucedemo.com/\")");

		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		System.out.println("Assert.assertEquals(driver.getTitle(), \"Swag Labs\")");

		Assert.assertEquals(driver.findElement(By.className("login_logo")).isDisplayed(), true);
		System.out.println("Assert.assertEquals(driver.findElement(By.className(\"login_logo\")).isDisplayed(), true);");
	}

	@AfterClass

	public void browserClose() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
