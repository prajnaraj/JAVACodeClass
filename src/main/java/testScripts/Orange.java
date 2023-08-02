package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {
	static WebDriver driver;
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.orangehrm.com/");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.name("EmailHomePage")).sendKeys("prajnarajks@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Cookies")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("btn-tryit-free")).click();
		
		
		//driver.findElement(By.className("action btn btn-ohrm btn-tryit-free")).click();
		
	}

}
