package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	WebDriver driver;
	 
	public AccountRegistrationPage(WebDriver driver) {
		
		super(driver);
	}

	@FindBy(xpath="//input[@id='input-firstname']") WebElement txtFirstname;

	@FindBy(xpath="//input[@id='input-lastname']") WebElement txtLastname;
	
	@FindBy(xpath="//input[@id='input-email']") WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-password']") WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='input-newsletter']") WebElement tooglesubcribe;
	
	@FindBy(xpath="//input[@name='agree']") WebElement toogleprivacy;
	
	@FindBy(xpath="//button[normalize-space()='Continue']") WebElement BtnContinue;
	
	public void Firstname() {
		txtFirstname.sendKeys("Sagar");
	}
	
	public void Lastname() {
		txtLastname.sendKeys("Patil");
	}
	
	public void Email() {
		txtEmail.sendKeys("Sagar.patil4321@gmail.com");
	}
	
	public void Password() {
		txtPassword.sendKeys("Sagarpatil4321");
	}
	
	public void Subscribe() {
		tooglesubcribe.click();
	}
	
	public void Privacy() {
		toogleprivacy.click();
	}
	
	public void Continue() {
		BtnContinue.click();
	}
}
