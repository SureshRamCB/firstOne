package sampleFrameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EventMethods {

	public  static WebElement wait_for_element(By locator,int timeouts) {
		WebElement element;
		try {
			WebDriverWait wait=new WebDriverWait(Data.driver, timeouts);
			element=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			wait.pollingEvery(Duration.ofMillis(200));
		} catch (Exception e) {
			element=null;
			System.out.println("Element not located even waiting "+element.toString()+"even wait for "+timeouts);
		}
		return element;
	}

	public static WebElement Wait_for_element_to_enable(By locator,int timeOuts) {
		WebElement element;
		try {
			WebDriverWait wait =new WebDriverWait(Data.driver, timeOuts);
			element=wait.until(ExpectedConditions.elementToBeClickable(locator));
			wait.pollingEvery(Duration.ofMillis(200));
		} catch (Exception e) {
			element=null;
			System.out.println("Element "+element+"is not enabled even wait for "+timeOuts);
		}
		return element;
	}
	
	public static boolean wait_for_element_to_enable(WebElement element,int timeOuts) {
		boolean isEnabled;
		try {
			WebDriverWait wait =new WebDriverWait(Data.driver, timeOuts);
			element=wait.until(ExpectedConditions.elementToBeClickable(element));
			wait.pollingEvery(Duration.ofMillis(200));
			isEnabled=true;
		} catch (Exception e) {
			element=null;
			System.out.println("Element "+element+"is not enabled even wait for "+timeOuts);
			isEnabled=false;
		}
		return isEnabled;
	}
	public static boolean wait_for_element_to_be_visible(WebElement element,int timeOuts) {
		boolean isEnabled;
		try {
			WebDriverWait wait =new WebDriverWait(Data.driver, timeOuts);
			element=wait.until(ExpectedConditions.visibilityOf(element));
			wait.pollingEvery(Duration.ofMillis(200));
			isEnabled=true;
		} catch (Exception e) {
			element=null;
			System.out.println("Element "+element+"is not visible even wait for "+timeOuts);
			isEnabled=false;
		}
		return isEnabled;
	}
	
	public static WebElement wait_for_element_to_be_visible(By locator,int timeOuts) {
			WebElement element;
		try {
			WebDriverWait wait =new WebDriverWait(Data.driver, timeOuts);
			element=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			wait.pollingEvery(Duration.ofMillis(200));
		} catch (Exception e) {
			element=null;
			System.out.println("Element "+element+"is not visible even wait for "+timeOuts);
			
		}
		return element;
	}
	
	
	public static boolean check_element_exist(By by,int timeouts) {
		boolean isElementExists;
		if(wait_for_element(by, timeouts)!=null) {
			isElementExists =true;
		}else {
			isElementExists=false;
		}
		return isElementExists;
	}
	
	
	public static void enter_value(By by,String input) {

	WebElement element=	wait_for_element(by, 20);
	if (element == null) {
		System.out.println("Element "+element+ "not located ");
		Assert.assertFalse(true,"Element u enterd is not located");
	}else {
		if(wait_for_element_to_be_visible(element, 20)) {
			if(wait_for_element_to_enable(element, 10)) {
				element.clear();
				element.sendKeys(input);
			}else {
				Assert.assertTrue(false);
				System.out.println("Element is not eneble even wait for 10 seconds");
					}
		}else {
			Assert.assertTrue(false);
			System.out.println("Element is not visable even wait for 20 seconds");
				}
			}
	}
	

	
	}

