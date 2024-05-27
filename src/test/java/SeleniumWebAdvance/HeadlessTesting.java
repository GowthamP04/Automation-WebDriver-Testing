package SeleniumWebAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessTesting {

	public static void main(String[] args) throws InterruptedException {
		
////////chrome browser    ///////////		
		
	//Appraoch1) Headless mode
	ChromeOptions options=new ChromeOptions();
	//options.setHeadless(true);
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(options);
	
	
	//Appraoch2) WDM 5.1+
	//ChromeOptions options=new ChromeOptions();
	//options.setHeadless(true);
	
	//WebDriver driver=WebDriverManager.chromedriver().capabilities(options).create();
	
//////////edge browser    /////////////
	
	//Appraoch1
 /*EdgeOptions options=new EdgeOptions();
	options.setHeadless(true);
	
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver(options);
	*/
	
	//Appraoch 2
	/*EdgeOptions options=new EdgeOptions();
	options.setHeadless(true);
	
	WebDriver driver=WebDriverManager.edgedriver().capabilities(options).create();*/
	
			
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(3000);
		
	driver.findElement(By.name("username")).sendKeys("Admin");
		 
	driver.findElement(By.name("password")).sendKeys("admin123");
			
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	// validation
	
	String act_title=driver.getTitle();
	String exp_title="OrangeHRM";
	
	if(act_title.equals(exp_title))
	{
		System.out.println("Login test passed");
	}
	else
	{
		System.out.println("Login Test failed");
	}
	
//7. close browser
	
	driver.quit();
	

	}

}