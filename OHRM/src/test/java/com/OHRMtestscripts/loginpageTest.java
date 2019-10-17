package com.OHRMtestscripts;

import org.testng.annotations.Test;

import com.OHRM.baseclss.Baseclass;
import com.OHRM.pages.Loginpage;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class loginpageTest extends Baseclass{
	com.OHRM.pages.Homepage hp;
	Loginpage lp;
	//Logger logger=logger.getLogger(loginpageTest.class);
	public loginpageTest() throws IOException {
		super();
	}
	
  @Test(priority=1)
  public void  loginpageTitleTest() {
	  String title=lp.validiateloginpageTitle();
	  Assert.assertEquals(title, "OrangeHRM");
	  
	  }
  @Test(priority=2)
  public void logintest() throws IOException {
	  //Takescreenshot("loginpageimg");
	  hp=lp.login(prop.getProperty("username"), prop.getProperty("password"));
	  
	  
  }
 
  @BeforeTest
  public void beforeTest() throws IOException {
	  initilization();
	  lp=new Loginpage();
  }

  @AfterTest
  public void afterTest() {
  }

}
