package com.pagelibrary.com.Ranford4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Modules.ExecuteLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_def {
	
	WebDriver driver;
	public Step_def() {
		
		
	this.driver=Hooks.driver;
	}

	@Given("^launch site$")
	public void launch_site() throws Throwable {
	    
		driver.get("http://srssprojects.in/home.aspx");
	}

	@When("^check the tittle with \"([^\"]*)\" data$")
	public void check_the_tittle_with_data(String exp) throws Throwable {
	   
		String acttittle=driver.getTitle();
		
		if(acttittle.equals(exp))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("failed");
		}
	}

	@Then("^Homepage  should be displayed$")
	public void Homepage_should_be_displayed() throws Throwable {
	   
		
	}

	@Then("^close site$")
	public void close_site() throws Throwable {
	   
		driver.close();
	}

	@When("^Enter the username with \"([^\"]*)\" data$")
	public void Enter_the_username_with_data(String user) throws Throwable {
	   
		PageFactory.initElements(driver, HomePage.class);
		
		ExecuteLogin.executelgn(user);
		
	}

	@Then("^check the username with \"([^\"]*)\" data$")
	public void check_the_username_with_data(String x) throws Throwable {
	    
		if(x.equals("valid") && driver.findElement(By.id("txtPword")).isDisplayed())
		{
			System.out.println("Test is passs for valid data");
		}
		else if(x.equals("invalid") && driver.findElement(By.id("txtPword")).isDisplayed())
		{
			System.out.println("Test is passs for invalid data");
		}
		else if(x.equals(" ") && driver.findElement(By.id("txtPword")).isDisplayed() )
		{
			System.out.println("Test is passs for blank space");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
	}

	@When("^Enter the password With \"([^\"]*)\" data$")
	public void Enter_the_password_With_data(String arg1) throws Throwable {
	    
		driver.findElement(By.id("txtPword")).sendKeys(arg1);
	}

	@Then("^check the password with \"([^\"]*)\" data$")
	public void check_the_password_with_data(String y) throws Throwable {
		if(y.equals("valid") && driver.findElement(By.id("login")).isDisplayed())
		{
			System.out.println("Test is passs for valid data");
		}
		else if(y.equals("invalid") && driver.findElement(By.id("login")).isDisplayed())
		{
			System.out.println("Test is passs for invalid data");
		}
		else if(y.equals(" ") && driver.findElement(By.id("login")).isDisplayed() )
		{
			System.out.println("Test is passs for blank space");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
		
	}
	@Then("^click on login$")
	public void click_on_login() throws Throwable {
	    
		driver.findElement(By.id("login")).click();
	}

}
