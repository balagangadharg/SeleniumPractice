package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOnMethod {

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
	public void login() {

		System.out.println("I am in Login Page!");

		WebElement user = driver.findElement(By.id("user-name"));
		user.sendKeys("standard_user");

		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("secret_sauce");

		WebElement submit = driver.findElement(By.id("login-button"));
		submit.click();

		System.out.println("Successfully Login!");

	}

	@Test(dependsOnMethods = { "login" })
	public void verifyUser() {

		System.out.println("I am in User Account!");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");

	}

	@Test(dependsOnMethods = { "verifyUser" })
	public void logout() throws InterruptedException {

		WebElement menu = driver.findElement(By.xpath("//button[text()='Open Menu']"));
		menu.click();
		Thread.sleep(5000);

		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();
		Thread.sleep(5000);

		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");

		System.out.println("I am successfull Logout!");

	}
}
