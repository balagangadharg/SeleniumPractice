package SeleniumPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables_Similar_Data {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement> prices=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/td[3]"));
		List<Integer> listofprices=new ArrayList<Integer>();
		System.out.println("Total prices available in the table: "+prices.size());
		for (int i=0;i<prices.size();i++) {
			System.out.println(i+" - "+prices.get(i).getText());	
			String s=prices.get(i).getText();
			int a=Integer.parseInt(s);
			listofprices.add(a);
		}
		System.out.println();
		Collections.sort(listofprices);
		System.out.println("Sorting of sizes is: "+listofprices);
		
		List<WebElement> amounts=driver.findElements(By.xpath("//legend[text()='Web Table Fixed header']/parent::fieldset/descendant::table/descendant::tr/descendant::td[4]"));
		List<String> listofamounts=new ArrayList<String>();
		System.out.println("Total prices available in the table: "+amounts.size());
		for (int j=0;j<amounts.size();j++) {
			System.out.println(j+" - "+amounts.get(j).getText());						
			listofamounts.add(amounts.get(j).getText());
		}	
		System.out.println();
		Collections.sort(listofamounts);
		System.out.println("Sorting of sizes is: "+listofamounts);
				
	}

}
