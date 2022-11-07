package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration_Form {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();

		List<WebElement> input = driver.findElements(By.xpath("//div[@class='container']/descendant::input"));

		String [] s = { "Abc", "qwe", "abc@gmail.com", "pass", "pass" };

		for (int i = 0; i < s.length; i++) {
			input.get(i).sendKeys(s[i]);
		}
		Thread.sleep(2000);
		
		WebElement register=driver.findElement(By.xpath("//button[text()='Register']"));
		register.click();

	}

}
