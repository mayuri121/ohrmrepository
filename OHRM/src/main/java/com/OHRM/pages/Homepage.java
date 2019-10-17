package com.OHRM.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OHRM.baseclss.Baseclass;

public class Homepage extends Baseclass{
	public Homepage() throws IOException 
	{
	super();
	PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Welcome Admin" )
	WebElement welcomeadmin;
	@FindBy(xpath = "//b[contains(text(),'Admin')]")
	WebElement admin;
     @FindBy(xpath = "//b[contains(text(),'PIM')]")
     WebElement PIM;
     @FindBy(xpath = "//b[contains(text(),'Leave')]")
     WebElement leave;
     @FindBy(xpath = "//b[contains(text(),'Time')]")
     WebElement time;
     @FindBy(xpath = "//b[contains(text(),'Recruitment')]")
     WebElement recruitment;
     @FindBy(xpath = "//b[contains(text(),'Performance')]")
     WebElement performance;
     @FindBy(xpath = "//b[contains(text(),'Dashboard')]")
     WebElement dashboard;
     @FindBy(xpath = "//b[contains(text(),'Directory')]")
     WebElement Directory;
     @FindBy(xpath = "//b[contains(text(),'Maintenance')]")
     WebElement Maintenance;
     @FindBy(xpath = "//input[@id='btnAdd']")
     WebElement addbutton;
     public String verifyHomepageTitle() {
    	 return driver.getTitle();
     }
     
}


