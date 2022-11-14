package SeleniumPractice;

public class Demo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setupt();
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.getUrl();
		driver.getTitle();
		System.out.println("Github Testing!");
		System.out.println("Selenium Testing!");
		System.out.println("Pull to Msg!");

	}

}
