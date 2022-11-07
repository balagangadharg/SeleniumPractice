package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//1. xpath = //div[@class='tableFixHead']/parent::fieldset/descendant::tbody/descendant::tr/descendant::td[4]
//2. xpath = //legend[text()='Web Table Fixed header']/parent::fieldset/descendant::table/descendant::tr/descendant::td[4]
//3. xpath = //div[@class='tableFixHead']/descendant::tbody/descendant::tr/descendant::td[4]
//4. xpath = //legend[text()='Web Table Fixed header']/parent::fieldset/descendant::tr/descendant::td[4]

public class Print_Amount_From_Table {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement> amount=driver.findElements(By.xpath("//div[@class='tableFixHead']/descendant::tr/descendant::td[4]"));
		System.out.println("Total prices available in the table: "+amount.size());
		for (int i=0;i<amount.size();i++) {
			System.out.println(i+" - "+amount.get(i).getText());
		}


	}

}
