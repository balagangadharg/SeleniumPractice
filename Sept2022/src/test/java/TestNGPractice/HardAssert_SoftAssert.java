package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert_SoftAssert {

	@Test(priority = 1)
	public void hardAssert() {
		Assert.assertEquals("Bala", "Bala");
		System.out.println("Assert.assertEquals(\"Bala\", \"Bala\")");

		Assert.assertEquals("Bala", "Priyal");
		System.out.println("Assert.assertEquals(\"Bala\", \"Priyal\")");

		Assert.assertEquals("Bala", "Bala");
		System.out.println("Assert.assertEquals(\"Bala\", \"Bala\")");
	}

	@Test(priority = 2)
	public void softAssert() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("Bala", "Bala");
		System.out.println("softAssert.assertEquals(\"Bala\", \"Bala\")");

		softAssert.assertEquals("Bala", "Priyal");
		System.out.println("softAssert.assertEquals(\"Bala\", \"Priyal\")");

		softAssert.assertEquals("Bala", "Bala");
		System.out.println("softAssert.assertEquals(\"Bala\", \"Bala\")");

		softAssert.assertAll();
	}

}
