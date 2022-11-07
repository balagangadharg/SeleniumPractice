package SeleniumPractice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllCheckBox_Infor_Print {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		List<WebElement> allrowsinfoes = driver.findElements(
				By.xpath("//table[@id='contactList']/descendant::tr/descendant::td/following-sibling::td"));

		for (int i = 0; i < allrowsinfoes.size(); i++) {
			int n = i + 2;
			List<WebElement> onerowinfo = driver.findElements(By.xpath(
					"//table[@id='contactList']/descendant::tr[" + n + "]/descendant::td/following-sibling::td"));

			for (WebElement info : onerowinfo) {
				System.out.print(info.getText() + "\t\t");
			}
			System.out.println();
		}
	}
}
