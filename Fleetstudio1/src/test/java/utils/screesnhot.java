package utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import org.openqa.selenium.io.FileHandler;

import plaintifftestexecution.Testexecution;

public class screesnhot {
	
	public void getscreenshot(WebDriver webdriver,String fileWithPath) throws IOException {
		
//		Date currentdate = new Date();
//		String screenshotname = currentdate.toString();
//		File screenshotfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshotfile, new File (screenshotname + ".png"));
//		
		
		//Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination
                
                FileHandler.copy(SrcFile, DestFile);

                
		
		
	}

}
