package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Different_Browsers {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		driver.close();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1=new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		driver1.close();
		
		WebDriverManager.iedriver().setup();
		WebDriver driver2=new InternetExplorerDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		driver2.close();
	}

}
