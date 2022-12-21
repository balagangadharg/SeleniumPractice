package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test {

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
		
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/")) {
			WebElement errormsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
			System.out.println(errormsg.getText());
		}
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html", "Url not Matched so not able to login");
		System.out.println("Successfully Login!");

	}

}
