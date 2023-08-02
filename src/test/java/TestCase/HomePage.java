package TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class HomePage {
  @Test(groups = {"Regression","Smoke"})
  public void Home() {
	  System.out.println("Test case 1 of HomePage");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

}
