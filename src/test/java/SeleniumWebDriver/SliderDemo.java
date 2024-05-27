package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();

		Actions act=new Actions(driver);

		//Min slider
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("Current location of min slider:"+min_slider.getLocation());  //(59, 250) x,y
		act.dragAndDropBy(min_slider, 100, 250).perform();
		System.out.println("Location of min slider After moving:"+min_slider.getLocation());  

		//Max slider
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Current location of max slider:"+max_slider.getLocation()); //(796, 250)

		act.dragAndDropBy(max_slider, -96, 250).perform();
		System.out.println("Location of max slider after moving:"+max_slider.getLocation());

	}

}