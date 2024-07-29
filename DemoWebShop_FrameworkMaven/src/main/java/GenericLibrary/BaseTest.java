package GenericLibrary;

	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;

import POMRepository.HomePage;
import POMRepository.LoginPage;

	
	

	public class BaseTest {

		public DataUtility data_Utility=new DataUtility();
		public  WebDriver driver;
		public static WebDriver listenersDriver;
		public POMRepository.HomePage home_Page;
		
		@BeforeClass(alwaysRun=true)
		public void launchTheBrowser() throws IOException
		{
			driver=new ChromeDriver();
			listenersDriver=driver;
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(data_Utility.getDataFromProperties("url"));
			
		}
		@BeforeMethod(alwaysRun=true)
		public void performLogin() throws IOException, InterruptedException {
			home_Page=new HomePage(driver);
			home_Page.getLoginLink().click();
			
			
			LoginPage login_Page=new LoginPage(driver);
			login_Page.getEmailTextFeild().sendKeys(data_Utility.getDataFromProperties("email"));
			login_Page.getPasswordTextFeild().sendKeys(data_Utility.getDataFromProperties("pwd"));
			login_Page.getLoginButton().click();
			Thread.sleep(3000);
			
		}
		@AfterMethod(alwaysRun=true)
		public void performLogout() {
			home_Page.getLogoutLink();
			
		}
		@AfterClass(alwaysRun=true)
		public void closeTheBrowser() {
			driver.quit();
		}
		
		
			
	}


