package com.oct_maven_project_1;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.baseclass.com.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pom.com.Home_Page;
import org.pom.com.My_Order;
import org.pom.com.Sign_In;

public class Runner_Class extends Baseclass {
	
public static WebDriver driver=Baseclass.getBrowser("chrome");
public static Home_Page hp=new Home_Page(driver);
public static Sign_In s =new Sign_In(driver);
public static My_Order mo=new My_Order(driver);
	
public static void main(String[] args) throws InterruptedException, IOException {
	
	    getUrl("http://automationpractice.com/index.php");
		max();
		actions("moveToElement",hp.getWomen());

		actions("doubleClick",hp.getTshirt());
	
		//WebElement scroll = driver.findElement(By.xpath("//div[@class="product-image-container"]"));
		explicitWait(hp.getScroll(),30);
		scrollUpandDown(hp.getScroll());
		//WebElement img = driver.findElement(By.xpath("//div[@class=\"product-image-container\"]"));
		explicitWait(hp.getImg(),30);
		clickOnElement(hp.getImg());
		frame(0);
		//WebElement color = driver.findElement(By.xpath("//a[@name=\"Blue\"]"));
		explicitWait(hp.getColor(),30);
		clickOnElement(hp.getColor());
		
		
		clickOnElement(hp.getAddtocart());
	
		defaultContent();
		explicitWait(hp.getCheckout(),30);
		clickOnElement(hp.getCheckout());
		
	    clickOnElement(hp.getCheckout_2());
	    
	    inputValueElement(s.getEmail(), "preci.pe7@gmail.com");
	    
	    inputValueElement(s.getPass(),"Prici@07");
	   
	    clickOnElement(s.getButton());
	   
	    clickOnElement(mo.getAddress());
	   
	    clickOnElement(mo.getShipping());
	    
	    clickOnElement(mo.getTerms_accept());
	    
	    clickOnElement(mo.getMode_of_pay());
	    
	    clickOnElement(mo.getConfirm_order());
	    
	    screenShots();
	    
	   
	    
	
	    
	    
	
	}


}

	


