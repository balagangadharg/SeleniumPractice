package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//1. Xpath = //table[@name='courses']/tbody/tr/td[3]
//2. Xpath = //table[@name='courses']/descendant::tr/descendant::td[3]

public class Print_Price_From_Table {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement> prices=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/td[3]"));
		System.out.println("Total prices available in the table: "+prices.size());
		for (int i=0;i<prices.size();i++) {
			System.out.println(i+" - "+prices.get(i).getText());
		}

	}

}
