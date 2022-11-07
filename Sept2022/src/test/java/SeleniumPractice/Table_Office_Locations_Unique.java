package SeleniumPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table_Office_Locations_Unique {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-data-download-demo.html");
		
		WebElement location=driver.findElement(By.xpath("//table[@id='example']/descendant::tr/descendant::th[3]"));	
		System.out.println(location.getText());
		System.out.println("_______________");
		
		List<WebElement> locations=driver.findElements(By.xpath("//table[@id='example']/descendant::tr/descendant::td[3]"));
		System.out.println(locations.size());
		System.out.println("________________");
		Set l=new HashSet();
		
		for (int i=0;i<locations.size();i++) {
			System.out.println(i+"-"+locations.get(i).getText());
			l.add(locations.get(i).getText());
		}
		System.out.println("_______________________________________________________");
		System.out.println(l);
		List l1=new ArrayList();
		l1.addAll(l);
		Collections.sort(l1);
		System.out.println("_________________________________________________________");
		System.out.println(l1);
	}

}
