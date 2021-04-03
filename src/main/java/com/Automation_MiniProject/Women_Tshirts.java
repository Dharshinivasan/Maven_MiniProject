package com.Automation_MiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Tshirts {
	public WebDriver driver;

	public Women_Tshirts(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@class='product_list grid row']/li")
	private WebElement quick;
	
	@FindBy(xpath = "//ul[@class='product_list grid row']/li/div/div[1]/div/a[2]")
	private WebElement view;
	
	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement frame;
	
	@FindBy(xpath = "//a[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement quantity;
	
	@FindBy(id = "group_1")
	private WebElement size;
	
	@FindBy(id = "color_14")
	private WebElement color;
	
	@FindBy(id = "add_to_cart")
	private WebElement addCart;
	
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement procced_Btn;
	
	public WebElement getQuick() {
		return quick;
	}

	public WebElement getView() {
		return view;
	}

	public WebElement getFrame() {
		return frame;
	}
	
	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddCart() {
		return addCart;
	}

	public WebElement getProcced_Btn() {
		return procced_Btn;
	}	

}
