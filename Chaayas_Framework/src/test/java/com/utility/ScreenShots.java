package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {

	public static void takeScreenShot(WebDriver driver, String screenshotName) throws IOException
	// passing WebDriver 'driver' element and screenshotName
	{
		TakesScreenshot ts=(TakesScreenshot)driver; // TakesScreenshot is an interface, casting it with WebDriver element
		File source=ts.getScreenshotAs(OutputType.FILE); // Saving screenshot in File Type
		FileUtils.copyFile(source, new File("./TakedScreenshot/"+screenshotName+".png")); //Providing the source and destination location for screenshot
	}
}


