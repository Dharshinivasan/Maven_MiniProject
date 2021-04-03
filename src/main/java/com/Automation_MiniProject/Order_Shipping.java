package com.Automation_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Shipping {
	public WebDriver driver;

	@FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceed_Btn;
	
	@FindBy(id = "cgv")
	private WebElement checkbox;

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getProceed_Btn() {
		return proceed_Btn;
	}

	public Order_Shipping(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
