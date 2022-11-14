package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

//		WebElement chckbox = driver.findElement(By.id("checkBoxOption2"));
//		chckbox.click();
//		System.out.println(chckbox.getTagName());
		List<WebElement> chckboxs = driver.findElements(
				By.xpath("//div[@id='checkbox-example']/descendant::label/descendant::input[@type='checkbox']"));
		System.out.println(chckboxs.size());

		for (int i = 0; i <= chckboxs.size(); i++) {
			System.out.println(i);
			chckboxs.get(i).click();
			Thread.sleep(5000);
			System.out.println(chckboxs.get(i).getTagName());
			
		}

		driver.quit();

	}

}
