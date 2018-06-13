package pagelibrary.com.ranfordank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import TestBase.Base;
import webtable.Table;

public class Reprository extends Base{
	
	
	WebDriver driver;
	public void login() throws Exception
	{
		HomePage.UserName_textbox(driver).sendKeys(config("username"));
		
		HomePage.password_textbox(driver).sendKeys(config("password"));
		driver.findElement(By.id("login")).click();
String actittle=driver.getTitle();
		
		String exp="KEXKIM BANK";
		if(actittle.contains(exp))
		{
			Reporter.log("Test is passed");
		}
		else
		{
			Reporter.log("Test is Failed");
			
			Generic.attachement("login");
		}
		Adminpage.branch_btn(driver).click();
		
		
		
	}
	
	public void launch(String url,String brow) throws Exception
	{
		
		if(brow.equalsIgnoreCase("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		else if(brow.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:\\Selenium softwares\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	public void branchcreation(String bname,String address,String zip,String country,String state,String city)
	{
		NewBranch_cre.newbranch_btn(driver).click();
		
		NewBranch_cre.bname(driver).sendKeys(bname);
		
		NewBranch_cre.address(driver).sendKeys(address);
		
		NewBranch_cre.zipcode(driver).sendKeys(zip);
		
		Generic.dropdownhandle(driver, getelement("country")).selectByVisibleText(country);
		
		Generic.dropdownhandle(driver, getelement("state")).selectByVisibleText(state);
		
		Generic.dropdownhandle(driver, getelement("city")).selectByVisibleText(city);
		
		driver.findElement(getelement("submit")).click();
		
		
		
		
	}
	
	public void webtable()
	{
		Adminpage.branch_btn(driver).click();
		Table.table(driver, "edit");
	}

}
