package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table1_Cources_Print {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement> cources=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/td[2]"));
		System.out.println("Total cources available in the table: "+cources.size());
		for (int i=0;i<cources.size();i++) {
			System.out.println(i+" - "+cources.get(i).getText());
		}


	}

}
