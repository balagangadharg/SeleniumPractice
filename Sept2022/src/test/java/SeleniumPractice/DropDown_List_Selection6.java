package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_List_Selection6 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();

		List<WebElement> continents = driver.findElements(By.xpath("//select[@name='continents']/descendant::option"));

		for (WebElement continent : continents) {
			if (continent.getText().equalsIgnoreCase("Asia")) {
				continent.click();
				System.out.println(continent.getText());
			}
		}

	}
}
