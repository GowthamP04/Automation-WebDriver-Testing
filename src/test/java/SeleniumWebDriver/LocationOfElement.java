package SeleniumWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationOfElement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));


		System.out.println("Before maximizing window:"+logo.getLocation()); //(250, 202)

		driver.manage().window().maximize();
		System.out.println("After maximizing window:"+logo.getLocation());  //(660, 185)

		driver.manage().window().minimize();
		System.out.println("After minimizing window:"+logo.getLocation()); //(250, 157)

		driver.manage().window().fullscreen();
		System.out.println("After Full screen window:"+logo.getLocation());  //(660, 233)

		Point p=new Point(100,100);
		driver.manage().window().setPosition(p);
		System.out.println("After setting window 100 * 100:"+logo.getLocation());  //(251, 159)

		p=new Point(50,50);
		driver.manage().window().setPosition(p);
		System.out.println("After setting window 50 * 50:"+logo.getLocation());  //(252, 160)

	}

}