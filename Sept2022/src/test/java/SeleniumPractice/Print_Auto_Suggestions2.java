package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Print_Auto_Suggestions2 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement as=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		as.sendKeys("Apple");
		Thread.sleep(2000);
		List<WebElement> ats=driver.findElements(By.xpath("//div[text()='apple']"));
		System.out.println("The Total Apple Auto Suggestions Count is: "+ats.size());
		for(int i=0;i<ats.size();i++) {
			Thread.sleep(2000);
			System.out.println(i+" - "+ats.get(i).getText());
		}

	}

}
