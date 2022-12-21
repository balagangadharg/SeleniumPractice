package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trial2 {
	
	static String baseUrl = "https://www.saucedemo.com/";
	static WebDriver driver;
	
	@Test
	
	public void verifyUser() {
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='login_credentials']"));
		String allusers = ele.getText();
		System.out.println(allusers);
		
		String []user = allusers.split("\\R");
		
		System.out.println(user.length);
		
		Assert.assertEquals(user[1], "standard_user");
		Assert.assertEquals(user[2], "locked_out_user");
		Assert.assertEquals(user[3], "problem_user");
		Assert.assertEquals(user[4], "performance_glitch_user");
	}

}
