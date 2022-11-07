package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_List_Country_Code {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/seeker/registration");

		List<WebElement> codes = driver.findElements(By.xpath("//select[@class='countryCodes']/descendant::option"));

		for (WebElement code : codes) {
			if (code.getText().equalsIgnoreCase("india +91")) {
				code.click();
				Thread.sleep(5000);
				System.out.println(code.getText());
			}
			WebElement mnumber = driver.findElement(By.xpath("//input[@name='Mobile Number']"));
			Thread.sleep(5000);
			mnumber.sendKeys("0000000000");

		}

	}

}
