package com.qa.utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {

	 static WebDriver driver;
	 
	 
	 public void takingScreenShots(String filename) 
	 {
		 
		 File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 
		 
	 }
	
	
	
	
	
	
	
}
