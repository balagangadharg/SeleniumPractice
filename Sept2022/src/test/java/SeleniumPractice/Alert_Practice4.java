package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Practice4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 100);

		WebElement c1 = driver.findElement(By.xpath("//button[@id='alertButton']"));

		wait.until(ExpectedConditions.visibilityOf(c1));
		c1.click();

		wait.until(ExpectedConditions.alertIsPresent());
		Alert a1 = driver.switchTo().alert();

		System.out.println(a1.getText());
		a1.accept();

	}

}
