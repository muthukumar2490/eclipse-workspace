package com.crm.qa.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.Testbase;

public class TakeScreenshotUtil extends Testbase {
	public static void takeScreenshot() throws IOException {
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(srcFile, new File(currentDir+"/screenshots/"+Thread.currentThread().getStackTrace()[1].getMethodName()+System.currentTimeMillis()+".png"));
	
	
	}
//	or 
	
//	public static void takeScreenshot(String MethodName) throws IOException {
//
//		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String currentDir = System.getProperty("user.dir");
//		FileUtils.copyFile(srcFile, new File(currentDir + "/screenshots/"
//				+ MethodName + System.currentTimeMillis() + ".png"));
//
//		
//	}

}
