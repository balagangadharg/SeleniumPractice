package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Click_SendKeys {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement text=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")); 		
		WebElement button=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(5000);
		js.executeScript("arguments[0].value='mobile';", text);
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();", button);	
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		WebElement scrolltoelement=driver.findElement(By.xpath("//div[@data-asin='B09XB7SRQ5']/descendant::img"));
		js.executeScript("arguments[0].scrollIntoView(true);", scrolltoelement);
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();", scrolltoelement);
		
		
		}

}
