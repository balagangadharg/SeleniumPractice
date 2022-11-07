package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Class_Practice {
	
		public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("dropdown-class-example"));
		Select select=new Select(element);
		Thread.sleep(5000);
		System.out.println("Is Multiple Options: "+select.isMultiple());
		System.out.println("Size Is : "+select.getOptions().size());
		
		List<WebElement> options=select.getOptions();
		System.out.println("Size Is: "+options.size());
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		
		System.out.println("Default Selected Option is: "+select.getFirstSelectedOption().getText());
		
		select.selectByIndex(1);	
		System.out.println("Options Selected By Index-1: "+select.getFirstSelectedOption().getText());
		select.selectByVisibleText("Option3");
		System.out.println("Options Selected By Visible Text Option-3: "+select.getFirstSelectedOption().getText());
		
		select.selectByIndex(2);	
		System.out.println("Options Selected By Index-2: "+select.getFirstSelectedOption().getText());
		select.selectByVisibleText("Option1");
		System.out.println("Options Selected By Visible Text Option-1: "+select.getFirstSelectedOption().getText());
		
		select.selectByValue("option2");
		System.out.println("Options Selected By Value Option-2: "+select.getFirstSelectedOption().getText());

	}

}
