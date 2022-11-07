package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PAS {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement search=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		search.sendKeys("in");
		Thread.sleep(10000);
		
		List<WebElement> autosuggestions=driver.findElements(By.xpath("//div[contains(@id,\"ui-id-\")]"));
		System.out.println("Total auto suggestions are: "+autosuggestions.size());
		for (WebElement autosuggestion : autosuggestions) {
			Thread.sleep(10000);
			System.out.println(autosuggestion.getText());			
		}
	}
	//div[contains(@id,"ui-id-")]

}
