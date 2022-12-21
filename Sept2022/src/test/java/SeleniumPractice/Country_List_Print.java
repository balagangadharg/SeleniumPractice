package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Country_List_Print {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		List<WebElement> options = driver.findElements(By.xpath("//option[contains(text(), '')]"));
		System.out.println(options.size());
		System.out.println("...............................");

		for (int i = 0; i < options.size(); i++) {

			String s = options.get(i).getText();
			char firstChar = s.charAt(0);

			if (firstChar == 'I') {
				System.out.println(i + ") " + s);
			}

		}
	}
}
