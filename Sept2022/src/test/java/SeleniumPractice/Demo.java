package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Demo {

	public static void main(String[] args) throws InterruptedException, IOException {

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
		
		WebElement text = driver.findElement(By.xpath("//div[@id='ui-id-4']//descendant::p/text()"));
		text.isSelected();

		System.out.println(text.getText());
//		WebElement drop = driver.findElement(By.id("droppable"));
//
//		Actions a1 = new Actions(driver);
//		Thread.sleep(5000);
//		a1.clickAndHold(drag).moveToElement(drop).build().perform();

	}

}
