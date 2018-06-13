package pack;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xml.dtm.DTMAxisTraverser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class First_sel_pro {

	
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		WebElement e=driver.findElement(By.className(""));
	
		
        Thread.sleep(3000);
		driver.findElement(By.name("identifier")).sendKeys("chshivanand1992");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("munna420");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//*[@class='vO'])[1]")).sendKeys("shoukatbvbit@gmail.com");
		
		driver.findElement(By.name("subjectbox")).sendKeys("resume");
		
		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("Hi Hope u r doing well",Keys.ENTER,"see the below attachment of resume");
		
		driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
		
		Thread.sleep(6000);
		StringSelection s=new StringSelection("F:\\New folder\\resume");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		Thread.sleep(6000);
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='gb_db gbii']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		
		driver.close();
		
		
		
		
		
		
		
		
	}
}
