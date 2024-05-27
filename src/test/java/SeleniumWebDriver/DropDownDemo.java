package SeleniumWebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		//setup over
		
		//Handle drop downs without using 'select' class
		//****************************************************
		
		//select country
		/*driver.findElement(By.id("country-list")).click(); //click on Select country drop down
		List<WebElement> country=driver.findElements(By.xpath("//select[@id='country-list']//option")); // capture all countries
		
		System.out.println(country.size()); // Count number of countries
		
		for(WebElement opt:country) // Select country
		{
			if(opt.getText().equals("France"))
			{
				opt.click();
					break;
			}
		}
		
		Thread.sleep(3000);
		
		//Now select state
		driver.findElement(By.id("state-list")).click(); //click on Select state drop down
		List<WebElement> states=driver.findElements(By.xpath("//select[@id='state-list']//option")); // capture all states
		
		System.out.println(states.size()); // Count number of states
		
		for(WebElement opt:states) // Select country
		{
			if(opt.getText().equals("Alsace"))
			{
				opt.click();
				break;
			}
		}
		*/
			
		//Now , Handle drop downs using 'select' class
		//****************************************************
	 
		
		//Select Country
		WebElement country=driver.findElement(By.id("country-list"));
		Select countrydrp=new Select(country);
					
		List<WebElement> cnt=countrydrp.getOptions();
		System.out.println(cnt.size());
		
		countrydrp.selectByVisibleText("France");
		
		Thread.sleep(3000);
		
		//Select state
		WebElement state=driver.findElement(By.id("state-list"));
		Select statedrp=new Select(state);
					
		cnt=statedrp.getOptions();
		System.out.println(cnt.size());
		
		statedrp.selectByVisibleText("Alsace");

	}

}