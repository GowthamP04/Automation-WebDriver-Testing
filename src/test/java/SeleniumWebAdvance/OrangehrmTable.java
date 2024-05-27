package SeleniumWebAdvance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click(); //PIM
		
		int totalrows=driver.findElements(By.xpath("//div[@class='oxd-table-body' and @role='rowgroup']/div")).size();
		
		for(int row=1;row<=totalrows;row++)
		{
			String firstname=driver.findElement(By.xpath("//div[@class='oxd-table-body' and @role='rowgroup']/div["+row+"]//div[@role='row']/div[3]/div")).getText();
			String lastname=driver.findElement(By.xpath("//div[@class='oxd-table-body' and @role='rowgroup']/div["+row+"]//div[@role='row']/div[4]/div")).getText();
			
			System.out.println(firstname+"\t"+lastname);
		}
	

	}

}