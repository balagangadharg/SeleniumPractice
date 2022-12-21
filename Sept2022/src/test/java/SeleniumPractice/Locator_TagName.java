package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_TagName {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		 List<WebElement> Links=driver.findElements(By.tagName("a"));
		 System.out.println("Total Links"+Links.size() );
		    for (WebElement Link : Links) {		    	
		    	System.out.println(Link.getText()); 
			}

	}

}
