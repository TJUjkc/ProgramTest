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

public class testcsv {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  
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
	
}
