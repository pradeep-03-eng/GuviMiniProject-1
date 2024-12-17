package utils;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class UtilityClass {
	
	public static WebDriver driver;
	public static Properties prop;
		
	
	public void browserLaunch(String browsername, String url) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();	
		}
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	
	
	
	public void closeBrowser() {
		
		
	}
	
	

	public void sendKeysMethod(WebElement ele, String input) {
		
		ele.sendKeys(input);
		
		
	}
	
	public static void readFromPropFile(String filename) throws IOException {
		
		FileReader file = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\MiniProject-1\\src\\test\\resources\\TestData\\"+filename+".properties");
		prop = new Properties();
		prop.load(file);
	}
	
	}


