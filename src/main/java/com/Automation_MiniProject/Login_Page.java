package com.Automation_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;

	public Login_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement mailid;
	
	@FindBy(name = "passwd")
	private WebElement pwd;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement sigin_Btn;

	public WebElement getMailid() {
		return mailid;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getSigin_Btn() {
		return sigin_Btn;
	}
}
