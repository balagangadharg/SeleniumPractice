package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UI_Testing_List {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationstepbystep.com/");
		driver.manage().window().maximize();

		List<WebElement> lists = driver.findElements(By.xpath("//h3[text()='UI Testing']//parent::div//descendant::a"));
		System.out.println(lists.size());
		System.out.println("......................");
		for (WebElement list : lists) {
			System.out.println(list.getText());
			if (list.getText().equalsIgnoreCase("Selenium Python")) {
				list.click();
			}

		}

	}

}
