package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		WebElement acc = driver.findElement(By.xpath("//a[text()='Accordion']"));
		acc.click();

		driver.switchTo().frame(0);

		WebElement sect = driver.findElement(By.xpath("//h3[text()='Section 2']"));
		sect.click();
		System.out.println(sect.getText());

		WebElement text = driver.findElement(By.xpath("//div[@id='ui-id-4']//child::p[contains(text(),'non')]"));
		System.out.println(text.isDisplayed());
		System.out.println(text.isEnabled());

		System.out.println(text.getText());

	}

}
