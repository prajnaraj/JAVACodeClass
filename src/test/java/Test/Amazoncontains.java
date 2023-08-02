package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazoncontains {

	
	static By selectAddress = By.xpath("//*[contains(text(),'Select your address')]");
	static By chooseLocation = By.cssSelector("#GLUXZipUpdateInput");
	static By applyLoaction = By.xpath("//div[@class=\"a-column a-span4 a-span-last\"]//span/span/span[@id=\"GLUXZipUpdate-announce\"]");
	static By accountList = By.xpath("//*[contains(text(),'Account & List')]");
	static By signIn = By.cssSelector(".nav-action-inner");
	static By returnOrder = By.xpath("//*[@id=\"nav-orders\"]");
	static By primeLogo = By.xpath("//*[@id=\"nav-logo-sprites\"]");
	//static By bestSeller = By.xpath("//a[contains(text(),'Best Sellers')]");
	static By bestSeller = By.xpath("//div[@id=\"nav-xshop\"]//a[4]"); //div[@id="nav-xshop"]//a[4]
	static By clinic = By.xpath("//a[contains(text(),'Clinic')]");
	static By customerService = By.xpath("//a[contains(text(),'Customer Service')]");
	static By amazonBasic = By.xpath("//a[contains(text(),'Amazon Basics')]");
	static By todayDeal = By.xpath("//div[@id=\"nav-xshop\"]//a[7]");
	static By Music = By.linkText("//div[@id=\"nav-xshop\"]//a[8]");
	static By newRelease = By.xpath("//div[@id=\"nav-xshop\"]//a[9]");
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 	
		WebDriver driver = new ChromeDriver(); 	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/"); 
		
		driver.findElement(primeLogo).click();
		driver.findElement(selectAddress).click();
		//driver.findElement(chooseLocation).sendKeys("28075");
		//driver.findElement(applyLoaction).click();
		driver.navigate().back();
		
		driver.findElement(accountList).click();
		//driver.findElement(signIn).click();
		driver.navigate().refresh();
		driver.navigate().back();

		
		driver.findElement(returnOrder).click();
		driver.navigate().back();

		driver.close();
		
	}

}
