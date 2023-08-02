package Test;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions; 
import io.github.bonigarcia.wdm.WebDriverManager; 
public class ActionDemoDragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 	
		WebDriver driver; 	
		driver = new ChromeDriver(); 		 	
		driver.get("https://demo.guru99.com/test/drag_drop.html"); 		 
		Actions action = new Actions(driver); 		 		 	
		WebElement source = driver.findElement(By.xpath("//*[@id=\"fourth\"][1]")); 		 
		WebElement target = driver.findElement(By.xpath("//*[@id=\"amt7\"]")); 		 	
		action.dragAndDrop(source, target).build().perform(); 
		driver.close(); //open browser -one opened
		driver.quit(); //all automated browsers
	}

}
