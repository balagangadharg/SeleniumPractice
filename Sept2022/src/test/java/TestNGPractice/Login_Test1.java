package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test1 {

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
	public void login() throws InterruptedException {

		System.out.println("I am in Login Page!");

		String[] users = { "standard_user", "problem_user", "performance_glitch_user", "locked_out_user" };
		String pwds = "secret_sauce";

		for (int i = 0; i < users.length; i++) {
			
			WebElement user = driver.findElement(By.id("user-name"));
			WebElement pwd = driver.findElement(By.id("password"));
			WebElement submit = driver.findElement(By.id("login-button"));
			
			System.out.println("Iteration:"+i);

			user.sendKeys(users[i]);
			pwd.sendKeys(pwds);
			submit.click();
//			Thread.sleep(2000);

			if (driver.getCurrentUrl().equals("https://www.saucedemo.com/")) {
				WebElement errormsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
				System.out.println(errormsg.getText());
			}

			Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html",
					"Url not Matched so not able to login");
			System.out.println("Successfully Login!");
			
			WebElement menu = driver.findElement(By.xpath("//button[text()='Open Menu']"));
			menu.click();
			Thread.sleep(2000);
			
			WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
			logout.click();
		}
	}
}
