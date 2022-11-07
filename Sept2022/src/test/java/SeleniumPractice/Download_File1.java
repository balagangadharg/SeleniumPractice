package SeleniumPractice;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Download_File1 {

	public static void main(String[] args) {
		
		String path="D:\\Workspace\\Sept2022\\src\\main\\resources\\Downloads";
		HashMap<String, String> preferences=new HashMap<String, String>();
		
		preferences.put("download.default_directory", path);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();	
		driver.get("https://demo.automationtesting.in/FileDownload.html#google_vignette");
		
		WebElement download=driver.findElement(By.xpath("//a[@type='button']"));
		download.click();

	}

}
