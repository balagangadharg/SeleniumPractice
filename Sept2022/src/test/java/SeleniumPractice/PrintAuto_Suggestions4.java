package SeleniumPractice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAuto_Suggestions4 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println("Enter the Country Name: ");
		Scanner in=new Scanner(System.in);
		String country=in.next();
		String countries=country.toLowerCase();
		
		WebElement autosuggestion=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		autosuggestion.sendKeys(countries);
		autosuggestion.click();
		Thread.sleep(20000);
		
		List<WebElement> autosuggestions=driver.findElements(By.xpath("//li[@class='ui-menu-item"+countries+"']"));
		System.out.println("The Total Related Auto Suggestions Count is: "+autosuggestions.size());
		for(int i=0;i<autosuggestions.size();i++) {
			Thread.sleep(20000);
			System.out.println(i+" - "+autosuggestions.get(i).getText());
		}
		

	}

}
