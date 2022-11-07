package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url=driver.getCurrentUrl();	
		System.out.println("URL is- "+url);
		String title=driver.getTitle();
		System.out.println("Tilte is- "+title);
		WebElement firstline=driver.findElement(By.xpath("//h2[text()='Enter your email address to get']"));
		WebElement secondline=driver.findElement(By.xpath("//h2[text()='access details to demo site']"));
		String text1=firstline.getText();
		String text2=secondline.getText();
		System.out.println("Text1 is- "+text1);
		System.out.println("Text2 is- "+text2);
		if(text1.contains("Enter your email address to get")) {
			System.out.println("Web site showing correct text-1");
		}
		if(text2.contains("access details to demo site")) {
			System.out.println("Web site showing correct text-2 ");
		}
		}

}
