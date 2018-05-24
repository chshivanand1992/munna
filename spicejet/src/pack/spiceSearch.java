package pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class spiceSearch {
	
	
	

public static void main(String[] args) {
FirefoxDriver driver = new FirefoxDriver();
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://www.spicejet.com");







driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

WebElement window=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTNR"));

  List<WebElement> list=window.findElements(By.tagName("a"));
  //System.out.println(list.size());
  for(WebElement wb:list)
  {
	  String x=wb.getText();
	  System.out.println(x);
	  if(x.contains("Goa (GOI)"))
	  {
		  wb.click();
		  break;
	  }
	 
  }
 WebElement window1=driver.findElement(By.id("glsctl00_mainContent_ddl_destinationStation1_CTNR"));
  List<WebElement> list2 = driver.findElements(By.tagName("a"));
 // System.out.println(list2.size());
  for(WebElement we:list2)
  {
	  String y=we.getText();
	  if(y.contains("Pune (PNQ)"))
	  {
		  we.click();
		  break;
	  }
	 
  }
  

/*Actions act = new Actions(driver);
String element1=driver.findElement(By.xpath("//input[contains(@id,'_mainContent_ddl_originStation1_CTXT')]")).getText();
String element2=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getText();
System.out.println(element1);
System.out.println(element2);*/


  
 // driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
  
  boolean flag=false;
  
  while(true)
  {
	  driver.findElement(By.xpath("//span[text()='Next']")).click();
	  
	 String month=driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]/span")).getText();
	 
	 if(month.contains("June"))
	 {
		WebElement table= driver.findElement
				(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		for(WebElement r:rows)
		{
			List<WebElement> columns=r.findElements(By.tagName("td"));
			
			for(WebElement c:columns)
			{
				String x=c.getText();
				System.out.println(x);
				
				if(x.contains("19"))
				{
					c.click();
					flag=true;
					break;
				}
			}
			if(flag==true)
			{
				break;
			}
		
		}
	 }
	 if(flag==true)
		{
			break;
		}
  }


		
		
		
		
	}

}
