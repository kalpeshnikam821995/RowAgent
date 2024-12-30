package testBase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class BaseClass {
	
	public WebDriver driver;
	
	@Test
	public void setup()
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\K N\\eclipse-workspace\\OpenCart\\Driver\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
	    options.setBinary("C:\\Users\\K N\\OneDrive\\Desktop\\Automation\\chrome-win64\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(10));
		
		//WebElement MyAccounttext=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Desktops")));
		//WebElement MyAccounttext=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='My Account']")));
		
		
	}

	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
