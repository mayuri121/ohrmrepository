package com.OHRM.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OHRM.baseclss.Baseclass;

public class Loginpage extends Baseclass{
	public Loginpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(name="txtUsername")
	WebElement txtUsername;
	@FindBy(name="txtPassword")
	WebElement txtPassword;
	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement Loginbutton;
	public String validiateloginpageTitle() {
		return driver.getTitle();
}
	public Homepage login(String username,String pass) throws IOException {
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(pass);
		Loginbutton.click();
	return new Homepage();
	
	}
	}
