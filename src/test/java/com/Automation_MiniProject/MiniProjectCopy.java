package com.Automation_MiniProject;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

public class MiniProjectCopy extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		driver = getBrowser("chrome");
		getUrl("http://automationpractice.com/index.php");

		Home_page home = new Home_page(driver);
		clickOnElement(home.getSignin());

		Login_Page login = new Login_Page(driver);
		inputValueElement(login.getMailid(), "priyadharshini@gmail.com");
		
		inputValueElement(login.getPwd(), "12345");
		
		clickOnElement(login.getSigin_Btn());

		// dresses
		MyAccount_page dress = new MyAccount_page(driver);
		actionMouse(dress.getDresses(), "movetoelement");
		
		// evening dresses
		clickOnElement(dress.getEvgDresses());

		Evening_Dresses evg = new Evening_Dresses(driver);
		actionMouse(evg.getQuick(), "movetoelement");
		
		clickOnElement(evg.getView());
		
		// frame
		switchToFrames(evg.getFrame());
		
		actionMouse(evg.getQuantity(), "doubleclick");
		
		clickOnElement(evg.getSize());
		dropDownSelect(evg.getSize(), "index", "2");
		
		clickOnElement(evg.getColor());
		
		clickOnElement(evg.getAddCart());
		
		Thread.sleep(3000);
		clickOnElement(evg.getProcced_Btn());

		Order_Summary order = new Order_Summary(driver);
		clickOnElement(order.getProceed_Btn());

		Order_Address address = new Order_Address(driver);
		clickOnElement(address.getProceed_Btn());

		Order_Shipping shipping = new Order_Shipping(driver);
		clickOnElement(shipping.getCheckbox());

		clickOnElement(shipping.getProceed_Btn());

		Payment_Method payment = new Payment_Method(driver);
		clickOnElement(payment.getPayment_bank());

		Bankwire_Payment bank = new Bankwire_Payment(driver);
		clickOnElement(bank.getConfirmOrder());

		// screenshot
		Order_Confirmation confirm = new Order_Confirmation(driver);
		actionMouse(confirm.getBackOrder(), "movetoelement");
		Thread.sleep(3000);
		screenshotFolder(
				"C:\\Users\\Administrator\\eclipse-workspace\\Automation_MiniProject\\Screenshot\\ordersummary1.png");
		clickOnElement(confirm.getBackOrder());

		// screenshot
		Order_History history = new Order_History(driver);
		actionMouse(history.getBackAcc(), "movetoelement");
		Thread.sleep(3000);
		screenshotFolder(
				"C:\\Users\\Administrator\\eclipse-workspace\\Automation_MiniProject\\Screenshot\\orderhistory1.png");
		clickOnElement(history.getBackAcc());

		// women
		MyAccount_page dress1 = new MyAccount_page(driver);
		actionMouse(dress1.getWomen(), "movetoelement");

		// t-shirts
		clickOnElement(dress1.getT_shirts());

		Women_Tshirts tshirt = new Women_Tshirts(driver);
		actionMouse(tshirt.getQuick(), "movetoelement");
		clickOnElement(tshirt.getView());

		// frame
		switchToFrames(tshirt.getFrame());

		clickOnElement(tshirt.getQuantity());

		clickOnElement(tshirt.getSize());
		dropDownSelect(tshirt.getSize(), "index", "1");

		clickOnElement(tshirt.getColor());

		clickOnElement(tshirt.getAddCart());

		Thread.sleep(3000);
		clickOnElement(tshirt.getProcced_Btn());

		Order_Summary order1 = new Order_Summary(driver);
		clickOnElement(order1.getProceed_Btn());

		Order_Address address1 = new Order_Address(driver);
		clickOnElement(address1.getProceed_Btn());

		Order_Shipping shipping1 = new Order_Shipping(driver);
		clickOnElement(shipping1.getCheckbox());

		clickOnElement(shipping1.getProceed_Btn());

		Payment_Method payment1 = new Payment_Method(driver);
		clickOnElement(payment1.getPayment_cheque());

		Bankwire_Payment bank1 = new Bankwire_Payment(driver);
		clickOnElement(bank1.getConfirmOrder());

		// screenshot
		Order_Confirmation confirm1 = new Order_Confirmation(driver);
		actionMouse(confirm1.getBackOrder(), "movetoelement");
		Thread.sleep(3000);
		screenshotFolder(
				"C:\\Users\\Administrator\\eclipse-workspace\\Automation_MiniProject\\Screenshot\\ordersummary2.png");
		clickOnElement(confirm1.getBackOrder());

		// screenshot
		Order_History history1 = new Order_History(driver);
		actionMouse(history1.getBackAcc(), "movetoelement");
		Thread.sleep(3000);
		screenshotFolder(
				"C:\\Users\\Administrator\\eclipse-workspace\\Automation_MiniProject\\Screenshot\\orderhistory2.png");
		clickOnElement(history1.getBackAcc());
		Thread.sleep(3000);
		
		MyAccount_page acc=new MyAccount_page(driver);
		clickOnElement(acc.getSign_Out());
		close();

	}
}
