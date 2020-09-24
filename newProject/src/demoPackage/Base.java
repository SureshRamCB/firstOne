package demoPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite exicutions starts and initilize reporting");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite exictions ends and finilizing reporting");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test envinorment set up like QA team or dev team");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After test ");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class ");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	@Test
	public static void test1() {
		System.out.println("exicuting test case");
	}
}
