package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.utility.RandomString;

public class Library {
	
	public static void ScrollToElement(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	
	public static void getScreenShot(WebDriver driver) throws Exception {
		String RM=RandomString.make(5); //abc  abc34
		TakesScreenshot ts= (TakesScreenshot) driver; //(TakesScreenshot)driver <==WebDriver driver=new ChromeDriver();
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File("C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch19_AutomationTest\\"+RM+".png");
		FileUtils.copyFile(src, destn);
	}
}
