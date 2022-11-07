package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_File {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/seeker/registration");

		WebElement upload = driver.findElement(By.xpath("//input[@id='file-upload']"));
		Thread.sleep(5000);
		upload.sendKeys("C:\\Users\\Gangadhara_g\\Desktop\\test.txt");
		Thread.sleep(5000);

		System.out.println("The file is uploaded successfully.");
		
		WebElement remove=driver.findElement(By.xpath("//a[text()='Remove']"));
		Thread.sleep(5000);
		remove.click();
		System.out.println("The uploaded file is removed.");

	}

}
