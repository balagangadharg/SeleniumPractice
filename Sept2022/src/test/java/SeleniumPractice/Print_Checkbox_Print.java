package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Print_Checkbox_Print {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();

		List<WebElement> checkboxes = driver.findElements(By.xpath("//table[@id='contactList']/descendant::input"));

		for (int i = 0; i < checkboxes.size(); i++) {
			int n = i + 2;
			List<WebElement> allrowsinfoes = driver.findElements(By.xpath(
					"//table[@id='contactList']/descendant::tr[" + n + "]/descendant::td/following-sibling::td"));
			checkboxes.get(i).click();
			Thread.sleep(2000);
			for (WebElement info : allrowsinfoes) {
				if (checkboxes.get(i).isSelected()) {
					System.out.print(info.getText() + "\t\t");
				}
			}
			System.out.println();
		}

	}
}
