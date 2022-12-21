package SeleniumPractice;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_New_Window {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		WebElement window1 = driver.findElement(By.id("newWindowBtn"));
		Thread.sleep(2000);
		window1.click();
		Thread.sleep(2000);
		
		Set<String> windows = driver.getWindowHandles();

		Iterator<String> itr = windows.iterator();
		String parent = itr.next();
		String child = itr.next();
		
		System.out.println("Parent Window id :" + parent);
		System.out.println("Parent Window URL :" + driver.getCurrentUrl());
		System.out.println("Parent Window Title :" + driver.getTitle());

		Thread.sleep(2000);

		driver.switchTo().window(child);
		driver.manage().window().maximize();

		System.out.println("Child Window id :" + child);
		System.out.println("Child Window URL :" + driver.getCurrentUrl());
		System.out.println("Child Window Title :" + driver.getTitle());

		Thread.sleep(2000);
		driver.quit();
	}

}
