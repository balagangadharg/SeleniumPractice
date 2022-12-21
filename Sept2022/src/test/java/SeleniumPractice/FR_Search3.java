package SeleniumPractice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FR_Search3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.federalregister.gov/documents/search#advanced");
		driver.manage().window().maximize();
		System.out.println("............................");
		System.out.println(driver.getCurrentUrl());
		System.out.println("............................");
		System.out.println(driver.getTitle());
		System.out.println("............................");

		WebElement radio1 = driver
				.findElement(By.xpath("//span[text()='Publication Date']//ancestor::fieldset//descendant::input[3]"));
		radio1.click();

		WebElement afterdate = driver.findElement(By.name("conditions[publication_date][gte]"));
		afterdate.sendKeys("10/01/2022");

		WebElement beforedate = driver.findElement(By.name("conditions[publication_date][lte]"));
		beforedate.sendKeys("12/11/2022");

		WebElement proposedrule = driver.findElement(By.xpath("//input[@value='PRORULE']"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", proposedrule);
		proposedrule.click();

		WebElement notice = driver.findElement(By.xpath("//input[@value='NOTICE']"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", notice);
		notice.click();

		WebElement title = driver.findElement(By.name("conditions[cfr][title]"));
		System.out.print("Enter Title Number: ");
		Scanner scan = new Scanner(System.in);
		String titlenum = scan.next();
		title.sendKeys(titlenum);

		WebElement search = driver.findElement(By.xpath("//button[text()='Search']"));
		search.click();
		Thread.sleep(3000);

		WebElement founddocument = driver.findElement(By.id("item-count"));
		System.out.println("............................");
		System.out.println("Total Documents Found: " + founddocument.getText());
		
		WebElement docslist = driver.findElement(By.xpath("//div[@class='document-wrapper']//child::h5//a"));
		System.out.println(docslist.getText());
		docslist.click();

		WebElement cfr = driver.findElement(By.xpath("//dd[contains(text(),'undef')]"));
		System.out.println(cfr.getText());	
		
		String s1 = cfr.getText();
		String s2 = s1.substring(7);
		System.out.println(s2);

	}

}
