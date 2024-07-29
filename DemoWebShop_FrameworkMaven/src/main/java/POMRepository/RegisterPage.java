package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	
	
	@FindBy(id="gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id="gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(id="FirstName")
	private WebElement firstNameTextFeild;
	
	@FindBy(css="input[name='LastName']")
	private WebElement lastNameTextFeild;
	
	@FindBy(css="input[name='Email']")
	private WebElement emailTextFeild;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement passwordTextFeild;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTextFeild;
	
	@FindBy(id="register-button")
	private WebElement registerButton;
	
	@FindBy(xpath="//div[contains(text(),'Your registration completed')]")
	private WebElement registrationCompleted;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTextFeild() {
		return firstNameTextFeild;
	}

	public WebElement getLastNameTextFeild() {
		return lastNameTextFeild;
	}

	public WebElement getEmailTextFeild() {
		return emailTextFeild;
	}

	public WebElement getPasswordTextFeild() {
		return passwordTextFeild;
	}

	public WebElement getConfirmPasswordTextFeild() {
		return confirmPasswordTextFeild;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getRegistrationCompleted() {
		return registrationCompleted;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
	
	
}

