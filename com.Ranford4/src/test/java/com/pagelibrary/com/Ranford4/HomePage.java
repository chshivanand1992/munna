package com.pagelibrary.com.Ranford4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	@FindBy(how=How.ID,using="txtuId")
	public  static WebElement username;
	
	@FindBy(how=How.ID,using="txtPword")
	public  static WebElement password;
	
	@FindBy(how=How.ID,using="login")
	public  static WebElement login;

}
