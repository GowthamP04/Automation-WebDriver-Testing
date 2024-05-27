package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();

		Actions act=new Actions(driver);

		// rome---> Italy
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));

		act.dragAndDrop(rome, italy).perform(); // drag and drop


		// Wasington---> USA
		WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement usa=driver.findElement(By.xpath("//div[@id='box103']"));

		act.dragAndDrop(washington, usa).perform();

	}

}