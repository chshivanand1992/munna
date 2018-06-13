package pagelibrary.com.ranfordank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class NewBranch_cre extends Base {

	

	public static  WebElement  bname(WebDriver driver) 
	{
	 return driver.findElement(getelement("bname"));

	}

	public static  WebElement   address(WebDriver driver) 
	{
	 return driver.findElement(getelement("address"));

	}

	public static  WebElement  newbranch_btn(WebDriver driver) 
	{
	 return driver.findElement(getelement("newbranch"));

	}

	public static  WebElement  zipcode(WebDriver driver) 
	{
	 return driver.findElement(getelement("zipcode"));

	}
}
