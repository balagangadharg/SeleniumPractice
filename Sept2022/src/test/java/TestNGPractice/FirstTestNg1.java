package TestNGPractice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNg1 {
	

	public String baseUrl = "https://www.google.com/";
	public WebDriver driver;
	
	@BeforeClass
	public void setBaseUrl() {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyHomePageTitle() {
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void verifyHomePageUrl() {
		String expectedUrl = "https://www.google.com/";
		String actualUrl = driver.getCurrentUrl();
		assertEquals(actualUrl, expectedUrl);
	}
	
	@AfterClass
	public void endSession() {
		driver.quit();
	}
}
