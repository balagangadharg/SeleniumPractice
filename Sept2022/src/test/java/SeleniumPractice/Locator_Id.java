package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//By id, name, class name, tag name, xpath, css selector, link text, partial text


public class Locator_Id {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement optin1=driver.findElement(By.id("checkBoxOption1"));
		System.out.println(optin1.isEnabled());
		System.out.println(optin1.isDisplayed());
		System.out.println(optin1.isSelected());
		if(optin1.isEnabled()) {
			optin1.click();
		}
		System.out.println(optin1.isSelected());
	}

}
