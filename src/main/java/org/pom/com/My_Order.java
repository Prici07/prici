package org.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Order {
	
	public WebDriver driver;

	@FindBy(xpath="(//span[contains(text(),'Proceed')])[2]")
     private WebElement address;
	
	@FindBy(id="cgv")
	private WebElement shipping;

	@FindBy(xpath="(//span[contains(text(),'Proceed')])[2]")
	private WebElement terms_accept;
	
	@FindBy(xpath="//a[@class='cheque']")
	private WebElement mode_of_pay;
	
	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement confirm_order;

	public My_Order(WebDriver driver4) {
		this.driver=driver4;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getShipping() {
		return shipping;
	}

	public WebElement getTerms_accept() {
		return terms_accept;
	}

	public WebElement getMode_of_pay() {
		return mode_of_pay;
	}

	public WebElement getConfirm_order() {
		return confirm_order;
	}
	



}
