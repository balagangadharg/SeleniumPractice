package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table2_Names_Print {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement> names=driver.findElements(By.xpath("//div[@class='tableFixHead']/descendant::tr/descendant::td[1]"));
		System.out.println("Total names available in the table2: "+names.size());
		for (int i=0;i<names.size();i++) {
			System.out.println(i+" - "+names.get(i).getText());
		
		}
		
		

	}

}
