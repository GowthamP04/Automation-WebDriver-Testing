package SeleniumWebAdvance;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+links.size()); //48
		
		int brokenlinks=0;
		
		for(WebElement linkEle:links)
		{
			String hrefAttValue=linkEle.getAttribute("href");
			System.out.println(hrefAttValue);
			
			// pre-requisite for checking broken link
			if(hrefAttValue==null || hrefAttValue.isEmpty())
			{
				System.out.println("href attribute value is empty.");
				continue;
			}
			
			//Checking link is broken or not
			URL linkurl=new URL(hrefAttValue); // convert String --> URL format
						
			HttpURLConnection conn=(HttpURLConnection) linkurl.openConnection(); ////send request to server - open , connect
			
			conn.connect();
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println(hrefAttValue+"     "+"====> Broken Link");
				brokenlinks++;
			}
			else
			{
				System.out.println(hrefAttValue+"     "+"====> Not Broken Link");
			}
			
			
		}
		
		System.out.println("total number of broken links:"+brokenlinks);

	}

}