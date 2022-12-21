package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlanch {

	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	public WebDriver driver; 
	

	@BeforeClass 
	public void initiate() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	public void verifyHomepageTitle() {

		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle, "Title Not Matched");
	}
	
	@Test
	public void verifyHomepageTitlewithnagtive() {

		Assert.assertEquals( driver.getTitle(), "Home of Amazon", "Title Not Matched");
	}
	
	@Test
	public void verifyURL() {
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/test/newtours/");
		 
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
}
