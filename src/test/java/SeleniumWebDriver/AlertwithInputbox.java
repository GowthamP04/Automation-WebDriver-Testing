package SeleniumWebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertwithInputbox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Alert alertwindow=driver.switchTo().alert();
		
		System.out.println(alertwindow.getText());
		
		alertwindow.sendKeys("welcome");
			
		alertwindow.accept();
		//alertwindow.dismiss();
		
		//validation
		
		String act_text=driver.findElement(By.xpath("//p[@id='result']")).getText();
		String exp_text="You entered: welcome";
		
		System.out.println(act_text);
		System.out.println(exp_text);
		
		if(act_text.equals(exp_text))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		
	}

}