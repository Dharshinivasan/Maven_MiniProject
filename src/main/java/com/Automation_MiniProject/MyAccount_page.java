package com.Automation_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount_page {
	public WebDriver driver;

	public MyAccount_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='sf-with-ul'])[4]")
	private WebElement dresses;
	
	@FindBy(xpath = "(//a[@title='Evening Dresses'])[2]")
	private WebElement evgDresses;
	
	@FindBy(xpath = "(//a[@class='sf-with-ul'])[1]")
	private WebElement women;
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[1]")
	private WebElement t_shirts;
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement sign_Out;

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getEvgDresses() {
		return evgDresses;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getT_shirts() {
		return t_shirts;
	}
	
	public WebElement getSign_Out() {
		return sign_Out;
	}
}
