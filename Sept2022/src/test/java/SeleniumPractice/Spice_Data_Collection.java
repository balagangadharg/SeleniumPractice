package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spice_Data_Collection {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		WebElement addons = driver.findElement(By.xpath("//div[text()='Add-ons']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(addons).build().perform();
		
		List<WebElement> addonscompoentents = driver.findElements(By.xpath("//div[text()='SpiceMAX']//ancestor::div[@class='css-1dbjc4n'][2]//descendant::div[text()]"));
		System.out.println("Total: "+addonscompoentents.size());
		System.out.println(".............................");
		
		for (WebElement component : addonscompoentents) {
			System.out.println(component.getText());
		}
		System.out.println(".............................");
		
		driver.close();
	}

}
