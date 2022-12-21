package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trial4 {

	static WebDriver driver;
	String[] user;

	@BeforeClass
	public void iniitate() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		System.out.println("___________________________________");

	}

	@BeforeMethod
	public void beforeMethod() {

		WebElement ele = driver.findElement(By.xpath("//*[@id=\"login_credentials\"]"));
		String allUsers = ele.getText();

		user = allUsers.split("\\R");
		System.out.println("___________________________________");
	}

	@Test
	public void verifyAllUsers() {

		Assert.assertEquals(user[1], "standard_user");
		Assert.assertEquals(user[2], "locked_out_user");
		Assert.assertEquals(user[3], "problem_user");
		Assert.assertEquals(user[4], "performance_glitch_user");

		System.out.println(user[1] + " = " + "standard_user");
		System.out.println(user[2] + " = " + "locked_out_user");
		System.out.println(user[3] + " = " + "problem_user");
		System.out.println(user[4] + " = " + "performance_glitch_user");

		System.out.println("___________________________________");

	}

	@Test
	public void verifyAllUsersByUsingForloop() {

		String[] expUser = { "", "standard_user", "locked_out_user", "problem_user", "performance_glitch_user" };

		for (int i = 1; i < user.length; i++) {
			Assert.assertEquals(user[i], expUser[i]);
			System.out.println(user[i] + " = " + expUser[i]);
		}
		System.out.println("___________________________________");
	}
}
