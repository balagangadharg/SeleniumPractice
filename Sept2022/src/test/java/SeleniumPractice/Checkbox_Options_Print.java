package SeleniumPractice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox_Options_Print {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		List<WebElement> contact = driver
				.findElements(By.xpath("//table[@id='contactList']/descendant::tr/descendant::td[2]"));
		List<WebElement> country = driver
				.findElements(By.xpath("//table[@id='contactList']/descendant::tr/descendant::td[3]"));
		List<WebElement> salary = driver
				.findElements(By.xpath("//table[@id='contactList']/descendant::tr/descendant::td[4]"));

		List<WebElement> checkbox = driver.findElements(
				By.xpath("//table[@id='contactList']/descendant::tr/descendant::td/descendant::input['checkbox']"));

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Any Number 0 to 5 for clicking checkbox: ");
		int n = scan.nextInt();

		System.out.println(checkbox.get(n).isDisplayed());
		System.out.println(checkbox.get(n).isDisplayed());
		System.out.println(checkbox.get(n).isSelected());

		if (checkbox.get(n).isSelected()) {
			System.out.print(contact.get(n).getText() + " " + country.get(n).getText() + " " + salary.get(n).getText());
		} else {
			System.out.println("Check is not clicked yet: ");
		}
		checkbox.get(n).click();
		if (checkbox.get(n).isSelected()) {
			System.out.println("Check is clicked: ");
			System.out.print(contact.get(n).getText() + " " + country.get(n).getText() + " " + salary.get(n).getText());
		} else {
			System.out.println("Check is not clicked yet: ");
		}
		System.out.println();
		System.out.println(checkbox.get(n).isEnabled());
		System.out.println(checkbox.get(n).isDisplayed());
		System.out.println(checkbox.get(n).isSelected());
	}

}
