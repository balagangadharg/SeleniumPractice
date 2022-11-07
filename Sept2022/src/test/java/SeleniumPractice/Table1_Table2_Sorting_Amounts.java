package SeleniumPractice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table1_Table2_Sorting_Amounts {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	     
	     
	     
	     List<WebElement> prizes=driver.findElements(By.xpath("//table[@id='product' and @name='courses']/tbody/tr/td[3]"));
	     System.out.print("Prizes in table :");
	     for (WebElement prize : prizes) {
	    	 System.out.print(prize.getText()+" ");
		
		}
	     System.out.println();
	     List<WebElement> amounts=driver.findElements(By.xpath("//legend[text()='Web Table Fixed header']/parent::fieldset/descendant::tr/descendant::td[4]"));
	     System.out.print("Amounts in table :");
	     for (WebElement amount : amounts) {
	    	 System.out.print(amount.getText()+" ");
		
		}
	     System.out.println();
	     
	int a []=new int[prizes.size()];
	for (int i = 0; i < prizes.size(); i++) {
		String s=prizes.get(i).getText();
		 a[i]=Integer.parseInt(s);
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
		System.out.println("sorting of prizes :"+Arrays.toString(a));
		
	
	int b [] =new int[amounts.size()];
	for (int i = 0; i < amounts.size(); i++) {
		String s=amounts.get(i).getText();
		 b[i]=Integer.parseInt(s);
		 
	}	
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b.length; j++) {
			int temp;
			if(b[i]<b[j])
				{
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
				
			}
			
		}
	}
	
	System.out.println("sorting of amounts :"+Arrays.toString(b));
	
		}

}
