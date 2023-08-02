package Test;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;  
import io.github.bonigarcia.wdm.WebDriverManager; 
public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 	
		WebDriver driver; 		
		driver = new ChromeDriver(); 		 		
		driver.get("https://www.browserstack.com/"); 		 		
		Actions action = new Actions(driver); 		 	
		WebElement element = driver.findElement(By.xpath("//button[@id=\"developers-menu-toggle\"]")); 		
		// move to element 		
		action.moveToElement(element).build().perform(); 		
		driver.findElement(By.linkText("Documentation")).click(); 		
		// double click //	
		action.doubleClick(element).build().perform(); 	 
		// right click //		
		action.contextClick(element).build().perform(); 
	}

}
