package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Stale_Element {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");

		WebElement l = driver.findElement(By.id("search-strings"));
		l.sendKeys("Selenium");

		driver.navigate().refresh();

		try {
			l.sendKeys("Selenium");
		} catch (StaleElementReferenceException e) {
			l = driver.findElement(By.id("search-strings"));
			l.sendKeys("Selenium");
			
			String s = l.getAttribute("value");
			System.out.println("Value entered is: " + s);
		}

	}

}
