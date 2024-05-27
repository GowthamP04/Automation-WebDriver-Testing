package SeleniumWebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BingAutoSuggestSearch {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().deleteAllCookies(); //deletes all the cookies in your browser

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.get("https://www.bing.com/");

		// driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("selenium");

		List<WebElement> list= driver.findElements(By.xpath("//li[contains(@class,'sa_sg')]//span")); //working - using partial xpath

		System.out.println("size of elements"+ list.size());

		for (int i=0;i<list.size();i++)   //for loop
		{
			if(list.get(i).getText().equals("selenium tutorial"))
			{
				list.get(i).click();
				break;
			}
		}

		/*  for (WebElement li : list) {    //for each loop
if(li.getText().equals("selenium tutorial")){
li.click();
break;

}
} */

	}

}