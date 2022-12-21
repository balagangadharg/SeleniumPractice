package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Practice8 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 100);

		WebElement c4 = driver.findElement(By.id("promtButton"));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", c4);
		wait.until(ExpectedConditions.visibilityOf(c4));
		c4.click();

		wait.until(ExpectedConditions.alertIsPresent());
		Alert a4 = driver.switchTo().alert();
		a4.sendKeys(": Hare Krishna");
		System.out.println(a4.getText());
		a4.accept();
		
		WebElement promptResult=driver.findElement(By.xpath("//span[@id='promptResult']"));
		System.out.println(promptResult.getText());

	}

}
