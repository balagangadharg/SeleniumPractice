package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Practice2 {

	public static void main(String[] args) {
 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 100);

		WebElement c1 = driver.findElement(By.id("alertBox"));

		wait.until(ExpectedConditions.visibilityOf(c1));
		c1.click();

		wait.until(ExpectedConditions.alertIsPresent());
		Alert a1 = driver.switchTo().alert();
		a1.accept();

		WebElement output = driver.findElement(By.xpath("//div[@id='output']"));

		System.out.println(output.getText());

	}

}
