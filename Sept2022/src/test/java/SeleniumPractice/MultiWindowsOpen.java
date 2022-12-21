package SeleniumPractice;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiWindowsOpen {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		WebElement tabopen = driver.findElement(By.id("newTabsWindowsBtn"));
		tabopen.click();
		
		Set<String> windows = driver.getWindowHandles();

		Iterator<String> itr = windows.iterator();
		String parent = itr.next();
		String child1 = itr.next();
		String child2 = itr.next();
		String child3 = itr.next();
		String child4 = itr.next();
		
		System.out.println("Get Parent Id: "+parent);
		System.out.println("Get Parent Url: "+driver.getCurrentUrl());
		System.out.println("Get Parent Title: "+driver.getTitle());		
		System.out.println("......................................");		
		Thread.sleep(5000);
		
		driver.switchTo().window(child1);
		driver.manage().window().maximize();
		
		System.out.println("Get Child1 Id: "+child1);
		System.out.println("Get Child1 Url: "+driver.getCurrentUrl());
		System.out.println("Get Child1 Title: "+driver.getTitle());
		System.out.println("......................................");
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		driver.switchTo().window(child2);
		driver.manage().window().maximize();
		
		System.out.println("Get Child2 Id: "+child2);
		System.out.println("Get Child2 Url: "+driver.getCurrentUrl());
		System.out.println("Get Child2 Title: "+driver.getTitle());
		System.out.println("......................................");
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		driver.switchTo().window(child3);
		driver.manage().window().maximize();
		
		System.out.println("Get Child3 Id: "+child3);
		System.out.println("Get Child3 Url: "+driver.getCurrentUrl());
		System.out.println("Get Child3 Title: "+driver.getTitle());
		System.out.println("......................................");
		Thread.sleep(5000);
		
		driver.switchTo().window(child4);
		driver.manage().window().maximize();
		
		System.out.println("Get Child3 Id: "+child4);
		System.out.println("Get Child3 Url: "+driver.getCurrentUrl());
		System.out.println("Get Child3 Title: "+driver.getTitle());
		System.out.println("......................................");
		Thread.sleep(5000);
		driver.quit();
	}

}
