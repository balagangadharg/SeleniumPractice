package SeleniumPractice;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table_Salary_Sorting {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-data-download-demo.html");
		
		WebElement salary=driver.findElement(By.xpath("//table[@id='example']/descendant::tr/descendant::th[6]"));	
		System.out.println(salary.getText());
		System.out.println("_______________");
//		Thread.sleep(5000);
		
		List<WebElement> salaries=driver.findElements(By.xpath("//table[@id='example']/descendant::tr/descendant::td[6]"));
		System.out.println(salaries.size());
		System.out.println("________________");
		
		for (WebElement salary1 : salaries) {
			System.out.println(salary1.getText());
			
		}	
		int a[]=new int[salaries.size()];
		System.out.println("________________");
		for (int i=0;i<salaries.size();i++) {
			String s=salaries.get(i).getText();	
			s=s.replace("$","");
			s=s.replace(",", "");
			a[i]=Integer.parseInt(s);			
			System.out.println(a[i]);
					
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int temp;
				if(a[i]<a[j])
					{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
			}
		}
		System.out.println("_______________________________________________________________");
		System.out.println("Salaries Sorting: ");
		for(int i=0;i<a.length;i++) {
			NumberFormat nf=NumberFormat.getInstance(Locale.US);
			System.out.print("$"+nf.format(a[i])+"  ");
		}
	}

}
