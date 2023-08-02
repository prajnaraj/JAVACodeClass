package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTextDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 	
		WebDriver driver = new ChromeDriver(); 		
		driver.get("https://www.selenium.dev/"); 
		
		driver.findElement(By.linkText("Documentation")).click(); //linktext
		driver.findElement(By.linkText("Downloads")).click();
		driver.findElement(By.partialLinkText("About sele")).click(); //partiallink text
	}

	}


