package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Demo {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		List<WebElement> chckboxs = driver.findElements(
		By.xpath("//div[@id='checkbox-example']/descendant::label/descendant::input[@type='checkbox']"));
		System.out.println(chckboxs.size());

		for (int i = 0; i < chckboxs.size(); i++) {
			System.out.println(i);
			chckboxs.get(i).click();
			Thread.sleep(5000);
			System.out.println(chckboxs.get(i).getTagName());

		}
		driver.close();
	}

}
