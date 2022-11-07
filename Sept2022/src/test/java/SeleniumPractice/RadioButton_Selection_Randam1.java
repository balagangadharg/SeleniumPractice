package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton_Selection_Randam1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		List<WebElement> radios = driver.findElements(By.xpath("//input[@name='radioButton']"));
		System.out.println(radios.size());

		for (int i = radios.size(); i > 0; i--) {
			int n = i - 1;
			if (n % 2 == 0) {
				radios.get(n).click();
				Thread.sleep(2000);
				System.out.println(radios.get(n).getText());
			}
		}

	}

}
