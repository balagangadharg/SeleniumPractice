package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test_other_window {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
				
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		WebElement url = driver.findElement(By.xpath("//a[text()='https://phptavels.net/login']"));
		url.click();
		Thread.sleep(5000);
		
		Set<String> windows = driver.getWindowHandles();

		Iterator<String> itr = windows.iterator();
		String parent = itr.next();
		String child = itr.next();
		
		driver.switchTo().window(child);
		Thread.sleep(5000);
		
		if(driver.getCurrentUrl().equals("https://phptravels.net/login")) {
			
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		username.sendKeys("user@phptravels.com");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("demouser");
		
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		login.click();
		
		WebElement account = driver.findElement(By.xpath("//div[@class='header-right-action pt-1 pe-2']/descendant::button"));
		account.click();
		Thread.sleep(5000);
				
		WebElement logout = driver.findElement(By.xpath("//ul[@class='dropdown-menu show']/descendant::li[5]/a"));
		logout.click();
		}

	}

}
