package com.testng;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Simple_Annotation {
	
	static Logger log=Logger.getLogger(Simple_Annotation.class);
	@Test(priority=2)
	private void log4j() {
		PropertyConfigurator.configure("log4j.properties");
        log.info("started");
	}

    @BeforeSuite
    private void setproperty() { 
	System.out.println("set property"); } 
    
	@BeforeTest
	private void browserLaunch() { System.out.println("browserLaunch"); }
	@BeforeClass
	private void url() { System.out.println("url"); }
	 
	@Test
 private void women() {
	 System.out.println("women");
 }
 
 @AfterMethod
 private void signOff() {
	 System.out.println("signOff");
 }
 @Ignore
 private void tShirt() {
	 System.out.println("tShirt");
 }
 @Test(enabled=false)
 private void dresses() {
	 System.out.println("dresses");

}
 @Test
 private void men() {
	 System.out.println("men");
	 
 }
 @Test(priority=1)
 private void mshirt() {
	 System.out.println("mshirt");

}
 @Test(priority=-1)
 private void trouser() {
 System.out.println("trouser");
}
 @AfterSuite
 private void children() {
	 System.out.println("children");
 }
@BeforeMethod
@Parameters({"email","password"})
 private void signIn(@Optional("sp@gmail.com")String value,String pass) {
	 System.out.println(value);
	 System.out.println(pass);
 }
 
 }
 