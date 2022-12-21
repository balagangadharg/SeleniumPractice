package SeleniumPractice;

import java.lang.StackWalker.Option;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Practice_Headless_Mode {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--headless");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement result=driver.findElement(By.id("result"));
		System.out.println("----------Simple Altert-----------");
		
		WebElement ele1=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		ele1.click();
		Alert a1=driver.switchTo().alert();
		Thread.sleep(5000);
		a1.accept();
		System.out.println(result.getText());
		ele1.click();
		Alert a2=driver.switchTo().alert();
		Thread.sleep(5000);
		a2.dismiss();
		System.out.println(result.getText());
		System.out.println("___________________________________________________________________________");
		System.out.println("-------------Confirmation Alert-----------");
		
		WebElement ele2=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		ele2.click();
		Alert b1=driver.switchTo().alert();
		Thread.sleep(5000);
		b1.accept();
		System.out.println(result.getText());
		ele2.click();
		Alert b2=driver.switchTo().alert();
		Thread.sleep(5000);
		b2.dismiss();
		System.out.println(result.getText());
		System.out.println("___________________________________________________________________________");
		System.out.println("------------Prompt Alert-------------------");
		
		WebElement ele3=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		ele3.click();
		Alert c1=driver.switchTo().alert();
		Thread.sleep(5000);
		c1.sendKeys("Priyal");
		Thread.sleep(5000);
		c1.accept();
		System.out.println(result.getText());
		ele3.click();
		Alert c2=driver.switchTo().alert();
		Thread.sleep(5000);
		c2.dismiss();
		System.out.println(result.getText());

	}

}
