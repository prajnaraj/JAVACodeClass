package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMContact {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Cookies")).click();
		Thread.sleep(1000);
		
	//	String FullName ="Abc";
		WebElement FullName = driver.findElement(By.xpath("//*[@id=\"Form_getForm_FullName\"]"));
		FullName.sendKeys("ABC");
		
		String Contact ="123455677";
		driver.findElement(By.xpath("//*[@id=\"Form_getForm_Contact\"]")).sendKeys(Contact);
		Thread.sleep(1000);
		
		String email = "abc@test.com";
		driver.findElement(By.xpath("//*[@id=\"Form_getForm_Email\"]")).sendKeys(email);
		Thread.sleep(1000);
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"Form_getForm_Country\"]"));
		
		Select dropdown1 = new Select(country); //select class ->> 3 types : value, visible and index
		dropdown1.selectByVisibleText("Gabon"); // select by visible text
		Thread.sleep(1000);
		
		WebElement NoOfEmp = driver.findElement(By.xpath("//*[@id=\"Form_getForm_NoOfEmployees\"]"));
		
		Select dropdown2 = new Select(NoOfEmp);
		dropdown2.selectByValue("0 - 10");
		Thread.sleep(1000);
		
		String Job ="QA";
		driver.findElement(By.xpath("//*[@id=\"Form_getForm_JobTitle\"]")).sendKeys(Job);
		Thread.sleep(1000);
		
		String text = "abcdkdfndigfi";
		driver.findElement(By.xpath("//*[@id=\"Form_getForm_Comment\"]")).sendKeys(text);
		Thread.sleep(1000);
		
		
		//driver.findElement(By.xpath("//*[@id=\"Form_getForm_action_submitForm\"]")).click();
		
		driver.close();
		
		
		
	}

}
