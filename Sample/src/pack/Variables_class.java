package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Variables_class {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://srssprojects.in/home.aspx");
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("lkjh");
		
		driver.findElement(By.id("login")).click();
		
		String x=driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
		
		if(x.contains("nCorrect BankerName/Password"))
		{
			driver.findElement(By.id("txtPword")).sendKeys("Admin");
		}
		driver.findElement(By.id("login")).click();
		
		
		
		
	}
	
	
}
