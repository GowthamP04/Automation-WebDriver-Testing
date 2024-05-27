package SeleniumWebAdvance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleIFrames {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		//Frame1
		WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm1);

		driver.findElement(By.name("mytext1")).sendKeys("111");
		driver.switchTo().defaultContent();


		//Frame2
		WebElement frm2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frm2);

		driver.findElement(By.name("mytext2")).sendKeys("222");
		driver.switchTo().defaultContent();


		//Frame3
		WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frm3);

		driver.findElement(By.name("mytext3")).sendKeys("333");


		//Nested Frame under 3
		driver.switchTo().frame(0); //index
		driver.findElement(By.cssSelector("div.AB7Lab")).click();

		driver.switchTo().defaultContent();

		//Frame4
		WebElement frm4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frm4);

		driver.findElement(By.name("mytext4")).sendKeys("444");
		driver.switchTo().defaultContent();

		//Frame5
		WebElement frm5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frm5);

		driver.findElement(By.name("mytext5")).sendKeys("555");



	}

}