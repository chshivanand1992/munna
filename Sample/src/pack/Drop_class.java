package pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Drop_class {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/shivanandh/Desktop/dp.html");
		
		driver.manage().window().maximize();
		
		
	
		Select s=new Select(driver.findElement(By.id("mts")));
		
		List<WebElement> list=s.getOptions();
		List<String> alltext=new ArrayList<>();
		for(WebElement op:list)
		{
			String text=op.getText();
			
			alltext.add(text);
			
		}
		Collections.sort(alltext);
		for(String str:alltext)
		{
			System.out.println(str);
		}
		
	
		
	
		
		
		
		
		
		
		
	
		
		
	}

}
