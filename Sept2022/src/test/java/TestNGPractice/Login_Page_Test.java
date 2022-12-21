package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Page_Test {

	public String baseUrl = "https://www.saucedemo.com/";
	public WebDriver driver; 

	String[] users = { "standard_user", "locked_out_user", "problem_user", "performance_glitch_user" };
	String pwds = "secret_sauce";

	WebElement user;
	WebElement pwd;
	WebElement submit;

	SoftAssert softAssert = new SoftAssert();

	@BeforeClass

	public void initiate() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	public void beforeMethod() {

		System.out.println("I am in Login Page!");

		user = driver.findElement(By.id("user-name"));
		pwd = driver.findElement(By.id("password"));
		submit = driver.findElement(By.id("login-button"));
	}

	@Test
	public void verifyLogin() throws InterruptedException {

		for (int i = 0; i < users.length; i++) {
			beforeMethod();
			System.out.println("Iteration:      " + i + ":    Satrted");
			user.clear();
			user.sendKeys(users[i]);
			pwd.clear();
			pwd.sendKeys(pwds);
			submit.click();
			if (driver.getCurrentUrl().equals("https://www.saucedemo.com/")) {
				WebElement errormsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
				System.out.println(errormsg.getText());
			}
			softAssert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html", "Url not Matched so not able to login");
			logout();
			System.out.println("Iteration:      " + i + ":    Finished");
		}
		softAssert.assertAll();
	}

	public void logout() throws InterruptedException {

		if (driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {
			WebElement menu = driver.findElement(By.xpath("//button[text()='Open Menu']"));
			menu.click();
			Thread.sleep(2000);
			WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
			logout.click();
		} else {
			System.out.println("Login Failed!");
		}
	}

}
