package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table2_Cities_Print {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement> positions=driver.findElements(By.xpath("//div[@class='tableFixHead']/descendant::tbody/tr/td[3]"));
		System.out.println("Total positions available in the table: "+positions.size());
		for (int i=0;i<positions.size();i++) {
			System.out.println(i+" - "+positions.get(i).getText());
		}

	}

}
