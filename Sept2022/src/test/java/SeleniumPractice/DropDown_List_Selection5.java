package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_List_Selection5 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.name("continents"));
		
		Select select=new Select(element);
		Thread.sleep(2000);
		
		List<WebElement> continents=select.getOptions();
		for (WebElement continent : continents) {
			if(continent.getText().equalsIgnoreCase("North America")) {
				continent.click();
			}			
		}
		System.out.println(select.getFirstSelectedOption().getText());
	}

}
