package plainttiffrecentlawsuitstc;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import utils.screesnhot;

public class Fetch2ndlawsuit extends screesnhot {

	public void cllickon2strecentlawsuit(ChromeDriver driver) throws InterruptedException {

		try {
			driver.findElementByXPath("//li[@class='hs-postlisting-item'][2]/a").click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElementByXPath("//li[@class='hs-postlisting-item'][2]/a"));
		}}
		
		public void assertcheck(ChromeDriver driver) throws IOException{

		String title = driver.findElementById("hs_cos_wrapper_name").getText();

		String titleprefix = driver.findElementByXPath("//div[@class='plaintiff_content']/ul/li[1]").getText().substring(6);
		System.out.println(titleprefix);

		String titlesuffix = driver.findElementByXPath("//div[@class='defendant_content']/ul/li[1]").getText().substring(6);
		System.out.println(titlesuffix);

		String Finaltitle = titleprefix+" v. "+titlesuffix;
		System.out.println(Finaltitle);

		if(title.contains(Finaltitle)){
			System.out.println("Info of "+titleprefix+ " v. "+titlesuffix);
		}else {
			this.getscreenshot(driver, "test2.png") ; 
			Assert.fail("Please refer screenshots");
		}
	}

	//to get plaintiff info


	public void get2stplaintiffinfo(ChromeDriver driver){
		List<WebElement> plantiff = driver.findElementsByXPath("//div[@class='plaintiff_content']/ul/li");

		for (WebElement plantiffinfo : plantiff) {

			System.out.println("Plantiff info"+ plantiffinfo.getText());

		}
	}


	//to get defendant info
	public void get2stdefendantinfo(ChromeDriver driver){
		List<WebElement> defendant = driver.findElementsByXPath("//div[@class='defendant_content']/ul/li");

		for (WebElement defendantinfo : defendant) {

			System.out.println("Defendant info"+ defendantinfo.getText());


		}
	}

}
