package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerLink;
	
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement loginLink;
	
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Books')]")
	private WebElement booksLink;
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Computers')]")
	private WebElement computersLink;
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Electronics')]")
	private WebElement electronicsLink;
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Apparel & Shoes')]")
	private WebElement apparelAndShoesLink;
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Digital downloads')]")
	private WebElement digitalDownloadsLink;
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Jewelry')]")
	private WebElement jewelryLink;
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Gift Cards')]")
	private WebElement giftCardsLink;
	
	@FindBy(id="small-searchterms")
	private WebElement searchStoreTextFeild;
	
	@FindBy(css="input[value='Search']")
	private WebElement searchButton;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishlistLink;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logoutLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public  WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}

	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public WebElement getSearchStoreTextFeild() {
		return searchStoreTextFeild;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	
}
