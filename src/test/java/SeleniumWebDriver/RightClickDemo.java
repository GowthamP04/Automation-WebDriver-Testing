package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		Actions act=new Actions(driver);

		//right click
		act.contextClick(button).perform();


		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click(); // click on copy option

		Thread.sleep(5000);

		driver.switchTo().alert().accept(); // close alert window

	}

}