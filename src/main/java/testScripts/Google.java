package testScripts;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Google {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.className("gLFyf")).sendKeys("Selenium");
		Thread.sleep(1000);
		
		driver.findElement(By.name("btnK")).click();
		
		Thread.sleep(1000);
		
	
		
		 
		driver.findElement(By.xpath("//a[@href='https://www.selenium.dev/']")).click();
		
	}	

}
