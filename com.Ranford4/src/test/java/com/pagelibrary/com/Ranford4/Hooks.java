package com.pagelibrary.com.Ranford4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	
	public static WebDriver driver;
	
	@Before
	public static void openbrowser()
	{
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@After
	public static void screenshort(Scenario s)
	{
		try {
			if(s.isFailed())
			{
				TakesScreenshot screen=(TakesScreenshot)driver;
				
				byte[] br=screen.getScreenshotAs(OutputType.BYTES);
				
				s.embed(br, "image/png");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	

}
