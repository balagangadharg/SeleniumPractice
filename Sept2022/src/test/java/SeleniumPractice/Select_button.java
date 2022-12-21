package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_button {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();

		WebElement tablets = driver.findElement(By.xpath("//nav[@id='menu']//descendant::a[text()='Tablets']"));
		tablets.click();
		Thread.sleep(5000);
		WebElement sort = driver.findElement(By.xpath("//select[@id='input-sort']"));
		Select select = new Select(sort);

		System.out.println("Size is : " + select.getOptions().size());
		System.out.println("_________________");

		List<WebElement> options = select.getOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		System.out.println("_________________");

		try {

			select.selectByIndex(1);
			System.out.println(select.getFirstSelectedOption().getText());

		} catch (StaleElementReferenceException e) {

			sort = driver.findElement(By.xpath("//select[@id='input-sort']"));
			select = new Select(sort);

			select.selectByIndex(1);
			System.out.println(select.getFirstSelectedOption().getText());
		}
		try {

			select.selectByValue("http://tutorialsninja.com/demo/index.php?route=product/category&path=57&sort=rating&order=ASC");
			System.out.println(select.getFirstSelectedOption().getText());

		} catch (StaleElementReferenceException e) {

			sort = driver.findElement(By.xpath("//select[@id='input-sort']"));
			select = new Select(sort);

			select.selectByValue("http://tutorialsninja.com/demo/index.php?route=product/category&path=57&sort=rating&order=ASC");
			System.out.println(select.getFirstSelectedOption().getText());
		}
		try {

			select.selectByVisibleText("Price (Low > High)");
			System.out.println(select.getFirstSelectedOption().getText());
		} catch (StaleElementReferenceException e) {

			sort = driver.findElement(By.xpath("//select[@id='input-sort']"));
			select = new Select(sort);

			select.selectByVisibleText("Price (Low > High)");
			System.out.println(select.getFirstSelectedOption().getText());
		}
	}

}
