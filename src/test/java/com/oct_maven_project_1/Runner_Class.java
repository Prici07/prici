package com.oct_maven_project_1;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
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
import org.sdp.com.Page_Object_Manager;
import com.helper.File_Reader_Manager;
public class Runner_Class extends Baseclass {
	
static Logger log=Logger.getLogger(Runner_Class.class);

public static WebDriver driver=Baseclass.getBrowser("chrome");
public static Page_Object_Manager pom= new Page_Object_Manager(driver);
public static void main(String[] args) throws Throwable {
	
	PropertyConfigurator.configure("log4j.properties");
	    log.info("broswer launching");
	    String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
	    getUrl(url);
		max();
		actions("moveToElement",pom.getInstanceHp().getWomen());
		actions("doubleClick",pom.getInstanceHp().getTshirt());
	    explicitWait(pom.getInstanceHp().getScroll(),30);
		scrollUpandDown(pom.getInstanceHp().getScroll());
		explicitWait(pom.getInstanceHp().getImg(),30);
		clickOnElement(pom.getInstanceHp().getImg());
		frame(0);
		explicitWait(pom.getInstanceHp().getColor(),30);
		clickOnElement(pom.getInstanceHp().getColor());
		clickOnElement(pom.getInstanceHp().getAddtocart());
	    defaultContent();
	    explicitWait(pom.getInstanceHp().getCheckout(),30);
		clickOnElement(pom.getInstanceHp().getCheckout());
		clickOnElement(pom.getInstanceHp().getCheckout_2());
	    //String email = File_Reader_Manager.getInstanceFRM().getInstanceCR().getEmail();
	    String email = data_Driven("C:\\Users\\Daisy Rani\\eclipse-workspace\\oct_maven_project_1\\Excel\\Test case for MyStore.xlsx", 0, 2, 5);
	    
	    inputValueElement(pom.getInstanceS().getEmail(), email);
	    //String pass = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPass();
	    String password = data_Driven("C:\\Users\\Daisy Rani\\eclipse-workspace\\oct_maven_project_1\\Excel\\Test case for MyStore.xlsx", 0, 8, 5);
	    
	    inputValueElement(pom.getInstanceS().getPass(), password);
	   
	    clickOnElement(pom.getInstanceS().getButton());
	   
	    clickOnElement(pom.getInstanceMo().getAddress());
	   
	    clickOnElement(pom.getInstanceMo().getShipping());
	    
	    clickOnElement(pom.getInstanceMo().getTerms_accept());
	    
	    clickOnElement(pom.getInstanceMo().getMode_of_pay());
	    
	    clickOnElement(pom.getInstanceMo().getConfirm_order());
	    
	    screenShots();
	    log.info("your order placed successfully");
	    
	    
	}


}

	


