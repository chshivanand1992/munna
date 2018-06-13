package pagelibrary.com.ranfordank;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.Select;

public class Generic {
	
	public static  Select   dropdownhandle(WebDriver driver,By prop)
	{
		Select s=new Select(driver.findElement(prop));
		return s;
		
	}

	
	public static void screenshort(WebDriver driver,String screenshotname){
		
		try {
			TakesScreenshot screen=(TakesScreenshot)driver;
			
			File src=screen.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File(".\\screen\\"+screenshotname+".png"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void attachement(WebDriver driver,String screenshotname)
	{
		screenshort(driver,screenshotname );
		EmailAttachment email=new EmailAttachment();
		
		email.setPath(".\\screen\\"+screenshotname+".png");
		
		email.setDisposition(EmailAttachment.ATTACHMENT);
		
		email.setDescription("failed screenshort");
		
		email.setName(screenshotname);
		
		MultiPartEmail attachment=new MultiPartEmail();
		
		try {
			attachment.setAuthenticator(new DefaultAuthenticator("", ""));
			
			attachment.setHostName("smtp.gmail.com");
			attachment.setSmtpPort(465);
			attachment.setSSLOnConnect(true);
			attachment.setFrom("");
			attachment.setSubject("screenshort");
			attachment.setMsg("");
			attachment.addTo("");
			attachment.attach(email);
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
