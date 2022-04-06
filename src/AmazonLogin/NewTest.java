package AmazonLogin;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.apache.poi.hssf.usermodel.*;
import AmazonLogin.ExcelData;
public class NewTest {
	public static WebDriver driver;
	public static Properties prop;
	public static String sAppURL;
	public static String username;
	public static String password;
	public static Actions actions;
	public static String readXL1;
		
	
  @Test

  public void Login_Details() throws IOException 
  	{
	  
	 	actions.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).perform();
	  	driver.findElement(By.cssSelector("div[id='nav-flyout-ya-signin'] span[class='nav-action-inner']")).click();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.cssSelector("#signInSubmit")).click();	
		String[][] data = ExcelData.readXL1();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys());
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
  	}
  

@BeforeTest
  public void beforeTest() throws FileNotFoundException, IOException {
	  try {
		  prop = new Properties();
	  }catch (Exception e) {
		  
		  e.printStackTrace();
	  }
	  prop.load(new FileInputStream("C:\\Users\\salun\\eclipse-workspace\\GroupActivity\\Configuration\\Amazon_Configuration1.properties"));
	  sAppURL = prop.getProperty("sAppURL");
	  username = prop.getProperty("uname");
	  password = prop.getProperty("pwd");
	  
	  System.setProperty("webdriver.chrome.driver","E:\\Prasad\\Capita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		actions = new Actions(driver);
	
		driver.manage().window().maximize();
		driver.get(sAppURL);
  }

  @AfterTest
  public void afterTest() {
	 
  }

}
