package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement UserName;

	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement SigninButton;
	
	 public LogIn(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait( driver, Duration.ofSeconds(20));
	}
	
	public void sendUserName()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtUsername']")));
		UserName.sendKeys("Admin");
	}

	public void sendPassword()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtPassword']")));
		Password.sendKeys("admin123");
	}
	
	public void clickOnSinginButton()
	{
		SigninButton.click();
	}
	
	public void VerifiyUserNameField()
	{
		UserName.isDisplayed();
	}

}
