package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstscrpit2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url=driver.getCurrentUrl();	
		System.out.println("URL is- "+url);
		String title=driver.getTitle();
		System.out.println("Tilte is- "+title);
		String pagesource =driver.getPageSource();
		System.out.println("Page source is- "+pagesource);
	}

}
