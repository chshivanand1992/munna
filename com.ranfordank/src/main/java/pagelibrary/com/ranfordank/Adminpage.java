package pagelibrary.com.ranfordank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Adminpage extends Base {
	
	public static  WebElement branch_btn(WebDriver driver)
	{
		return driver.findElement(getelement("branch_btn"));
		
	}

}
