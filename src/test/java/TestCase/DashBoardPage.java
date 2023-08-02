package TestCase;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class DashBoardPage {
	
//		
	WebDriver driver;
	By username = By.xpath("//input[@name=\"username\"]");
	By password = By.xpath("//input[@name=\"password\"]");
	By LoginButton = By.cssSelector(".oxd-button.oxd-button--medium ");
	String dashboardPageTitle = "OrangeHRM";
	
  @Test(priority=1, groups = {"Smoke"})
  public void login() {
	  
	  driver.findElement(username).sendKeys("Admin");;
	  driver.findElement(password).sendKeys("admin123");;
	  driver.findElement(LoginButton).click();
  }
  @Test(priority=2, groups ={"Smoke","Regression"})
  public void VerifyLogin() {
	  
	  String title = driver.getTitle();
	  if(dashboardPageTitle.equals(title))
	  {
		  System.out.println("Login Test Case is pass");
	  }
	  else
	  {
		 System.out.println("Test Case fail");
	  }
	  
	  
  }
  @BeforeClass
  public void lunchUrl() {
	  WebDriverManager.chromedriver().setup(); 
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterClass
  public void afterClass() {
	  
	 // driver.close();
  }

}
