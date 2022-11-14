package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.id("user-name"));
		user.sendKeys("problem_user");
		Thread.sleep(3000);

		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("secret_sauce");
		Thread.sleep(3000);

		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(3000);

		WebElement menu = driver.findElement(By.xpath("//button[text()='Open Menu']"));
		menu.click();
		Thread.sleep(3000);

		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();
		
		driver.quit();

	}

}
