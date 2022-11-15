package TestNGPractice;

import org.testng.annotations.Test;

public class PriorityAttribute {

	@Test(priority=3, enabled=false)

	public void method1() {
		System.out.println("I am in Mehtod1");
	}

	@Test(priority=5)

	public void method2() {
		System.out.println("I am in Mehtod2");
	}

	@Test(priority=1)
	
	public void method3() {
		System.out.println("I am in Mehtod3");
	}

	@Test(priority=4)

	public void method4() {
		System.out.println("I am in Mehtod4");
	}

	@Test(priority=2)

	public void method5() {
		System.out.println("I am in Mehtod5");
	}
}
