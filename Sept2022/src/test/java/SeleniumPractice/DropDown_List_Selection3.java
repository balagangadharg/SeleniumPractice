package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_List_Selection3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
				
		List<WebElement> countries=driver.findElements(By.xpath("//select[@name='country']/descendant::option"));
		
		for (WebElement country : countries) {
			
			if(country.getText().equalsIgnoreCase("india")) {
				country.click();
				System.out.println(country.getText());
			}
			
		}		
	}

}
