package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLINKTEXT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 	
		WebDriver driver = new ChromeDriver(); 		
		driver.get("https://www.orangehrm.com/"); 
		List<WebElement> AllLinks = driver.findElements(By.tagName("a")); 	
		int s = AllLinks.size(); 		
		System.out.println(s); 
		for(WebElement element : AllLinks ) 	// for each
		{ 			
			System.out.println(element.getText()); 		
			} 
	}

}
