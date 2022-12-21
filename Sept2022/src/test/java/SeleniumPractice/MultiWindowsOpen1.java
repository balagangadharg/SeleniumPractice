package SeleniumPractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiWindowsOpen1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		WebElement tabopen = driver.findElement(By.id("newTabsWindowsBtn"));
		tabopen.click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();		
		
		String [] child = new String[windows.size()];
		System.out.println("Total: " +windows.size());
		System.out.println("......................................");
		for (int i = 0; i<windows.size(); i++) {
			
			child[i] = itr.next();			
			driver.switchTo().window(child[i]);
			driver.manage().window().maximize();		
			
			System.out.println("Get Window["+i+"] Id: " + child[i]);
			System.out.println("Get Window["+i+"] Url: " + driver.getCurrentUrl());
			System.out.println("Get Window["+i+"] Title: " + driver.getTitle());
			List<WebElement> element = driver.findElements(By.tagName("a"));
//			Thread.sleep(2000);
			System.out.println("Get Window["+i+"] Links Count: " +element.size());
			System.out.println("......................................");
			Thread.sleep(2000);
		}
		driver.quit();
	}

}
