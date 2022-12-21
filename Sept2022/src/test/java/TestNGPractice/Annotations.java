package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//BeforeSuite > BeforeTest > BeforeClass > BeforeMethod > Test

public class Annotations { 
 
	@BeforeSuite

	public void beforeSuite() {
		System.out.println("I am in BeforeSuite");
	}
	@AfterSuite

	public void afterSuite() {
		System.out.println("I am in afterSuite");
	}
	@BeforeTest

	public void beforeTest() {
		System.out.println("I am in BeforeTest");
	}
	@AfterTest

	public void afterTest() {
		System.out.println("I am in afterTest");
	}
	@BeforeClass

	public void beforeClass() {
		System.out.println("I am in BeforeClass");
	}
	@AfterClass

	public void afterClass() {
		System.out.println("I am in afterClass");
	}
	@BeforeMethod

	public void beforeMethod() {
		System.out.println("I am in BeforeMethod");
	}
	@AfterMethod

	public void afterMethod() {
		System.out.println("I am in afterMethod");
	}
	@Test
	public void test1() {
		System.out.println("I am in Test1");
	}
	@Test
	public void test2() {
		System.out.println("I am in Test2");
	}
//	@BeforeGroups("Sanity")
//	public void beforeGroup() {
//		System.out.println("I am in beforeGroup");
//	}
//	@AfterGroups
//	public void afterGroup() {
//		System.out.println("I am in afterGroup");
//	}
}
