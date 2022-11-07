package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table1_Instructor_Print {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement> instructors=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/td[1]"));
		System.out.println("Total instructors available in the table: "+instructors.size());
		for (int i=0;i<instructors.size();i++) {
			System.out.println(i+" - "+instructors.get(i).getText());
		}

	}

}
