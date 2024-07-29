package TestScripts.Register;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class RegisterTestCase extends GenericLibrary.BaseTest
{
	@Test(groups="smoke",dataProvider="RegisterData")
    public void verify_User_Is_Able_to_Register(String firstName,String lastName,String email,String password,String confirmPassword) throws EncryptedDocumentException, IOException 
	{
		
	  String modEmail=new Random().nextInt(3000)+email;
		home_Page.getLogoutLink().click();
		
		home_Page.getRegisterLink().click();
		
	     POMRepository.RegisterPage register_page = new POMRepository.RegisterPage(driver);
	    register_page.getMaleRadioButton().click();
	    register_page.getFirstNameTextFeild().sendKeys(firstName);
	    register_page.getLastNameTextFeild().sendKeys(lastName);
	    register_page.getEmailTextFeild().sendKeys(modEmail);
	    register_page.getPasswordTextFeild().sendKeys(password);
	    register_page.getConfirmPasswordTextFeild().sendKeys(confirmPassword);
	    register_page.getRegisterButton().click();
	  //validation
		 if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/registerresult/1"))
			{
				System.out.println("Test Case pass");
			}
			else
			{
				System.out.println("Testcase Fail");
			}
		 
		
		 }
	 @DataProvider(name="RegisterData")
	 public Object[][] dataSupply() throws EncryptedDocumentException, IOException{
		return  data_Utility.getMultipleDataFromExcel("RegisterData");
	    
    }
}

