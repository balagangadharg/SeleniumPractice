package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAuto_Suggestions {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Mobile");
		Thread.sleep(5000);
		List<WebElement> autosuggestions=driver.findElements(By.xpath("//div[text()='mobile']"));
		for (WebElement autosuggestion : autosuggestions) {
			Thread.sleep(5000);
			System.out.println(autosuggestion.getText());
			
		}
		
		}

}
