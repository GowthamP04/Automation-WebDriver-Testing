package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

	//@Test
	void test_hardassertions()
	{

		System.out.println("testing....");
		System.out.println("testing....");
		System.out.println("testing....");
		System.out.println("testing....");

		Assert.assertEquals(1, 2);  // if it will fail then below statement will not be executed..

		System.out.println("hard assertion completed.....");
		Assert.assertEquals(1, 1);
	}

	@Test
	void test_softassertions()
	{
		System.out.println("testing....");
		System.out.println("testing....");
		System.out.println("testing....");
		System.out.println("testing....");

		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);

		System.out.println("soft assertion completed.....");
		//sa.assertEquals(1, 1);

		sa.assertAll(); // mandatory

	}
}