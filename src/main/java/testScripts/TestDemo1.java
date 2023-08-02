package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestDemo1 {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		System.setProperty("webdriver.edge.driver", "C:\\BrowserDriver\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
	}

}
