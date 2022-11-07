package SeleniumPractice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Print_Auto_Suggestions5 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		
		System.out.println("Enter any item: ");
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String item=s.toLowerCase();
			
		
		WebElement search=driver.findElement(By.xpath("//div[@id='__next']/descendant::input[1]"));
		search.sendKeys(item);
		search.click();
		Thread.sleep(10000);
		
		List<WebElement> autosuggestions=driver.findElements(By.xpath("//p[contains(text(),'"+item+"')]"));
		System.out.println("Total auto suggestions are: "+autosuggestions.size());
		for(int i=0;i<autosuggestions.size();i++) {
			Thread.sleep(10000);
			System.out.println(i+" - "+autosuggestions.get(i).getText());
		}
	}

}
