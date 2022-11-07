package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Resizable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://jqueryui.com/resizable/");
		Thread.sleep(5000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));

//		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));

		Actions action = new Actions(driver);
		action.clickAndHold(element).moveByOffset(30, 70).build().perform();

	}

}
