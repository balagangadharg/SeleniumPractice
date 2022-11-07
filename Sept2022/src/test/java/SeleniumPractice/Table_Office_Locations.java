package SeleniumPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table_Office_Locations {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-data-download-demo.html");
		
		WebElement location=driver.findElement(By.xpath("//table[@id='example']/descendant::tr/descendant::th[3]"));	
		System.out.println(location.getText());
		System.out.println("_______________");
//		Thread.sleep(5000);
		
		List<WebElement> locations=driver.findElements(By.xpath("//table[@id='example']/descendant::tr/descendant::td[3]"));
		System.out.println(locations.size());
		System.out.println("________________");
		List<String> l=new ArrayList<String>();
		
		for (int i=0;i<locations.size();i++) {
			System.out.println(i+"-"+locations.get(i).getText());
			l.add(locations.get(i).getText());
		}
		System.out.println("_______________________________________________________");
		Collections.sort(l);
		System.out.println(l);
		
		System.out.println("_______________________________________________________");
		for (int i=0;i<locations.size();i++) {
			
			if(locations.get(i).getText().contains("New")) {
				System.out.println(i+"-"+locations.get(i).getText());
			}
			
		}

	}

}
