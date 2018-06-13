package pagelibrary.com.ranfordank;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Excel.Excel_class;
import webtable.Table;

public class TestExecution extends Reprository {

	
	@Test(priority=0)
	public void verify_login() throws Exception
	{
		login();
	}
	
	@Parameters({"url","browser"})
	@BeforeTest
	public void verify_launch(String url,String brow) throws Exception
	{
		launch(url,brow);
		
	}
	@Test(priority=1,enabled=false)
	public void verify_table()
	{
		webtable();
	}
	/*@Test(priority=1)
	public void verify_branch()
	{
		Excel_class.excelconnection("data.xls", "Sheet1");
		
		Excel_class.outputexcelconnection("data.xls", "output.xls", "Sheet1");
		
		for(int r=1;r<Excel_class.rcount();r++)
		{
			
		 branchcreation(Excel_class.readdata(0, r),Excel_class.readdata(1, r),Excel_class.readdata(2, r),Excel_class.readdata(3, r),Excel_class.readdata(4, r),Excel_class.readdata(5, r));
		String text= driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
		
		if(text.contains("created successfully"))
		{
			Excel_class.writedata(6, r, text);
		}
		else if(text.contains("already Exits"))
		{
			Excel_class.writedata(6, r, "Test Failed");
			
			
		}
		else
		{
			Excel_class.writedata(6, r, "alert is n/a");
			
			Generic.screenshort(driver, "branch");
		}
		
		}
		
		Excel_class.saveworkbook();
		
	}
	
	*/

}
