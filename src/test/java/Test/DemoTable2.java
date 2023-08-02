package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DemoTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nyse.com/ipo-center/ipo-pricing-stats");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		List<WebElement> rows =	driver.findElements(By.xpath("//div[@class=\"overflow-x-auto\"]/table/tbody/tr"));
		int rowSize = rows.size();
		System.out.println(rowSize);
		
		List<WebElement> cols = driver.findElements(By.xpath("//div[@class=\"overflow-x-auto\"]/table/tbody/tr[1]/td"));
		
		int colSize = cols.size();
		System.out.println(colSize);
		String tableXpath = "//table[@class='table-data w-full table-border-rows']/tbody/tr[";
		
		for(int i = 1; i<=rowSize ; i++)
		{
			String sector = driver.findElement(By.xpath(tableXpath+i+"]/td[1]")).getText();
			System.out.print(sector);
			String offer = driver.findElement(By.xpath(tableXpath+i+"]/td[6]")).getText();
			System.out.println(offer);
		}
		
		driver.close();
	}

}
