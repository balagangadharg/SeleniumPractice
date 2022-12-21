package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trial1 {
	
	static String baseUrl = "https://www.saucedemo.com/";
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='login_credentials']"));
		String allusers = ele.getText();
		System.out.println(allusers);
		
		String []user = allusers.split("\\R");
		
		System.out.println(user.length);
		
	}

}
