package com.Automation_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bankwire_Payment {
	public WebDriver driver;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement confirmOrder;

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}

	public Bankwire_Payment(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}


}
