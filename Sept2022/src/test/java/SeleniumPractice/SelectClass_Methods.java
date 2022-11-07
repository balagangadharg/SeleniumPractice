package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass_Methods {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("dropdown-class-example"));
		Select select=new Select(element);
		
		select.selectByIndex(0);
		select.selectByValue(null);
		select.selectByVisibleText(null);
		select.deselectByVisibleText(null);
		select.deselectByIndex(0);
		select.deselectByValue(null);
		select.getAllSelectedOptions();
		select.getFirstSelectedOption();
		select.deselectAll();
		select.getOptions();
		select.getClass();
		select.getWrappedElement();
		select.isMultiple();
		
	}

}
