import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Eur_Lex_Search1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		driver.get("https://eur-lex.europa.eu/advanced-search-form.html");
		driver.manage().window().maximize();

		WebElement daterange = driver.findElement(By.xpath("//input[@id='dateRange_0']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", daterange);
		System.out.println(daterange.getAttribute("value"));

		WebElement search = driver.findElement(By.xpath("//input[@id='topSearch']"));
		search.click();

		List<WebElement> docslist = driver.findElements(By.xpath("//div[@class='SearchResult']//child::h2//a"));
		List<WebElement> celexnums = driver.findElements(By.xpath("//dd[contains(text(), '320')]"));
		List<WebElement> date = driver.findElements(By.xpath("//dd[contains(text(), 'Date')]"));
		for (int i = 0; i < docslist.size(); i++) {
			System.out.println(i + ") " + docslist.get(i).getText());			
			System.out.println("CELEX Number: " +celexnums.get(i).getText());	
			System.out.println("Date of document: "+date.get(i).getText());
		}
	}

}
