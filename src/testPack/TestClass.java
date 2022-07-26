package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage.LogIn;

public class TestClass {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
      		driver.manage().window().maximize();
			
	        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	        
	        System.out.println("Validate Login Funationality");
	        LogIn login = new LogIn(driver);
	        login.sendUserName();
	        login.sendPassword();
	        login.clickOnSinginButton();
	        
	        System.out.println("Validate HomePage");
//	        Homepage home = new HomePage(driver);
//	        home.ValidateAdminTab();
//	        home.ValidatePIMTab();
//	        home.ValidateTimeTab();
	        
	}
}
