package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult"); // switch to frame
		
		WebElement f1=driver.findElement(By.xpath("//input[@id='field1']"));
		f1.clear();
		f1.sendKeys("Welcome");
		
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(button).perform(); // double click action

		//validation
		WebElement f2=driver.findElement(By.xpath("//input[@id='field2']"));
		
		//String copiedtext=f2.getText();  // will not work
		String copiedtext=f2.getAttribute("value");// this will work
		
		System.out.println("Copied text is:"+copiedtext);
		
		if(copiedtext.equals("Welcome"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");

	}

	}
}