package SeleniumWebAdvance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		// 1) Find total number of rows 
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //7  preferred
		//int rows=driver.findElements(By.tagName("tr")).size(); //8   prefered only if you have one single table
		System.out.println("Number of rows:"+ rows); //7
		
		
		//2) Find total number of columns
		
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		//int cols=driver.findElements(By.tagName("th")).size(); // dont prefer if you have multiple tables
		
		System.out.println("Number of columns:"+ cols); //4
		
		
		//3) Read specific row & column data
		//String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
		//System.out.println(value); //Master In JS
		
		
		//4) Read data from all the rows & columns
		
		/*System.out.println("Book Name"+"     "+"Author"+"    "+"Subject"+"       "+"Price");
		
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText(); //["+r+"] and ["+c+"] are print the all data
				System.out.print(value+"\t"); 
			}
			System.out.println();
		}
		*/
			
		
		//5) Print book names whose author is Amit
		
		for(int r=2;r<=rows;r++)
		{
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			
			if(author.equals("Mukesh"))
			{
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(author+"    "+bookname);
			}
			
		}
		
		
		//6)Find sum of prices for all the books
		
		int sum=0;
		for(int r=2;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
			sum=sum+Integer.parseInt(price);
			
		}
		
		System.out.println("Total price of books:"+sum);
	}
}