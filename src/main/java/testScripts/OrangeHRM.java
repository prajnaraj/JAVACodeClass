package testScripts;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OrangeHRM {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		Thread.sleep(1000);
	
		
		driver.findElement(By.partialLinkText("Cookies")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\"Form_getForm_FullName\"]")).sendKeys("Prajna");
		driver.findElement(By.xpath("//input[@id=\"Form_getForm_Email\"]")).sendKeys("prajnarajks@gmail.com");
		
		driver.findElement(By.xpath("//select[@id=\"Form_getForm_Country\"]")).isSelected();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value=\"India\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"Form_getForm_Contact\"]")).sendKeys("1233456777");
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//input[@name=\"action_submitForm\"]")).click();
	//	Thread.sleep(1000);
		
		driver.close();
		
	}

}
