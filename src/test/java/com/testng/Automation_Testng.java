package com.testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.baseclass.com.Baseclass;
import org.openqa.selenium.WebDriver;
import org.sdp.com.Page_Object_Manager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.helper.File_Reader_Manager;
import com.oct_maven_project_1.Runner_Class;

public class Automation_Testng extends Baseclass {
	
	static Logger log=Logger.getLogger(Automation_Testng.class);

	public static WebDriver driver=Baseclass.getBrowser("chrome");
	public static Page_Object_Manager pom= new Page_Object_Manager(driver);
	//public static void main(String[] args) throws Throwable {
	
	@BeforeSuite
	private void log() {
		PropertyConfigurator.configure("log4j.properties");
		    log.info("broswer launching");}
		    
	@Test(priority=1)
		    private void home_Page() throws Throwable {
		    String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		    getUrl(url);
			max();}
	
		    @Test(priority=2,enabled=true)
		    private void women() {
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
			implicitlyWait(30,TimeUnit.SECONDS );}
		    
			@Test(priority=3)
			private void login() throws Throwable {
			 String email = data_Driven("C:\\Users\\Daisy Rani\\eclipse-workspace\\oct_maven_project_1\\Excel\\Test case for MyStore.xlsx", 0, 2, 5);
		    
		    inputValueElement(pom.getInstanceS().getEmail(), email);
		    //String pass = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPass();
		    String password = data_Driven("C:\\Users\\Daisy Rani\\eclipse-workspace\\oct_maven_project_1\\Excel\\Test case for MyStore.xlsx", 0, 8, 5);
		    
		    inputValueElement(pom.getInstanceS().getPass(), password);
		    clickOnElement(pom.getInstanceS().getButton());}
		   
			
			@Test(priority=4)
		   private void summary_Order() throws Throwable {
			   
		    clickOnElement(pom.getInstanceMo().getAddress());
		    clickOnElement(pom.getInstanceMo().getShipping());
		    clickOnElement(pom.getInstanceMo().getTerms_accept());
		    clickOnElement(pom.getInstanceMo().getMode_of_pay());}
			
			@AfterSuite
		    private void confrim() throws Throwable {
		    clickOnElement(pom.getInstanceMo().getConfirm_order());
		    screenShots();
		    log.info("your order placed successfully");}
		    
		    
}


	



