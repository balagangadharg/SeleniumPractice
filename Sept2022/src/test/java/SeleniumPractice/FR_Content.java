package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FR_Content {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.federalregister.gov/documents/2022/10/28/2022-23480/self-regulatory-organizations-the-nasdaq-stock-market-llc-notice-of-filing-and-immediate");
//		driver.get("https://ui-service-dev-rcm-pr-app1.bravedesert-bdaeb61e.eastus.azurecontainerapps.io/#/data-feed");
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.xpath("//p[contains(text(), '1934')]"));
		System.out.println(text.getText());

	}

}
