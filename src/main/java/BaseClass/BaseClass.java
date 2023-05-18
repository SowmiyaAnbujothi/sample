package BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static String URL = "https://www.irctc.co.in/nget/train-search";
	public static WebDriver driver;
	public static Actions act;

	@BeforeTest
	public static void start() {
		// Launch the application in chrome
		
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		act = new Actions(driver);
		// maximize chrome browser
		driver.manage().window().maximize();

		// Implicit wait:Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(URL);
	}

	@AfterTest
	public static void end() {

		driver.quit();

	}

}
