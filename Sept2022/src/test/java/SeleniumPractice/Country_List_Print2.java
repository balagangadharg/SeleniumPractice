package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Country_List_Print2 {

	public static void main(String[] args) {


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

			String s1 = options.get(i).getText();	
			String s2 = s1.substring(0, 1);
		
			if (s2.equals("I")) {
				System.out.println(i + ") " + s1);
			}
		}

	}

}
