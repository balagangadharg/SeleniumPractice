package SeleniumPractice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox_Infor_Print {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		List<WebElement> chkboxes = driver.findElements(By.xpath("//table[@id='contactList']/descendant::input"));

		System.out.println("enter any no to click chk :");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int n = num + 2;

		List<WebElement> infoes = driver.findElements(
				By.xpath("//table[@id='contactList']/descendant::tr[" + n + "]/descendant::td/following-sibling::td"));

		chkboxes.get(num).click();
		Thread.sleep(2000);
		for (WebElement info : infoes) {
			if (chkboxes.get(num).isSelected())

				System.out.print(info.getText() + "\t");

		}

	}

}
