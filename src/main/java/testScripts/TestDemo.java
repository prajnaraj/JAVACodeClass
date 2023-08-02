package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {
	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				  driver.manage().window().maximize();
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				driver.get("https://www.amazon.com/");
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile under 1000");
				driver.findElement(By.id("nav-search-submit-button")).click();
				//driver.close();
				
	}

}
