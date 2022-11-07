package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_List_Selection2 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
				
		WebElement element=driver.findElement(By.xpath("//select[@name='country']"));

		Select select=new Select(element);
		
		List<WebElement> countries=select.getOptions();
		for (WebElement country : countries) {
			if(country.getText().equalsIgnoreCase("india")){
				country.click();				
			}
			
		}
		System.out.println(select.getFirstSelectedOption().getText());

	}

}
