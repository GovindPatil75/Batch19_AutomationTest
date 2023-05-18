package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {
	
	@Test
	public void verifyTest_2() {
		
		
		//ChromeOptions option=new ChromeOptions();
	   // option.addArguments("--remote-allow-origins=*");
	    
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		// Element 
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
		SoftAssert soft=new SoftAssert();
		
		
		//verify  - Homepage 
		
		String ExpectedTitle="XYZ";
		
		String ActaulTitle="XYZ1"; // login to FB
		System.out.println(ActaulTitle);
		
		soft.assertEquals(ActaulTitle, ExpectedTitle); // fail
		
		
		
		
		System.out.println("Test case step 40");
		System.out.println("Test case step 41");
		System.out.println("Test case step 42");
		
		soft.assertAll(); // ommit 
		
	}


}
