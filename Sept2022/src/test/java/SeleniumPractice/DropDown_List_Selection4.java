package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_List_Selection4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.name("continents"));

		Select select = new Select(element);
		Thread.sleep(2000);

		select.selectByVisibleText("Australia");
		System.out.println(select.getFirstSelectedOption().getText());

		select.selectByIndex(0);
		System.out.println(select.getFirstSelectedOption().getText());

		select.selectByValue("South America");
		System.out.println(select.getFirstSelectedOption().getText());

	}

}
