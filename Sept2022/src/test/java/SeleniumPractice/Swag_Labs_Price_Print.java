package SeleniumPractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swag_Labs_Price_Print {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement uname=driver.findElement(By.id("user-name"));
		uname.sendKeys("standard_user");
		Thread.sleep(3000);
		
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys("secret_sauce");
		Thread.sleep(3000);
		
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(3000);
		
		List<WebElement> prices=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		System.out.println("Total Count is: "+prices.size());
		for (WebElement price : prices) {
			System.out.println(price.getText());
		}
		double a[]=new double[prices.size()];
		for(int i=0;i<a.length;i++) {
			String s=prices.get(i).getText();
			s = s.replace("$","");
			a[i] = Double.parseDouble(s);			
		}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				double temp=0;
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		double max=a[a.length-1];
		double min=a[0];
		System.out.println("Maximum Price is: "+"$"+max);
		System.out.println("Minimum Price is: "+"$"+min);
		for (int i = 0; i < a.length; i++) {
			System.out.print("$"+a[i]+"  ");
			
		}
		
//		//div[normalize-space()='$49.99']/following-sibling::button[text()='Add to cart']
		WebElement addtocartmax=driver.findElement(By.xpath("//div[normalize-space()='$"+max+"']/following-sibling::button[text()='Add to cart']"));
		Thread.sleep(3000);
		addtocartmax.click();		
		WebElement addtocartmin=driver.findElement(By.xpath("//div[normalize-space()='$"+min+"']/following-sibling::button[text()='Add to cart']"));
		Thread.sleep(3000);
		addtocartmin.click();
	}

}
