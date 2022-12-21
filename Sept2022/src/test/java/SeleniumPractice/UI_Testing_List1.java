package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UI_Testing_List1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationstepbystep.com/");
		driver.manage().window().maximize();

		List<WebElement> lists = driver.findElements(By.xpath("//h3[text()='UI Testing']//parent::div//descendant::a"));
		System.out.println(lists.size());
		System.out.println("......................");
		String[] link = { "Selenium for Beginners", "Selenium Java Framework", "Selenium Python",
				"Selenium 4 with Java", "Cucumber BDD", "Cypress", "Playwright" };
		for (int i = 0; i < link.length; i++) {
			System.out.println(lists.get(i).getText());
			if (lists.get(i).getText().equals(link[i])) {
				lists.get(i).click();
			}
		}
	}

}
