package SeleniumTest;

import java.util.regex.Pattern;
import java.awt.List;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.csvreader.CsvReader;


public class lab2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private String id="";
  private String pwd="";
  private String gitUrl="";
  
  //读csv文件
  public static void readCsv(String[] stuNum, String[] emailAddress){
      try{
          
          ArrayList<String[]> csvList = new ArrayList<String[]>();
          String csvFilePath = "C:/Users/lenovo/Desktop/dasanxia/st/2nd_Experiment/info.csv";
          CsvReader reader = new CsvReader(csvFilePath, ',', Charset.forName("SJIS"));
          //reader.readHeaders();
          
          while(reader.readRecord()){// read in the data line by line
              csvList.add(reader.getValues());
              
          }
          reader.close();
          
          int i = 0;
          for(int row=0; row < csvList.size(); row++)
          {
              String num = csvList.get(row)[0];
              String email = csvList.get(row)[1];
              stuNum[i] = num;
              emailAddress[i] = email;
              i++;
              
          }
          
          
      }catch(Exception ex){
          System.out.println(ex);
      }
      
  }
  

  @Before
  public void setUp() throws Exception {
	  String driverPath = System.getProperty("user.dir") + "/src/source/geckodriver.exe";
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  driver = new FirefoxDriver();
	  baseUrl = "http://121.193.130.195:8800/login";
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  /*@Test
  public void testUntitledTestCase() throws Exception {
	  CsvReader csv = new CsvReader("C://Users//jikec//Desktop//软件测试名单.csv", ',',Charset.forName("GBK"));
	  csv.readHeaders();
	  
	  while(csv.readRecord()){
		 
		  //sid=csv.get("学号");
		  //spassword=sid.substring(4,10);
		  //sgit=csv.get("git地址");
		  System.out.println("sid3");
		  //System.out.println(sid);
		
    	driver.get("http://121.193.130.195:8800/login");
    	driver.findElement(By.name("id")).click();
    	driver.findElement(By.name("id")).clear();
    	driver.findElement(By.name("id")).sendKeys(sid);
    	driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Welcome Guest, Please Log In'])[1]/following::h4[2]")).click();
    	driver.findElement(By.name("password")).click();
    	driver.findElement(By.name("password")).clear();
    	driver.findElement(By.name("password")).sendKeys(spassword);
    	driver.findElement(By.xpath("//html")).click();
    	driver.findElement(By.id("btn_login")).click();
    	assertEquals(sgit, driver.findElement(By.id("student-git")).getText());
    	
    	
	}
  }
  */
  
  @Test
  public void testUntitledTestCase() throws Exception {
      CsvReader cin =  new CsvReader(System.getProperty("user.dir") + "/src/source/input.csv", ',',Charset.forName("GBK"));
      cin.readHeaders();
     

      while(cin.readRecord()){
    	  System.out.println("@@@@");
        id = cin.get("学号");
        pwd = id.substring(4, 10);
        gitUrl = cin.get("git地址");
        System.out.println(id);
        
        driver.get("http://121.193.130.195:8800/login");
        driver.findElement(By.name("id")).click();
        driver.findElement(By.name("id")).clear();
    	driver.findElement(By.name("id")).sendKeys(id);
        driver.findElement(By.name("password")).click();
    	driver.findElement(By.name("password")).clear();
    	driver.findElement(By.name("password")).sendKeys(pwd);
    	driver.findElement(By.id("btn_login")).click();
    	assertEquals(gitUrl, driver.findElement(By.id("student-git")).getText());
    }
  }
  
  @After
  public void tearDown() throws Exception {
//    driver.quit();
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

