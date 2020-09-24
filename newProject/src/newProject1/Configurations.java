package newProject1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import sampleFrameWork.Data;

public class Configurations {
	
	public void beforeTest() {
		Data.set(new Data());
		
	}

	@Test
	@Parameters({"browser","url"})
	public static void launchingApp(String browser,String url) {
		
		switch (browser.toLowerCase()) {
		case "chrome": {
			WebDriverManager.chromedriver().setup();
			Data.driver=new ChromeDriver();
		}
			break;
			
		case "firefox": {
			WebDriverManager.firefoxdriver().setup();
			Data.driver=new FirefoxDriver();
		}
			break;
			
		case "ie": {
			WebDriverManager.iedriver().setup();
			Data.driver=new InternetExplorerDriver();
			break;
		}
		
		
		
		default:
			System.out.println("Invalid browser ");
			Assert.assertTrue(false,"The browser u enterd is invalid ");
			break;
		}
		Data.driver.manage().window().maximize();
		Data.driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		Data.driver.get(url);
		
		
	}
	

	
	@AfterTest(alwaysRun = false)
	public void closeBrowsers() {
		Data.driver.close();
		Data.driver.quit();
	}
	
	public void select_Element_From_Listbox() {
		Data.driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']")).click();
		WebElement element=Data.driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']/child::option[text()='All']"));
		Select select=new Select(element);
		select.selectByVisibleText("All");
		
	}
	
	
}
	
	

