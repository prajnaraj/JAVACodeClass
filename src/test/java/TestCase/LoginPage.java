package TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class LoginPage {
  @Test(groups= {"Smoke"})
  public void LoginP() {
	  System.out.println("Login Test Case 1 of Login Page");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

}
