package newProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	@Test
	public static void launch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("htttps://google.com");
	}

	public static void StringLogics() {
		String str="qqwweerrrtt";
		int noOfChars=str.length();
		for(int i=0;i>=noOfChars;i++) {
			if(i!=i+1) {
				i++;
			}else {
				i=i;
			
			}
		}
		System.out.println(str);
		
	}
	
	@Test
	public static void newMethod() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
	}
	
	public void pattrens() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println(" ");
		}
	}
	
	public void pattrens1() {
		for(int i=1;i<=7;i++) {
			for(int j=7;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
	
	public void palindrome() {
		String main="Suresh";
		String reverse="";
	/*	for(int i=main.length()-1;i>=0;i--) {
			reverse=reverse+main.charAt(i);
		}
		System.out.println(reverse);
		*/
		
		char a[]=main.toCharArray();
		for(int i=main.length()-1;i>=0;i--) {
			reverse=reverse+a[i];
		}
		System.out.println(reverse);
	
	}
	
	
}
