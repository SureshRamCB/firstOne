package newProject1;

import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import sampleFrameWork.Data;

public class DuplicatesString {
	
	public void fineDuplicates() {
		
		HashMap<String, Integer>hm=new HashMap<>();
		
		String str="babu babu cb cb babu";
		String[] word=str.split(" ");
		
		for (String s : word) {
			if(hm.get(s)!=null) {
				hm.put(s, hm.get(s)+1);
			}else {
			hm.put(s, 1);
		}
	}
		System.out.println(hm);
	}
	@Test
	public void fineDuplicateWord() {
		HashMap<Character, Integer>hm=new HashMap<>();
		String str="babu";
		for (int i = 0; i <=str.length()-1; i++) {
			char c=str.charAt(i);
			if(hm.get(c)!=null) { 
				hm.put(c, hm.get(c)+1);
			}else {
			hm.put(c, 1);
		}
	}
	System.out.println(hm);
}
	
	
	public void m1() {
		Hashtable<String, Integer>ht=new Hashtable<>();
		
	}
	
	
	public static void captureScreenshort() throws Throwable {
		
		String str=System.getProperty("user.dir")+"\\screenshorts\\image.png";
		TakesScreenshot ts=(TakesScreenshot) Data.driver;
		File sorce=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sorce, new File(str));
		
	}
	@Test
	public static void v1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		try {
			DuplicatesString.captureScreenshort();
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	
	
}
