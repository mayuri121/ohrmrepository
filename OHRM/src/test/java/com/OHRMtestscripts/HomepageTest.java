package com.OHRMtestscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OHRM.baseclss.Baseclass;
import com.OHRM.pages.Loginpage;

public class HomepageTest extends Baseclass{
	com.OHRM.pages.Homepage hp;
	Loginpage lp;
	public HomepageTest() throws IOException {
		super();
	}
  @Test(priority=1)
  public void f() throws IOException 
  {
	  initilization();
	  lp=new Loginpage();
	  hp=lp.login(prop.getProperty("username"),prop.getProperty("password"));
	  String Homepageimg=null;
	  takescreenshot("Homepageimg");
	  
  }
  @Test(priority=2)
  public void verifyHomepageTitleTest() {
	  String homepageTitle=hp.verifyHomepageTitle();
	  Assert.assertEquals(homepageTitle, "OrangeHRM","Homepage title not matched");
  }
}