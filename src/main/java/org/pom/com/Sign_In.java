package org.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In {
	
	public WebDriver driver;
	
	@FindBy(id="email")
     private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement pass;
	
	@FindBy(xpath="//button[@name='SubmitLogin']")
	private WebElement button;
	
	public Sign_In(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getButton() {
		return button;
	}

	
	
	
	
	
}
 