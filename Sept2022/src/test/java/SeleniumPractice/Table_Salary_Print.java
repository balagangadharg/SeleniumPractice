package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table_Salary_Print {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-data-download-demo.html");
		
		WebElement salary=driver.findElement(By.xpath("//table[@id='example']/descendant::thead/descendant::tr/descendant::th[6]"));	
		System.out.println(salary.getText());
		System.out.println("_______________");
		Thread.sleep(5000);
		
		List<WebElement> salaries=driver.findElements(By.xpath("//table[@id='example']/descendant::tbody/descendant::tr/descendant::td[6]"));
		System.out.println(salaries.size());
		System.out.println("________________");
		
		for (WebElement salary1 : salaries) {
			System.out.println(salary1.getText());
			
		}	

	}

}
