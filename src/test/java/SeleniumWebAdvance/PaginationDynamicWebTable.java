package SeleniumWebAdvance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationDynamicWebTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		//Login
		WebElement username=driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");  //demo

		WebElement password=driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo"); //demo

		driver.findElement(By.xpath("//button[text()=' Login']")).click();

		//popup screen
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}


		//Customers--->customers

		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@class='collapse show']//a[contains(text(),'Customers')]")).click();

		Thread.sleep(5000);


		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();  //Showing 91 to 100 of 5513 (552 Pages)


		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1)); //print the exact pages


		System.out.println("Total number of pages:"+total_pages);

		for(int p=1;p<=10;p++)   //for(int p=1;p<=total_pages;p++)
		{
			if(total_pages>1)
			{
				WebElement active_Page=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));
				System.out.println(" Active Page : "+active_Page.getText());
				active_Page.click();
				Thread.sleep(2000);
			}

			int noOfrows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println(" Total No Of Rows in active Page : "+noOfrows);

			for(int r=1;r<=noOfrows;r++)
			{
				String customerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String customerEmail=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();

				System.out.println(customerName+"      "+customerEmail+"          "+status);
			}

		}

		driver.quit();


	}

}