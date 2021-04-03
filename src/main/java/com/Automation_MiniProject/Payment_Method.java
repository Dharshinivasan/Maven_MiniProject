package com.Automation_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Method {
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement payment_bank;
	
	
	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement payment_cheque;


	public WebElement getPayment_bank() {
		return payment_bank;
	}


	public WebElement getPayment_cheque() {
		return payment_cheque;
	}


	public Payment_Method(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
