package org.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;  //null
	
	@FindBy(xpath="//a[text()='Women']")
	private WebElement women;
	
	@FindBy(xpath="(//a[text()='T-shirts'])[1]")
     private WebElement tshirt;
	
	@FindBy(xpath="//div[@class=\"product-image-container\"]")
	private WebElement scroll;
	
	@FindBy(xpath="//div[@class=\"product-image-container\"]")
	private WebElement img;
	
	@FindBy(xpath="//a[@name=\"Blue\"]")
	private WebElement color;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//span[contains(text(),'Proceed')]")
	private WebElement checkout;
	
	@FindBy(xpath="(//span[contains(text(),'Proceed')])[2]")
	private WebElement checkout_2;

	public Home_Page(WebDriver driver2) {
		this.driver=driver2;  //from runner class driver 
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getScroll() {
		return scroll;
	}

	public WebElement getImg() {
		return img;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getCheckout_2() {
		return checkout_2;
	}
	
	
	
	
	
	
     
	

}

