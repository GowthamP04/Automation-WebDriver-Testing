package SeleniumWebAdvance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabsAndWindows {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.opencart.com/");

		driver.switchTo().newWindow(WindowType.TAB); // OPENS NEW TAB
		//driver.switchTo().newWindow(WindowType.WINDOW); // OPENS IN ANOTHER WINDOW


		driver.get("https://opensource-demo.orangehrmlive.com/");


	}

}