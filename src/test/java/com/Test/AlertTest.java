package com.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertTest {

	public static void main(String[] args) throws Exception {
		
		//Browser open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		//Element identify 
		WebElement txt_cuId=driver.findElement(By.xpath("//input[@name='cusid']"));
		txt_cuId.sendKeys("123456789");
		
		//click submit button
		WebElement btn_submit=driver.findElement(By.xpath("//input[@name='submit']"));
		btn_submit.click();
		
		//Alert Handle
		Alert alt =driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		Thread.sleep(2000); // 2 sec
		//alt.dismiss(); // click cancel button 
		
		alt.accept(); // click Ok button
		
		Thread.sleep(2000); // 2 sec
		System.out.println(alt.getText());
		
		Thread.sleep(2000); // 2 sec
		alt.accept(); // click OK button
		
	}

}
