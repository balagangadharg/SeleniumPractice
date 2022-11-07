package SeleniumPractice;

import java.util.List;
import java.util.Scanner;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration_Form1_Filling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();

		List<WebElement> input = driver.findElements(By.xpath("//div[@class='container']/descendant::input"));

		String s[] = new String[input.size()];
		
		System.err.println("Enter Values:");
		
		Scanner scan= new Scanner(System.in);
		String s1=scan.next();

		for (int i = 0; i < s.length; i++) {
			input.get(i).sendKeys(s1);
		}
		Thread.sleep(2000);
		
		WebElement register=driver.findElement(By.xpath("//button[text()='Register']"));
		register.click();


	}

}
