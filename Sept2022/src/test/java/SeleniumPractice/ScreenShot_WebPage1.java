package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot_WebPage1 {

	static WebDriver driver;

	public static void generateScreenshot() throws IOException {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime now = LocalDateTime.now();

		String filePath = "D:\\Workspace\\Sept2022\\src\\main\\resources\\ScreenShots\\IMG";
		String fileName = filePath + dtf.format(now) + ".png";

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(fileName));

		System.out.println("Screenshot Saved " + fileName);

	}

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		for (int i = 0; i <= 1000; i += 250) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, " + i + ")");

			generateScreenshot();
			Thread.sleep(5000);

			System.out.println("Screenshot at(0, " + i + ") Sucessfully Taken!");
		}

	}

}
