package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_Link_Text {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println("URL before click:  "+driver.getCurrentUrl());
		System.out.println("Title Before Click: "+driver.getTitle());
		
		WebElement element=driver.findElement(By.linkText("Home"));
		
		element.click();
		System.out.println("URL after click:  "+driver.getCurrentUrl());
		System.out.println("Title After Click: "+driver.getTitle());

	}

}
