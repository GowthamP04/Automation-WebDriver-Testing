package SeleniumWebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		Thread.sleep(3000);

		List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));

		System.out.println("Number of suggestions:"+list.size());


		//select an option from list
		for(int i=0;i<list.size();i++)
		{
			String text=list.get(i).getText();

			if(text.equals("selenium tutorial"))
			{
				list.get(i).click();
				break;
			}

		}

		/*for (WebElement li : list) {    //for each loop
if(li.getText().equals("selenium tutorial")){
li.click();
break;

}*/
	}

}