package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{

	
	@Test
	public void verify_account_registration() {
		HomePage hp= new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(10));
		WebElement MyAccounttext=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='My Account']")));
		hp.clickMyAccount();
		hp.clickRegister();
		
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		regpage.Firstname();
		regpage.Lastname();
		regpage.Email();
		regpage.Password();
		regpage.Subscribe();
		regpage.Privacy();
		regpage.Continue();
		
		String title=driver.getTitle();
		System.out.println("Title of successfull Registration Page:" +title);
	}
	
	

}
