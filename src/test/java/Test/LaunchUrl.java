package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("google"))
		{
			System.out.println("tc Pass");
		}
		else
			
		{
			System.out.println("tc fail");
		}
		
	}

}
