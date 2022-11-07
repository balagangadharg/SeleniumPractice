package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//table[@class='display nowrap dataTable no-footer']/descendant::tbody/descendant::tr/descendant::td[4]

public class Table_Age_Print {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-data-download-demo.html");
		
		WebElement age=driver.findElement(By.xpath("//table[@id='example']/descendant::thead/descendant::tr/descendant::th[4]"));	
		System.out.println(age.getText());
		System.out.println("_______________");
		Thread.sleep(5000);
		
		List<WebElement> ages=driver.findElements(By.xpath("//table[@id='example']/descendant::tbody/descendant::tr/descendant::td[4]"));
		System.out.println(ages.size());
		System.out.println("________________");
		
		for (WebElement age1 : ages) {
			System.out.println(age1.getText());
//			Thread.sleep(2000);
		}	

	}

}
