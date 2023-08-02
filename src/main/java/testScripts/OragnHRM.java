package testScripts;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 
import io.github.bonigarcia.wdm.WebDriverManager;


public class OragnHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "suajana@test.com"; String name ="Sujana"; 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		driver.findElement(By.xpath("//*[@id=\"Form_getForm_FullName\"]")) .sendKeys(name);
		
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"Form_getForm_FullName\"]"));
		firstName.sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"Form_getForm_Email\"]")).sendKeys(email);
		
		WebElement countryDropDown = driver.findElement(By.xpath("//select[@id=\"Form_getForm_Country\"]"));
		Select dropdown = new Select(countryDropDown);
		dropdown.selectByValue("India"); 
		// dropdown.selectByVisibleText("Canada"); 
		// // dropdown.selectByIndex(11); //
	}

}
