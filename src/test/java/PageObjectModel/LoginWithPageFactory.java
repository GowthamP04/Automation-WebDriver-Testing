package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginWithPageFactory {

	public WebDriver driver;

	//Constructor
	LoginWithPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	// WebElements Locators+identification
	//@FindBy(how=How.XPATH, using="//img[@alt='company-branding']")

	@FindBy(xpath="//img[@alt='company-branding']")
	public static WebElement img_logo;

	@FindBy(name="username")
	public static WebElement txt_username;

	@FindBy(css="input[placeholder='Password']")
	public static WebElement txt_password;

	@FindBy(xpath="//button[normalize-space()='Login']")
	public static WebElement btn_submit;

	//@FindBy(tagName="a")
	//List<WebElement> links;

	//Action methods

	public void setUserName(String username)
	{
		txt_username.sendKeys(username);
	}

	public void setPassword(String password)
	{
		txt_password.sendKeys(password);
	}

	public void clickSubmit()
	{
		btn_submit.click();
	}

	public boolean checkLogoPresence()
	{
		boolean status=img_logo.isDisplayed();
		return status;
	}
}