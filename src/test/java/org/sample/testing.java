package org.sample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class testing {
	 
	WebDriver driver;
	@Parameters({"username","password"})
	@Test
	private void tc01(String s,String s1)
	{
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get(s);
	    
	
		   System.out.println(s1);
		
	}
	
	@Parameters({"username1","password1"})
	@Test
	private void tc02(String s,String s1)
	{
		
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys(s);
		WebElement txtpwd = driver.findElement(By.id("password"));
		txtpwd.sendKeys(s1);
		driver.findElement(By.id("login")).click();		
	}
	@Test
	private void tc03()
	{
		
		System.out.println("tc03");
	}
	@Test
	private void tc04()
	{
		
		System.out.println("tc04");
	}
	
	
	
	}
