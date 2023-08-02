package TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestSample {
  @Test(groups = {"Smoke"})
  public void addToCart() {
	  System.out.println(" add to cart");
  }
  @Test
  public void placeOrder() {
	  System.out.println("Place Order");
  }
  @Test
  public void payment2() {
	  System.out.println("payment");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
	  
	 // System.out.println("Before method of testCase 02");
  }
 

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
	//  System.out.println("Before method of testCase 02");
  }
  

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suit");
  }

}