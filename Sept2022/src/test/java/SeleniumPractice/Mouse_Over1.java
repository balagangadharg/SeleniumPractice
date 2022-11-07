package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Over1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		
		WebElement mp3=driver.findElement(By.xpath("//a[text()='MP3 Players']"));
		Actions action=new Actions(driver);
		Thread.sleep(5000);
		action.moveToElement(mp3).build().perform();
		Thread.sleep(5000);
		
		List<WebElement> tests=driver.findElements(By.xpath("//a[contains(text(),\"test\")]"));
		System.out.println("Total tests: "+tests.size());
		for (WebElement test : tests) {
			System.out.println(test.getText());
			Thread.sleep(2000);
			
		}

	}

}
