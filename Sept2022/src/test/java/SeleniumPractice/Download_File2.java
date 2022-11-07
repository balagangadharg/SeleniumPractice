package SeleniumPractice;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.hash.HashCode;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Download_File2 {

	public static void main(String[] args) {
		
		String path="D:\\Workspace\\Sept2022\\src\\main\\resources\\Downloads";
		HashMap<String, String> preferences=new HashMap<String, String>();
		
		preferences.put("download.default_directory", path);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/FileDownload.html#google_vignette");
		driver.manage().window().maximize();

		WebElement data = driver.findElement(By.xpath("//textarea[@id='textbox']"));
		data.sendKeys(
				"శ్రీకృష్ణుడు, హిందూమతంలో అర్చింపబడే ఒక దేవుడు. విష్ణువు పది అవతారాలలోఎనిమిదవ అవతారము. హిందూ పురాణాలలోను, తాత్త్విక గ్రంథాలలోను, జనబాహుళ్యంలోని గాథలలోను, సాహిత్యంలోను, ఆచార పూజా సంప్రదాయాలలోను కృష్ణుని అనేక విధాలుగా భావిస్తుంటారు, చిత్రీకరిస్తుంటారు. చిలిపి బాలునిగాను, పశువులకాపరిగాను, రాధా గోపికా మనోహరునిగాను, రుక్మిణీ సత్యభామాది అష్టమహిషుల ప్రభువుగాను, గోపికల మనసు దొచుకున్నవాడిగాను యాదవరాజుగాను, అర్జునుని సారథియైన పాండవ పక్షపాతిగాను, భగవద్గీతా ప్రబోధకునిగాను, తత్త్వోపదేశకునిగాను, దేవదేవునిగాను, చారిత్రిక రాజనీతిజ్ఞునిగాను ఇలా బహువిధాలుగా శ్రీకృష్ణుని రూపం, వ్యక్తిత్వం, దైవత్వం చిత్రీకరింపబడినాయి.");

		WebElement generate = driver.findElement(By.xpath("//button[@id='createTxt']"));
		generate.click();

		WebElement download = driver.findElement(By.xpath("//a[@id='link-to-download']"));
		download.click();

	}

}
