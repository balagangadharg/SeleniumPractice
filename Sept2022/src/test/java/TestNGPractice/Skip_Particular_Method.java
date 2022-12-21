package TestNGPractice;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Skip_Particular_Method {

	@Test
	public void m1() {
		System.out.println("I am in m1"+Thread.currentThread().getId());
	}

	@Test(dependsOnMethods = "m5")
	public void m2() {
		System.out.println("I am in m2"+Thread.currentThread().getId());
	}

	@Test
	public void m3() {
		System.out.println("I am in m3"+Thread.currentThread().getId());
		
	}

	@Test(enabled = false)
	public void m4() {
		System.out.println("I am in m4"+Thread.currentThread().getId());
	}

	@Test
	public void m5() {
		System.out.println("I am in m5"+Thread.currentThread().getId());
		assertEquals(true, false);
	}
}
