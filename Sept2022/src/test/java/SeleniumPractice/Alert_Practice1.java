package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Practice1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		WebElement c1 = driver.findElement(By.id("alertBox"));
		c1.click();
		Thread.sleep(5000);
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(5000);
		WebElement output = driver.findElement(By.xpath("//div[@id='output'"));
		System.out.println(output.getText());
		a1.accept();	
	}

}
