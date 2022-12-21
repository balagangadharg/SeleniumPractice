package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trial5 {

	static String baseUrl = "https://www.saucedemo.com/";
	static WebDriver driver;

	@Test

	public void verifyUser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);

		WebElement ele = driver.findElement(By.xpath("//div[@class='login_password']"));
		String allpwds = ele.getText();
		System.out.println(allpwds);

		String[] pwd = allpwds.split("\\R");

		System.out.println(pwd.length);

		Assert.assertEquals(pwd[1], "secret_sauce");
		System.out.println(pwd[1]+ " = " + "secret_sauce");
	}
}
