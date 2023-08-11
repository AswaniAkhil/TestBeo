package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.LoginPage;

public class LoginPageTest extends BaseClass {
	LoginPage lp;
	HomePage hp;
  @Test
  public void verifyLoginAsUserAdminTC02() throws InterruptedException { 
	  lp =new LoginPage(driver);
	  hp =new HomePage(driver);
	  lp.sendUserName("bincy.paulose@beo.in");
	  lp.sendPassword("bincy@9847JIBIN");	
	  Thread.sleep(1000);
	  lp.clickLoginButton();
	  lp.clickLoginButton();
	  String actual=hp.getHomePageText();
	  String expected="Versandübersicht";
	  Assert.assertEquals(actual, expected, "::signIn text not as expected");
  }
  @Test
  public void verifyLoginAsUserAdminWithDiffAcctTC02() throws InterruptedException {
	  lp =new LoginPage(driver);
	  hp =new HomePage(driver);
	  lp.sendUserName("sreehari.r@beo.in");
	  lp.sendPassword("Tester@123");	
	  Thread.sleep(1000);
	  lp.clickLoginButton();
	  lp.clickLoginButton();
	  String actual=hp.getHomePageText();
	  String expected="Beleg erfassen";
	  Assert.assertEquals(actual, expected, "::signIn text not as expected");
  }
  @Test
  public void verifyLoginAsAdminTC02() throws InterruptedException {
	  lp =new LoginPage(driver);
	  hp =new HomePage(driver);
	  lp.sendUserName("admin");
	  lp.sendPassword("a");	
	  Thread.sleep(1000);
	  lp.clickLoginButton();
	  String actual=lp.getCurrentUrlOfPageExp2();
	  System.out.println(actual);
	  String expected="http://11.100.101.23/BEO-PARCELnew/Home.aspx";
	  Assert.assertEquals(actual, expected, "::url text not as expected");
  }
  @Test
  public void testToAccesstheBEOParcelwebURL_TC01(){
	  lp =new LoginPage(driver);
	  hp =new HomePage(driver);
	  String actual=lp.getRegisterText();
	  String expected="Anmelden";
	  Assert.assertEquals(actual, expected, "::signIn text not as expected");	  
  }
}
