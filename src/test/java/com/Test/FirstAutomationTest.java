package com.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomationTest {

	public static void main(String[] args) throws Exception {

     // FB -- login -- ChromeBrowser 
		
		//Setup Browser executable 
		
		WebDriverManager.chromedriver().setup();
		
		// Browser Driver class Object
		ChromeDriver driver=new ChromeDriver();
		// Object methods 
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Thread.sleep(2000); // 2 sec
		
		driver.navigate().to("https://mvnrepository.com/");
		Thread.sleep(2000); // 2 sec
		
		String title1=driver.getTitle();
		System.out.println(title1);
		
		driver.navigate().back();
		
		Thread.sleep(2000); // 2 sec
		driver.navigate().forward();
		
		Thread.sleep(2000); // 2 sec
		driver.navigate().refresh();
		
		//driver.close(); // current window close 
		
		//driver.quit(); // current + all open window --> close 
		
		
		//EDGE
//		WebDriverManager.edgedriver().setup();
//		EdgeDriver driver1=new EdgeDriver();
//		driver1.get("https://www.facebook.com/login/");
//		
		

	}

}
