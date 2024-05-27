package SeleniumWebAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractwithElementsUsingJS {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//JavascriptExecutor js=driver;
		
		
		//First name - inputbox
		//WebElement inputbox=driver.findElement(By.id("RESULT_TextField-1"));
		//js.executeScript("arguments[0].setAttribute('value','john')", inputbox);
		
		//Radio button
		WebElement male_Rd=driver.findElement(By.cssSelector("#male"));
		//male_Rd.click();  //ClickInterceptedException
		js.executeScript("arguments[0].click();",male_Rd);
		
		
		//Checkbox
		WebElement chkbox=driver.findElement(By.cssSelector("#sunday"));
		js.executeScript("arguments[0].click();",chkbox);
		
		
		//button
		WebElement button=driver.findElement(By.id("FSsubmit"));
		js.executeScript("arguments[0].click();",button);
		

	}

}