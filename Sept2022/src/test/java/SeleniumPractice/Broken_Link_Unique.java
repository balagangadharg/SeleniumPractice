package SeleniumPractice;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Link_Unique {

	public static void main(String[] args) throws MalformedURLException {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.seleniumeasy.com/table-data-download-demo.html");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		System.out.println(".............................................................");

		Set setoflink = new HashSet();

		for (int i = 0; i < links.size(); i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			URL link = new URL(url);
			setoflink.add(url); 

			try {
				HttpURLConnection httpURLConnect = (HttpURLConnection) link.openConnection();
				httpURLConnect.connect();
				int resCode = httpURLConnect.getResponseCode();

				if (resCode >= 400) {
					System.out
							.println(i + ")" + link + " - " + httpURLConnect.getResponseMessage() + "is a broken link");
				}

				else {
					System.out.println(i + ")" + link + " - " + httpURLConnect.getResponseMessage());
				}
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
		System.out.println(".............................................................");
		System.out.println("Unique Url Count is: " + setoflink.size());
		System.out.println(setoflink);
		String[] array = new String[setoflink.size()];		
		setoflink.toArray(array);
		System.out.println(".............................................................");
		
		for (int i = 0; i < array.length; i++) {
	         System.out.println(i+")"+array[i]);
			
		}
	}

}
