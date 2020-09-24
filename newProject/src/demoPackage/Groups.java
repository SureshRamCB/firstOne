package demoPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Groups {
	@Test(priority = -2)
	public void m01() {
		System.out.println("1");
	}
	@Test(priority = -5)
	public void m02() {
		System.out.println("2");
	}
	
	@BeforeMethod(alwaysRun = false)
	public void m03() {
		System.out.println("3");
	}
	@BeforeSuite(alwaysRun = false)
	public void m04() {
		System.out.println("4");
	}
}