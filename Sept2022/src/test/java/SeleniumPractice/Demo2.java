package SeleniumPractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		List<WebElement> languages = driver.findElements(By.xpath("//div[@id='SIvCob']//descendant::a"));
		System.out.println(languages.size());
		System.out.println("....................");

		for (WebElement language : languages) {
			System.out.println(language.getText());
		}
		driver.close();
	}

}
