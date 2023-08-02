package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 	
		WebDriver driver; 	
		driver = new ChromeDriver(); 		 	
		driver.get("https://demo.guru99.com/test/upload"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement uploadFile = driver.findElement(By.xpath("//input[@name=\"uploadfile_0\"]"));
		uploadFile.sendKeys("C:\\e\\new.txt");
		driver.findElement(By.xpath("//input[@class=\"field_check\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"submitbutton\"]")).click();
	}

}
