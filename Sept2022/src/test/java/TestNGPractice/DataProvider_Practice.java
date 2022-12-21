package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_Practice {

	static String baseUrl = "https://www.saucedemo.com/";
	static WebDriver driver;
	int cnt = 1;

	@BeforeClass

	public void inititate() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test(dataProvider = "Test-Data")

	public void verifyUser(String username, String password) throws InterruptedException {

		System.out.println("iteration  :" + cnt + ": started");

		WebElement user = driver.findElement(By.id("user-name"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement submit = driver.findElement(By.id("login-button"));
		user.clear();
		Thread.sleep(2000);
		user.sendKeys(username);
		Thread.sleep(2000);
		pwd.clear();
		Thread.sleep(2000);
		pwd.sendKeys(password);
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html", "login unsuccessful");
	}

	@DataProvider(name = "Test-Data")
	public Object[][] dataProvFunc() {
		return new Object[][] { { "", "secret_sauce" }, { "standard_user", "secret_sauce" },
				{ "locked_out_user", "secret_sauce" }, { "problem_user", "secret_sauce" },
				{ "problem_user", "secret_sauce" }, { "", "" }, { "problem_user", "" }, { "21354", "secret_sauce" },
				{ "!@#$%^&*", "secret_sauce" } };
	}

	@AfterMethod
	public void logout() throws InterruptedException {

		if (driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {
			Thread.sleep(2000);
			WebElement menu = driver.findElement(By.xpath("//button[text()='Open Menu']"));
			menu.click();
			Thread.sleep(1000);
			WebElement lo = driver.findElement(By.xpath("//a[text()='Logout']"));
			lo.click();

		} else {
			WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
			System.out.println(errorMessage.getText());
		}
		System.out.println("iteration  :" + cnt + ": finished");
		cnt++;
	}
}
