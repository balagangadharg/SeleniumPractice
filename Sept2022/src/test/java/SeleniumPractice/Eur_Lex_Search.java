package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

////div[@class='radio GroupRadioMargin']//descendant::input[@id='dateRange_0']

import io.github.bonigarcia.wdm.WebDriverManager;

public class Eur_Lex_Search {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		driver.get("https://eur-lex.europa.eu/advanced-search-form.html");
		driver.manage().window().maximize();
		
//		WebElement cookiaccept = driver.findElement(By.xpath("//a[text()='Accept all cookies']"));
//		cookiaccept.click();
		
		WebElement daterange = driver.findElement(By.xpath("//input[@id='dateRange_0']"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", daterange);
//		wait.until(ExpectedConditions.elementToBeClickable(daterange));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", daterange);
		System.out.println(daterange.getAttribute("value"));
		
		WebElement search = driver.findElement(By.xpath("//input[@id='topSearch']"));
		search.click();
		
//		List<WebElement> docslist = driver.findElements(By.xpath("//div[@class='SearchResult']//child::h2//a"));
		
		List<WebElement> docslist = driver.findElements(By.xpath("//label[@class='sr-only onlyJs']//following-sibling::input"));
		
		for (int i=0;i<docslist.size();i++) {
			System.out.println(i+") "+docslist.get(i).getText());
			
//			WebElement select3 = driver.findElement(By.xpath("//input[@id='selectedDocument3']"));
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("arguments[0].click()", docslist.get(2));
			System.out.println(docslist.get(2).getAttribute("class"));
		}

	}

}
