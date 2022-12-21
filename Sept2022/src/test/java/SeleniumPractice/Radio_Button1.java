package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio_Button1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");

		WebElement senior = driver.findElement(By.xpath("//div[text()='Senior Citizen']"));
		senior.click();
		System.out.println(senior.isDisplayed());
		System.out.println(senior.isEnabled());
		System.out.println(senior.isSelected());

		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links: " + Links.size());

	}

}
