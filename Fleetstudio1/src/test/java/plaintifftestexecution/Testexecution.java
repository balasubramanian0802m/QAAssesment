package plaintifftestexecution;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import plainttiffrecentlawsuitstc.Fetch1stlawsuit;
import plainttiffrecentlawsuitstc.Fetch2ndlawsuit;
import plainttiffrecentlawsuitstc.Fetch3rdlawsuit;
import plainttiffrecentlawsuitstc.Fetch4thlawsuit;
import plainttiffrecentlawsuitstc.Fetch5thlawsuit;


public class Testexecution {
	
	
	

	
public static void main(String[] args) throws InterruptedException, IOException {
	
	

	
	
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/m balasubramanian/Documents/Testleaf/Fleetstudio/Driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
		
	driver.get("https://www.accessibility.com/digital-lawsuits");
    driver.manage().window().maximize();
    driver.findElementById("hs-eu-confirmation-button").click();
	Thread.sleep(2000);
		
		
		Fetch1stlawsuit Fetch1stlawsuit = new Fetch1stlawsuit();
		Fetch1stlawsuit.cllickon1strecentlawsuit(driver);
		Fetch1stlawsuit.assertcheck(driver);
		Fetch1stlawsuit.get1stplaintiffinfo(driver);
		Fetch1stlawsuit.get1stdefendantinfo(driver);
		
		
		Fetch2ndlawsuit Fetch2ndlawsuit = new Fetch2ndlawsuit();
		Fetch2ndlawsuit.cllickon2strecentlawsuit(driver);
		Fetch2ndlawsuit.assertcheck(driver);
		Fetch2ndlawsuit.get2stplaintiffinfo(driver);
		Fetch2ndlawsuit.get2stdefendantinfo(driver);
		
		
		Fetch3rdlawsuit Fetch3rdlawsuit = new Fetch3rdlawsuit();
		Fetch3rdlawsuit.cllickon3strecentlawsuit(driver);
		Fetch3rdlawsuit.assertcheck(driver);
		Fetch3rdlawsuit.get3stplaintiffinfo(driver);
		Fetch3rdlawsuit.get3stdefendantinfo(driver);
		
		
		Fetch4thlawsuit Fetch4thlawsuit = new Fetch4thlawsuit();
		Fetch4thlawsuit.cllickon4strecentlawsuit(driver);
		Fetch4thlawsuit.assertcheck(driver);
		Fetch4thlawsuit.get4stplaintiffinfo(driver);
		Fetch4thlawsuit.get4stdefendantinfo(driver);
		
		
		Fetch5thlawsuit Fetch5thlawsuit = new Fetch5thlawsuit();
		Fetch5thlawsuit.cllickon5strecentlawsuit(driver);
		Fetch5thlawsuit.assertcheck(driver);
		Fetch5thlawsuit.get5stplaintiffinfo(driver);
		Fetch5thlawsuit.get5stdefendantinfo(driver);
		
		System.out.println("Plaintiff and defendant info are captured for all the recent lawsuits");
		
		
		
		
	}

}
