package Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 	
		WebDriver driver = new ChromeDriver(); 	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/"); 
		String parentId = driver.getWindowHandle();
		//System.out.println(parentId);
		driver.findElement(By.xpath("//div[contains(text(),'Gift Card')]")).click();
		
		
		
		
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> I1 = windowIds.iterator();
		
		
		while(I1.hasNext())
		{
			String childId = I1.next();
			if(!parentId.equals(childId))
			{
			
				driver.switchTo().window(childId);
				System.out.println("Child Window");
				driver.findElement(By.xpath("//span[contains(text(),'Happy Journey Gift Card')]")).click();
				
			//	driver.close();
			}
		}
		
		driver.switchTo().window(parentId);
		System.out.println("Parent Window");
		driver.close();
	}

}
