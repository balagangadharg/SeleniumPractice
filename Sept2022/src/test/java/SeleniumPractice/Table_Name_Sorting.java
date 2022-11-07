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

public class Table_Name_Sorting {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-data-download-demo.html");
		
		WebElement Name=driver.findElement(By.xpath("//table[@id='example']/descendant::tr/descendant::th[1]"));
		System.out.println(Name.getText());
		System.out.println("______________________");
		
		List<WebElement> Names=driver.findElements(By.xpath("//table[@id='example']/descendant::tr/descendant::td[1]"));
		System.out.println(Names.size());
		System.out.println("________________");
//		List<String> l=new ArrayList<String>();
//		
//		for (int i=0;i<Names.size();i++) {
//			System.out.println(Names.get(i).getText());
//			l.add(Names.get(i).getText());
//			}
//		System.out.println("________________________");
//		Collections.sort(l);
//		System.out.println(l);
		
		Set l=new HashSet();
		
		for (int i=0;i<Names.size();i++) {
			System.out.println(Names.get(i).getText());
			l.add(Names.get(i).getText());
			}
		System.out.println("_______________________________________________________");		
		System.out.println(l);
		List l1=new ArrayList();
		l1.addAll(l);
		Collections.sort(l1);
		System.out.println("_______________________________________________________");
		System.out.println(l1);
		
	}

}
