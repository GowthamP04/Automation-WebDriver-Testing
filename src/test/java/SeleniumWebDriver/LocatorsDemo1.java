package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		//Open app
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize(); // maximize browser window
		Thread.sleep(5000);

		//search box
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");

		//search button
		driver.findElement(By.name("submit_search")).click();

		//link text & partial linktext
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		//driver.findElement(By.partialLinkText("Printed Chiffon")).click();
		driver.quit();
	}
}
