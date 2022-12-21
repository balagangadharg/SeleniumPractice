package SeleniumPractice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FR_Search2 {
	
	static WebElement nextpage;
	static String s;

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
		beforedate.sendKeys("12/06/2022");

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
		String doccount = founddocument.getText();
		int totaldoc = Integer.parseInt(doccount);
		System.out.println("Total Documents Found as a String: " + doccount);
		System.out.println("Total Documents Found as a Integer: " + totaldoc);
		List<WebElement> docslist = driver.findElements(By.xpath("//div[@class='document-wrapper']//child::h5//a"));

		if (totaldoc <= 20) {
			for (int i = 0; i < docslist.size(); i++) {
				System.out.println("............................");
				System.out.println(i + ") " + docslist.get(i).getText());
				docslist.get(i).click();
				List<WebElement> cfr = driver.findElements(By.xpath("//dd[contains(text(),'" + titlenum + " C')]"));
				for (WebElement cfr12 : cfr) {
					System.out.println(cfr12.getText());
				}
				Thread.sleep(5000);
				driver.navigate().back();
				Thread.sleep(5000);
			}
		} else {
			nextpage = driver.findElement(By.xpath("//div[@class='search_info search-info filterable-list-container']//following::ul[@class='pagination pagination'][1]//descendant::li[contains(@class,'next')]"));
			s = nextpage.getAttribute("class");
			
			while (!s.contains("disable")) {
				nextpage = driver.findElement(By.xpath("//div[@class='search_info search-info filterable-list-container']//following::ul[@class='pagination pagination'][1]//descendant::li[contains(@class,'next')]"));
				s= nextpage.getAttribute("class");
				System.out.println(s);
				List<WebElement> docslist1 = driver.findElements(By.xpath("//div[@class='document-wrapper']//child::h5//a"));

				for (int i = 0; i < docslist1.size(); i++) {					
					System.out.println("............................");

					System.out.println(i + ") " + docslist1.get(i).getText());
					docslist1.get(i).click();
					List<WebElement> cfr = driver.findElements(By.xpath("//dd[contains(text(),'" + titlenum + " C')]"));
					for (WebElement cfr12 : cfr) {
						System.out.println(cfr12.getText());
					}
					Thread.sleep(1000);
					driver.navigate().back();
					Thread.sleep(1000);
				}
				if (!s.contains("disable")) {
					WebElement nextclick = driver.findElement(By.xpath("//div[@class='search_info search-info filterable-list-container']//following::ul[@class='pagination pagination'][1]//descendant::a[text()='Next →']"));
					nextclick.click();
				}

			}

		}
	}
}
