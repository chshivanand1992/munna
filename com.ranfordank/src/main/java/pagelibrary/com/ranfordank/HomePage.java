package pagelibrary.com.ranfordank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class HomePage extends Base{
	
	
	public static  WebElement   UserName_textbox(WebDriver driver) throws Exception
	{
	 return driver.findElement(getelement("username"));

	}

	public static   WebElement  password_textbox(WebDriver driver) throws Exception
	{
		return driver.findElement(getelement("password"));
	}

}
