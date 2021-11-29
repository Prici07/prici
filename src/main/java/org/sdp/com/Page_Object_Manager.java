package org.sdp.com;

import org.openqa.selenium.WebDriver;
import org.pom.com.Home_Page;
import org.pom.com.My_Order;
import org.pom.com.Sign_In;

public class Page_Object_Manager {
	
  public WebDriver driver;
	
  private Home_Page hp; //null
  private Sign_In s;  //null
  private My_Order mo; //null

public Page_Object_Manager(WebDriver driver2) {
	this.driver= driver2;
}



public Home_Page getInstanceHp() {
	if(hp==null) {
		hp=new Home_Page(driver);
	}
		
return hp;

}


public Sign_In getInstanceS() {
	if(s==null) {
		s= new Sign_In(driver);
	}
	return s;
	

}


public My_Order getInstanceMo() {
	if(mo==null) {
		mo=new My_Order(driver);
		
	}
return mo;

}}


	
	



   


 
