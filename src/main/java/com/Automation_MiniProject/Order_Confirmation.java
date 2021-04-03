package com.Automation_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Confirmation {
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='button-exclusive btn btn-default']")
	private WebElement backOrder;

	public WebElement getBackOrder() {
		return backOrder;
	}

	public Order_Confirmation(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}


}
