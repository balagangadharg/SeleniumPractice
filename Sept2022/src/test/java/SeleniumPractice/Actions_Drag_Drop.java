package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Drag_Drop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://jqueryui.com/droppable/");
	    
	    driver.switchTo().frame(0);
	    
	    WebElement source=driver.findElement(By.id("draggable"));
	    WebElement target=driver.findElement(By.id("droppable"));
	    
	    Actions action=new Actions(driver);
//	    action.dragAndDrop(source, target).build();
//	    action.dragAndDrop(source, target).perform();
	    action.dragAndDrop(source, target).build().perform();
	}

}
