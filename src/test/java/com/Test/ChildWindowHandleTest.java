package com.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindowHandleTest {

	public static void main(String[] args) {

    
		//Browser Open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		//
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> ALLID=driver.getWindowHandles();
		System.out.println(ALLID);
		
		List<String> list=new ArrayList(ALLID);
		
		System.out.println(list.get(0)); // parent id 
		System.out.println(list.get(1)); //child id
		
		driver.switchTo().window(list.get(1)); // switch child window 
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test@gmail.com");
		
		//driver.close(); // close current open window 
		
		driver.quit(); // current + all open window close 
		
		//driver.switchTo().window(parentid);

	}

}
