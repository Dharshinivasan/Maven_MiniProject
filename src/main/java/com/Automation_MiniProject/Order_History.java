package com.Automation_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_History {
	public WebDriver driver;

	@FindBy(xpath = "//ul[@class='footer_links clearfix']//li[1]//a")
	private WebElement backAcc;

	public WebElement getBackAcc() {
		return backAcc;
	}

	public Order_History(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
