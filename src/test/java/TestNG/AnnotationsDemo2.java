package TestNG;

import org.testng.annotations.*;

public class AnnotationsDemo2 {

	@BeforeClass
	void login()
	{
		System.out.println("Login...");
	}
		
	@Test(priority=1)
	void search()
	{
		System.out.println("Search...");
	}
	
	@Test(priority=2)
	void advacedsearch()
	{
		System.out.println("Advanced search...");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("Logout...");
	}
}