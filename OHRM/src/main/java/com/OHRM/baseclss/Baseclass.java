package com.OHRM.baseclss;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass
{
public static WebDriver driver;
public static Properties prop;
public Baseclass() throws IOException
{
	prop=new Properties();
	FileInputStream fip=new FileInputStream("C:\\Users\\Mayuri\\git\\repository\\OHRM\\src\\main\\java\\com\\OHRM\\config\\config.properties");
	prop.load(fip);
}
public static void initilization()
{
	String browsername=prop.getProperty("browser");
	if (browsername.equals("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browsername.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver","F:\\selenium software\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("url"));
}
public void takescreenshot(String str) {
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		org.openqa.selenium.io.FileHandler.copy(f, new File("C:\\Users\\Mayuri\\git\\repository\\OHRM\\screenshot"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
