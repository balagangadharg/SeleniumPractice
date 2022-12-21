package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		WebElement select = driver.findElement(By.linkText("Selectable"));
		select.click();
		System.out.println(driver.findElement(By.linkText("Selectable")).getText());
		driver.switchTo().frame(0);
		List<WebElement> items = driver.findElements(By.xpath("//ol[@id='selectable']//child::li"));
		System.out.println(items.size());
		for (WebElement item : items) {
			System.out.println(item.getText());
		}
	}
}
