package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_Experience {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/seeker/registration");
		driver.manage().window().maximize();
		
		List<WebElement> codes = driver.findElements(By.xpath("//select[@class='countryCodes']/descendant::option"));
		System.out.println(codes.size());

		for (int i=codes.size();i>0;--i) {
			int n=i-10;
			codes.get(n).click();
			Thread.sleep(5000);
			System.out.println(codes.get(n).getText());
			}
		
	}

}

