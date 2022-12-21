package TestNGPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert2 {
	
	@Test
	
	public void softAssertVerification() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(true, true);
		System.out.println("SoftAssert1");
		
		softAssert.assertEquals(true, false);
		System.out.println("SoftAssert2");
		
		softAssert.assertEquals(true, true);
		System.out.println("SoftAssert3");
		
		softAssert.assertEquals(true, true);
		System.out.println("SoftAssert4");
		
		softAssert.assertEquals(true, true);
		System.out.println("SoftAssert5");
		
		softAssert.assertEquals(true, true);
		System.out.println("SoftAssert6");
		
		softAssert.assertEquals(true, true);
		System.out.println("SoftAssert7");
		
		softAssert.assertEquals(true, true);
		System.out.println("SoftAssert8");
		
		softAssert.assertEquals(true, true);
		System.out.println("SoftAssert9");
		
		softAssert.assertEquals(true, true);
		System.out.println("SoftAssert10");
		
		softAssert.assertAll();
	}

}
