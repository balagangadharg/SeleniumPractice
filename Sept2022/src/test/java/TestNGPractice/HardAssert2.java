package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert2 {

	@Test

	public void hardAssertVerification() {

		Assert.assertEquals(true, true);
		System.out.println("HardAssert1");

		Assert.assertEquals(true, false, "Unable to Login because of Incorrect Credentials!");
		System.out.println("HardAssert2");

		Assert.assertEquals(true, true);
		System.out.println("HardAssert3");

		Assert.assertEquals(true, true);
		System.out.println("HardAssert4");

		Assert.assertEquals(true, true);
		System.out.println("HardAssert5");

		Assert.assertEquals(true, true);
		System.out.println("HardAssert6");

		Assert.assertEquals(true, true);
		System.out.println("HardAssert7");

		Assert.assertEquals(true, true);
		System.out.println("HardAssert8");

		Assert.assertEquals(true, true);
		System.out.println("HardAssert9");

		Assert.assertEquals(true, true);
		System.out.println("HardAssert10");

	}

}
