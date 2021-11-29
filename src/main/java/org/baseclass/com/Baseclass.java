package org.baseclass.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	
	public static WebDriver driver;
	public static String value;
	
	public static WebDriver getBrowser(String type) {

   if (type.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir")+"//newdriver//chromedriver.exe");
	 driver=new ChromeDriver();
	
} else if(type.equalsIgnoreCase("firefox")){
	System.setProperty("webdriver.gecko.driver",
			System.getProperty("user.dir")+"//newdriver//gecko.exe");
	driver=new FirefoxDriver();
}
   driver.manage().window().maximize();
   
   return driver;
	}
	
	public static void clickOnElement(WebElement element) {
		try {
		element.click();
		}catch(Exception e) {
			   e.printStackTrace();
	
	}}
	
	public static void inputValueElement(WebElement element,String value) {
		try {
		element.sendKeys(value);
		}catch(Exception e) {
			   e.printStackTrace();

	}}
	public static void getUrl(String url) {
		try {
		driver.get(url);
	}catch(Exception e) {
		   e.printStackTrace();

	}}
	public static void close() {
		try {
		driver.close();
	}catch(Exception e) {
		   e.printStackTrace();

	}}
	public static void quit() {
		try {
	driver.quit();
	}catch(Exception e) {
		   e.printStackTrace();

	}}
	
	public static void max() {
		driver.manage().window().maximize();
		

   }
	 public void getText(WebElement element) {
		 try {
			String text = element.getText();
			System.out.println(text);
		 }catch(Exception e) {
			   e.printStackTrace();

		}}
	    //attribute
	   public void getAttribute(WebElement element, String str) {
		   try {
		String attribute = element.getAttribute(str);
		System.out.println(attribute);
		   }catch(Exception e) {
			   e.printStackTrace();
	} }
	   //getsize
	   public void getSize(WebElement element) {
		   try {
		   Dimension size = element.getSize();
		   System.out.println(size);
		   }catch(Exception e) {
			   e.printStackTrace();
	}
	   }
	  public void getLocation(WebElement element) {
		  try {
		  Point location = element.getLocation();
		  System.out.println(location);
		  }catch(Exception e) {
			   e.printStackTrace();

	}}
	   
    //actions
    public static void actions(String type,WebElement element) {
	Actions ac= new Actions(driver);
	if (type.equalsIgnoreCase("moveToElement")) {
		ac.moveToElement(element).build().perform();
		
	} else if(type.equalsIgnoreCase("click")) {
		ac.click(element).build().perform();

	}else if(type.equalsIgnoreCase("contextClick")) {
		ac.contextClick(element).build().perform();
	
	}else if(type.equalsIgnoreCase("doubleClick")) {
		ac.doubleClick(element).build().perform();
		
    }else if(type.equalsIgnoreCase("clickAndHold")) {
    	ac.clickAndHold(element).build().perform();
    }
    }
    public static void actionsDragDrop(WebElement drag,WebElement drop) {
    		Actions ac= new Actions(driver);
		ac.dragAndDrop(drag,drop).build().perform();
	}
    //frame
    public static void frame(int a) {   //framein
    	try {
		driver.switchTo().frame(a);
    	}catch (Exception e) {
 		   e.printStackTrace();
    	}

	}
    public static void defaultContent() { //frameout
		driver.switchTo().defaultContent();
}
    //dropdown
    
    public static void dropDown(String type,WebElement ele, String value) {
		Select s=new Select(ele);
	if (type.equalsIgnoreCase("ByValue")) {
		s.selectByValue(value);
	
	} else if (type.equalsIgnoreCase("ByVisibleText")){
		s.selectByVisibleText(value);
		
	}else if(type.equalsIgnoreCase("ByIndex")) {
		int data = Integer.parseInt(value);
		s.selectByIndex(data);
	}}
    	
   
    public static void isSelected(WebElement ele) {
		boolean selected = ele.isSelected();
		System.out.println(selected);
	}	
//getoptions
    public static void getOptions(WebElement ele) {
    	Select s=new Select(ele);
    	List<WebElement> options = s.getOptions();
    	for (WebElement op : options) {
    		System.out.println(op.getText());
			
    	}}
         //firstselected
    public static void firstSelectedOp(WebElement ele) {
    	Select s=new Select(ele);
    	WebElement FirstSelectedOption = s.getFirstSelectedOption();
    	System.out.println(FirstSelectedOption.getText());

		}
    public static void getAllSelectedOP(WebElement ele) {
    	Select s=new Select(ele);
    	List<WebElement> allSelectedOp = s.getAllSelectedOptions();
      for (WebElement op : allSelectedOp) {
    	  System.out.println(op.getText());
      }}
      
    public static  void isMultiple(WebElement ele) {
    	Select s=new Select(ele);
    	boolean multiple = s.isMultiple();
    	System.out.println("sucess");

	}
    
    //scrollUpandDown
   public static void scrollUpandDown(WebElement element) {
	   try {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].scrollIntoView();",element); 
	   //js.executeScript("window.scrollBy(0, "+a+")");
	   }catch (Exception e) {
		   e.printStackTrace();
	}
	}
   
  // wait element to be clickable
   public static void explicitWait(WebElement ele,int a) {
	   WebDriverWait wait=new WebDriverWait(driver,a);
	   wait.until(ExpectedConditions.elementToBeClickable(ele));
		

}
   
   public static void implicitlyWait(long time,TimeUnit unit ) {
	   driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	

}
   //screenshots
   public static void screenShots() throws IOException {
	   TakesScreenshot tc=(TakesScreenshot)driver;
	    File source = tc.getScreenshotAs(OutputType.FILE);
	    File destination=new File ("C:\\Users\\Daisy Rani\\eclipse-workspace\\oct_maven_project_1\\screenshot\\mail1.png");
	    FileUtils.copyFile(source, destination);
}
   public static void thread(int millis) throws InterruptedException {
	   try {
	Thread.sleep(millis);
	   } catch(Exception e) {
	   e.printStackTrace();
   }}
    	
//isdisplayed
	public static void isDisplayed(WebElement element) {
	boolean displayed = element.isDisplayed();
	System.out.println(displayed);

	}
	//isenabled
  public static void isEnable(WebElement element) {
	boolean enabled = element.isEnabled();
	System.out.println(enabled);

  }
  
  public static void navigateTo(String URL) {
		driver.navigate().to(URL);
  }
	public static void navigateBack() {
			driver.navigate().back();

		}
		
	public static void navigateForward() {
			driver.navigate().forward();
			
		}
	
	public static void navigateReFresh() {
		driver.navigate().refresh();	

		}
	
     //Robot
  public static void robot(WebElement element,String value) throws AWTException {
	  Actions ac= new Actions(driver);
	  ac.contextClick(element).build().perform();
	  Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
	      r.keyRelease(KeyEvent.VK_DOWN);
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);

	}
  //windows handlings
  public static void windowhandles(WebElement element) {
	  Set<String> child = driver.getWindowHandles();
	  element.click();
	  Set<String> parent = driver.getWindowHandles();
	  String u=null;
	  for (String s : parent) {
		  if(!s.equals(child)) {
		  u=s;
	  }}
		driver.switchTo().window(u);
	}
  
  public static String data_Driven(String path, int sh,int r,int c) throws Throwable {
	  File f= new File(path);
	  FileInputStream fis= new FileInputStream(f);
	  Workbook w= new XSSFWorkbook(fis);
	  Sheet sheetAt = w.getSheetAt(sh);
	  Row row = sheetAt.getRow(r);
	  Cell cell = row.getCell(c);
	  CellType cellType = cell.getCellType();
	  if(cellType.equals(cellType.STRING)){
		  value = cell.getStringCellValue();
	  }
		    else if(cellType.equals(cellType.NUMERIC)) {
		    	double numericCellValue = cell.getNumericCellValue();   
		    	int val=(int)numericCellValue;
		        value = String.valueOf(val);
		    }
		    return value;
		    }
  
  //public static void data_drivenwrite() {
  // File f= new File(path);
  //  FileInputStream fis= new FileInputStream(f);
  //  Workbook w= new XSSFWorkbook(fis);
  //  Sheet sheetAt = w.getSheetAt(sh);
	




	  
  public static void alerts(WebElement element,String type) {
	  element.click();
	  Alert a = driver.switchTo().alert();
	  if(type.equalsIgnoreCase("accept")) {
		  a.accept();
		  driver.switchTo().defaultContent();
	  } else {
		  a.dismiss();
		  driver.switchTo().defaultContent();
		   
	  }
  
  }}
  /*public static void alert1(WebElement element,String value) {
	element.click();
	WebDriver alert = driver.switchTo().defaultContent();
	alert.inputValueElement(value);*/


  
  

	  
  
	


    
    

	
	
	
	

