package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase {

	WebDriver driver;
	//LoginPageObjectWithBy lp;
	LoginWithPageFactory lp;

	@BeforeClass
	public void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

	}

	@Test(priority=1)
	public void testLogo()
	{
		//lp=new LoginPageObjectWithBy(driver);
		lp=new LoginWithPageFactory(driver);

		Assert.assertEquals(lp.checkLogoPresence(), true);
	}


	@Test(priority=2)
	public void testLogin()
	{
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickSubmit();

		Assert.assertEquals(driver.getTitle(),"OrangeHRM");

	}

	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}