package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import pagelibrary.com.ranfordank.Generic;

public class Table {
	
	static boolean status=false;
	public static void table(WebDriver driver,String operation)
	{
		try {
			
			boolean flag=false;
			WebElement table=driver.findElement(By.id("DG_bankdetails"));
			
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			
			String[] pagelinks=rows.get(rows.size()-1).getText().split(" ");
			
			for(int l=1;l<pagelinks.length;l++)
			{
				try {
					if(pagelinks[l].contains("...") && status==true)
					{
						driver.findElement(By.xpath("//a[text()='...'][2]")).click();
					}
					else
					{
						table.findElement(By.linkText(pagelinks[l])).click();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(pagelinks[l].contains("..."))
				{
					status=true;
					
					table(driver, operation);
					
				}
				table=driver.findElement(By.id("DG_bankdetails"));
				rows=table.findElements(By.tagName("tr"));
				
				for(WebElement r:rows)
				{
					List<WebElement> columns=r.findElements(By.tagName("td"));
					for(WebElement c:columns)
					{
						if(c.getText().matches("194"))
						{
							if(operation.equalsIgnoreCase("edit"))
							{
								columns.get(columns.size()-2).findElement(By.tagName("a")).click();
							}
							else if(operation.equalsIgnoreCase("delete"))
							{
								columns.get(columns.size()-1).findElement(By.tagName("a")).click();
							}
							else
							{
								Reporter.log("operation is failed");
								Generic.screenshort(driver, "operation");
							}
							flag=true;	
							break;
						}
					}
					if(flag==true)
					{
						break;

					}
				}
				if(flag==true)
				{
					break;

				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
