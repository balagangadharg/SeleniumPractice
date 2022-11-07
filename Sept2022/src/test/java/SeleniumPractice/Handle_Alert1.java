package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Alert1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    WebElement element=driver.findElement(By.id("alertbtn"));
	    element.click();
	    Thread.sleep(5000);
	    Alert alert=driver.switchTo().alert();
	    System.out.println("Alert: "+alert.getText());
	    alert.accept();	    
	    
	    WebElement element1=driver.findElement(By.id("confirmbtn"));
	    element1.click();
	    Thread.sleep(5000);
	    Alert alert1=driver.switchTo().alert();
	    System.out.println("Alert1: "+alert1.getText());
	    alert1.dismiss();	    
	}

}
