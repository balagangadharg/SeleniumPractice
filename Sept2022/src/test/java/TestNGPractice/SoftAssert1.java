package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssert1 {

	public String baseUrl = "https://demo.seleniumeasy.com/";
	public WebDriver driver;
	public WebElement element;

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
		softAssert.assertEquals(driver.getCurrentUrl(), "https://demo.seleniumeasy.com/");
		System.out.println("softAssert.assertEquals(driver.getCurrentUrl(), \"https://demo.seleniumeasy.com/\")");

		softAssert.assertEquals(driver.getTitle(), "BrowserTestingDemo");
		System.out.println("softAssert.assertEquals(driver.getTitle(), \"BrowserTestingDemo\")");

		softAssert.assertEquals(driver.findElement(By.xpath("//div[@class='logo']//descendant::img")).isDisplayed(), true);
		System.out.println("softAssert.assertEquals(driver.findElement(By.xpath(\"//div[@class='logo']//descendant::img\")).isDisplayed(), true)");

		softAssert.assertAll();
	}

}
