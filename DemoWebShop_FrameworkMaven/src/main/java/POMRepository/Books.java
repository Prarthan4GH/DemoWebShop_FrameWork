package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books {
@FindBy(xpath = "//a[text()='Fiction EX']")
private WebElement ProductName;

@FindBy(id = "products-orderby")
private WebElement SortByDropdown;

@FindBy(id = "products-pagesize")
private WebElement DisplayPerPageDropdown;

@FindBy(id = "products-viewmode")
private WebElement ViewAsDropdown;

@FindBy(xpath = "//div/*[text()='Books']")
private WebElement BooksText;


public Books (WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getProductName() {
	return ProductName;
}

public WebElement getSortByDropdown() {
	return SortByDropdown;
}

public WebElement getDisplayPerPageDropdown() {
	return DisplayPerPageDropdown;
}

public WebElement getViewAsDropdown() {
	return ViewAsDropdown;
}
public WebElement getBooksText() {
	return BooksText;
}


}



