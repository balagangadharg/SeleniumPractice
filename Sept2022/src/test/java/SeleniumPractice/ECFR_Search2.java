package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ECFR_Search2 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ecfr.gov/");
		

		WebElement eCFRRecentChanges = driver.findElement(By.xpath("//a[@aria-label='eCFR Recent Changes']"));
		eCFRRecentChanges.click();
		Thread.sleep(5000);
		
		WebElement titleclick = driver.findElement(By.xpath("//span[contains(text(), 'Title')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", titleclick);
		titleclick.click();
		System.out.println(titleclick.getText());
	}
}
