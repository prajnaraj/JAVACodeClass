package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CssDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup(); 	
		WebDriver driver = new ChromeDriver(); 	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/"); 
		
		
		//driver.findElement(By.partialLinkText("Cookies")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#Form_getForm_FullName")).sendKeys("Prajna");
		driver.findElement(By.cssSelector("input[id=\"Form_getForm_Email\"]")).sendKeys("prajnarajks@gmail.com");
		Thread.sleep(1000);
		
		WebElement country = driver.findElement(By.cssSelector("select[id=\"Form_getForm_Country\"]"));
		//driver.findElement(By.cssSelector("option[value=\"India\"]")).click();
		Select dropdown = new Select(country);
		dropdown.selectByVisibleText("India");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[name=\"Contact\"]")).sendKeys("12324234454523");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".action")).click();
		
		driver.close();
		
	}

}
