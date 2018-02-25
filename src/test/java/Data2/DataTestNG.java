package Data2;

import org.testng.annotations.Test;
//import org.testng.log4testng.Logger;
import org.testng.annotations.BeforeTest;

//import java.util.logging.LogManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DataTestNG {
	WebDriver driver;
	//public static Logger logger= LogManager.getLogger(DataTestNG.class);
	
  @Test
  public void f() {
	  	String gettitle=driver.getTitle();
	  	System.out.println(gettitle);
	  	//logger.info("This is just a logger");
	  	//logger.error("a");
	  	//logger.fatal("b");
	  	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shalini20\\Desktop\\CGI PROJECT\\chromedriver.exe");				
      driver = new ChromeDriver();	
      driver.get("http://www.google.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
