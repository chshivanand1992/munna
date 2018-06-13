import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sms {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://site24.way2sms.com/content/index.html");
		driver.findElement(By.id("username")).sendKeys("9989877543");
		driver.findElement(By.id("password")).sendKeys("swetha123");
		driver.findElement(By.id("loginBTN")).click();
		driver.findElement(By.xpath("//a[text()='Send SMS']")).click();
		driver.switchTo().frame("frame");
		driver.findElement(By.id("mobile")).sendKeys("9989877543");
		driver.findElement(By.id("message")).sendKeys("hi");
        driver.findElement(By.id("Send")).click();
      
        String s = driver.findElement(By.xpath("//span[text()='Message has been submitted successfully.']")).getText();
        System.out.println(s);
        if (s.contains("Message has been submitted successfully."))
        {
        	System.out.println("successful");
        }
        else
        {
        }
        }
	

}
