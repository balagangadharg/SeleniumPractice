package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_Picker {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement datepick = driver.findElement(By.linkText("Datepicker"));
		datepick.click();
		driver.switchTo().frame(0);
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();
		WebElement currentdate = driver.findElement(By.xpath("//a[text()='3']"));
		currentdate.click();
	}

}
