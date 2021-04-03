package com.Automation_MiniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	
	WebElement signup = driver.findElement(By.xpath("//a[@class='login']"));
	signup.click();
	
	WebElement email = driver.findElement(By.id("email_create"));
	email.sendKeys("priya1505@gmail.com");
	
	WebElement submit = driver.findElement(By.id("SubmitCreate"));
	submit.click();
	
	Thread.sleep(5000);
	
	WebElement ms = driver.findElement(By.id("id_gender2"));
	ms.click();
	
	WebElement fname = driver.findElement(By.id("customer_firstname"));
	fname.sendKeys("priya");
	
	WebElement lname = driver.findElement(By.id("customer_lastname"));
	lname.sendKeys("infancy");
	
	WebElement pwd = driver.findElement(By.id("passwd"));
	pwd.sendKeys("12345");
	
	WebElement day = driver.findElement(By.id("days"));
	day.click();
	Select s1=new Select(day);
	s1.selectByValue("15");
	
	WebElement month = driver.findElement(By.id("months"));
	month.click();
	Select s2=new Select(month);
	s2.selectByVisibleText("March ");
	
	WebElement year = driver.findElement(By.id("years"));
	year.click();
	Select s3=new Select(year);
	s3.selectByIndex(6);
	
	WebElement sign = driver.findElement(By.id("newsletter"));
	sign.click();
	
	WebElement opt = driver.findElement(By.id("optin"));
	opt.click();
	
	WebElement namef = driver.findElement(By.id("firstname"));
	namef.sendKeys("Priya");
	
	WebElement namel = driver.findElement(By.id("lastname"));
	namel.sendKeys("Infancy");
	
	WebElement cmp = driver.findElement(By.id("company"));
	cmp.sendKeys("Greens");
	
	WebElement addr = driver.findElement(By.id("address1"));
	addr.sendKeys("Rainbow");
	
	WebElement addr1 = driver.findElement(By.id("address2"));
	addr1.sendKeys("colony");
	
	WebElement city = driver.findElement(By.id("city"));
	city.sendKeys("chennai");
	
	WebElement state = driver.findElement(By.id("id_state"));
	state.click();
	Select s4=new Select(state);
	s4.selectByIndex(4);
	
	WebElement zip = driver.findElement(By.id("postcode"));
	zip.sendKeys("00039");
	
	WebElement country = driver.findElement(By.id("id_country"));
	country.click();
	Select s5=new Select(country);
	s5.selectByIndex(1);
	
	WebElement other = driver.findElement(By.id("other"));
	other.sendKeys("Hello");
	
	WebElement mob = driver.findElement(By.id("phone"));
	mob.sendKeys("890789078");
	
	WebElement mob1 = driver.findElement(By.id("phone_mobile"));
	mob1.sendKeys("8790980767");
	
	WebElement alias = driver.findElement(By.id("alias"));
	alias.sendKeys("Chennai");
	
	WebElement submitbtn = driver.findElement(By.id("submitAccount"));
	submitbtn.click();
	//driver.close();
}

}
