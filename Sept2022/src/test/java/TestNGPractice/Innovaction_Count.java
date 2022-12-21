package TestNGPractice;

import org.testng.annotations.Test;

public class Innovaction_Count {

	@Test  
	public void m1() {
		System.out.println("I am in m1");
	}

	@Test(invocationCount = 3)
	public void m2() {
		System.out.println("I am in m2");
	}
}
