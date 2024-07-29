package TestScripts;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;
import POMRepository.Books;
import POMRepository.FictionEx;
import POMRepository.WishlistPage;


public class WishList  extends BaseTest{
	@Test(groups = "smoke")
	public void Verify_user_is_able_To_Add_Product_To_Wishlist()
	{
		home_Page.getBooksLink().click();
		//validation
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books");
		Reporter.log("Book Page Successfully",true);
		
		//navigate to product page
		 Books book_Page = new Books(driver);
		String expProductName = book_Page.getProductName().getText();
		book_Page.getProductName().click();
		
		//validation
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Fiction EX");
			Reporter.log("Fiction Page Successfully",true);
		
		
		 FictionEx product_Page = new FictionEx(driver);
		product_Page.getAddToWishlistButton().click();
		
		home_Page.getWishlistLink().click();
		//validation
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Wishlist");
		Reporter.log("Wishlist Page Successfully",true);
		
		driver.navigate().refresh();
		
		 WishlistPage wishList_Page = new WishlistPage(driver);
		 String actProductName=wishList_Page.getFictionExWishListText().getText();
		 
		 Assert.assertEquals(expProductName,actProductName);
			 System.out.println("Verify_user_is_able_To_Add_Product_To_Wishlist is  pass");
		List<WebElement> allRemoveCheckBox = wishList_Page.getRemoveBooksFromcart();
		for( WebElement checkBox :allRemoveCheckBox)
		{
			checkBox.click();
		}
		wishList_Page.getUpdateWishlistButton().click();
		
		driver.close();
	}

}
