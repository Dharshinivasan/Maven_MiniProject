package com.Automation_MiniProject;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String value) {
		try {

			if (value.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (value.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else if (value.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;

	}

	public static void getUrl(String value) {
		try {
			driver.get(value);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void inputValueElement(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void actionMouse(WebElement element, String type) {
		try {
			Actions ac = new Actions(driver);
			if (type.equalsIgnoreCase("movetoelement")) {
				ac.moveToElement(element).build().perform();
			} else if (type.equalsIgnoreCase("rightclick")) {
				ac.contextClick(element).build().perform();
			} else if (type.equalsIgnoreCase("click")) {
				ac.click(element).build().perform();
			} else if (type.equalsIgnoreCase("doubleclick")) {
				ac.doubleClick(element).build().perform();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void keyboardRobot(String type) {
		try {
			Robot r = new Robot();
			if (type.equalsIgnoreCase("down")) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}
			if (type.equalsIgnoreCase("enter")) {
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void isEnabled(WebElement element) {
		try {
			boolean enabled = element.isEnabled();
			System.out.println("Enabled or not:" + enabled);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void isDisplayed(WebElement element) {
		try {
			boolean displayed = element.isDisplayed();
			System.out.println("Displayed or not:" + displayed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void isSelected(WebElement element) {
		try {
			boolean selected = element.isSelected();
			System.out.println("Selected or not:" + selected);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void checkboxToggle(WebElement element) {
		try {
			if (element.isSelected()) {
				System.out.println("Checkbox is Toggled On");

			} else {
				System.out.println("Checkbox is Toggled Off");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void switchToFrames(WebElement element) {
		try {

			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void framesParameter(String type, String input) {
		try {
			if (type.equalsIgnoreCase("index")) {
				int index = Integer.parseInt(input);
				driver.switchTo().frame(index);
			} else if (type.equalsIgnoreCase("id")) {
				driver.switchTo().frame(input);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void frameDefaultContent() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dropDownSelect(WebElement element, String type, String input) {
		try {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("index")) {
				int index = Integer.parseInt(input);
				s.selectByIndex(index);
			} else if (type.equalsIgnoreCase("value")) {
				s.selectByValue(input);
			} else if (type.equalsIgnoreCase("visibletext")) {
				s.selectByVisibleText(input);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void dropDownDeSelect(WebElement element, String type, String input) {
		try {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("deselectindex")) {
				int index = Integer.parseInt(input);
				s.deselectByIndex(index);
			} else if (type.equalsIgnoreCase("deselectvalue")) {
				s.deselectByValue(input);
			} else if (type.equalsIgnoreCase("deselectvisibletext")) {
				s.deselectByVisibleText(input);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getText(WebElement element) {
		try {
			String text = element.getText();
			System.out.println(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getAttribute(WebElement element, String input) {
		try {
			String attribute = element.getAttribute(input);
			System.out.println(attribute);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getCurrentUrl() {
		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean isMultiple(WebElement element) {
		boolean multiple = false;
		try {
			Select s = new Select(element);
			multiple = s.isMultiple();
			System.out.println("Multiple or not:" + multiple);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return multiple;

	}

	public static int multipleDropdown(WebElement element, String type) {
		int size = 0;
		try {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("getoptions")) {
				List<WebElement> options = s.getOptions();
				for (WebElement alloption : options) {
					getText(alloption);
				}
				size = options.size();
			} else if (type.equalsIgnoreCase("getallselectedoptions")) {
				List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
				for (WebElement selectedoptions : allSelectedOptions) {
					getText(selectedoptions);
				}
				size = allSelectedOptions.size();
			} else if (type.equalsIgnoreCase("getfirstselectedoption")) {
				WebElement firstSelectedOption = s.getFirstSelectedOption();
				getText(firstSelectedOption);

			} else if (type.equalsIgnoreCase("deselect")) {
				s.deselectAll();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return size;
	}

	public static void screenshotFolder(String value) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;// narrow typecasting
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(value);
			FileUtils.copyFile(source, destination);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void implicitWait(int sec, TimeUnit format) {
		try {
			driver.manage().timeouts().implicitlyWait(sec, format);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void explicitWait(WebElement element, int sec) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, sec);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void quit() {
		try {
			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateTO(String url) {
		try {
			driver.navigate().to(url);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateForward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateRefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void deleteCookies() {
		try {
			driver.manage().deleteAllCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void alertOk() {
		try {
			Alert alert = driver.switchTo().alert();
			Thread.sleep(3000);
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void alertcancel() {
		try {
			Alert alert = driver.switchTo().alert();
			Thread.sleep(3000);
			alert.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void alertSendKeys(String input) {
		try {
			Alert alert = driver.switchTo().alert();
			Thread.sleep(3000);
			alert.sendKeys(input);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getTitle(String input) {
		try {
			String title = driver.switchTo().window(input).getTitle();
			System.out.println(title);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void windowHandlings() {
		try {

			Set<String> windowHandles = driver.getWindowHandles();
			for (String title : windowHandles) {
				getTitle(title);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void windowHandling() {
		try {

			String title = driver.getWindowHandle();
			getTitle(title);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static void windowhandlingbreak(String acTitle) {
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			for (String title : windowHandles) {
				if (driver.switchTo().window(title).getTitle().equals(acTitle)) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
