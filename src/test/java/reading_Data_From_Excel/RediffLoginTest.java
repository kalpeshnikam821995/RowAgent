package reading_Data_From_Excel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RediffLoginTest {
	
	public WebDriver driver;
	
	@Test(dataProvider="Rediff",dataProviderClass=ExcelData.class)
	public void rediffLoginTest(String username , String password) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\K N\\eclipse-workspace\\OpenCart\\Driver\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
	    options.setBinary("C:\\Users\\K N\\OneDrive\\Desktop\\Automation\\chrome-win64\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();
		driver.quit();
	}
	

}
