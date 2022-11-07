package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Print_Text_from_WebPage {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement mouseover=driver.findElement(By.id("mousehover"));
		System.out.println(mouseover.getText());
		System.out.println(mouseover.getAttribute("mousehover"));
		System.out.println(mouseover.isDisplayed());
		System.out.println(mouseover.isEnabled());
		System.out.println(mouseover.isSelected());
		System.out.println(mouseover.getLocation());
		System.out.println(mouseover.getAccessibleName());
		System.out.println(mouseover.getTagName());
		System.out.println(mouseover.hashCode());
	}

}
