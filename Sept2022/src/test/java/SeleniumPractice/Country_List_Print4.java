package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Country_List_Print4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(ele);

		List<WebElement> options = select.getOptions();
		System.out.println(options.size());
		System.out.println("...............................");

		for (int i = 0; i < options.size(); i++) {
			options.get(i).click();
			if(options.get(i).isSelected()) {
				System.out.println(i+" "+options.get(i).getText()+"---IsSelected? ="+options.get(i).isSelected());	
				System.out.println(select.getFirstSelectedOption().getText());
			}			
		}

	}

}
