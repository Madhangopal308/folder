package org.sample;

//import java.util.Date;

//import java.util.Date;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	WebDriver driver;

	
	@BeforeClass
	private void tc1()
	{
		
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
	   driver.get("http://adactinhotelapp.com/");
	}
	
	/*@BeforeMethod
	private void tc2()
	{
		Date d=new Date();
		System.out.println(d);
	}
	@Parameters("username")
	@Test
	private void tc3(@Optional("Madhan0129")String s1)
	{
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys(s1);
		/*WebElement txtpwd = driver.findElement(By.id("password"));
		txtpwd.sendKeys(s2);
		driver.findElement(By.id("login")).click();
		
	}
	@Parameters({"in","out" })
	@Test
	WebElement location = driver.findElement(By.id("location"));
	  location.click();
	  Select s=new Select(location);
	  s.selectByIndex(5);
	  WebElement hotel = driver.findElement(By.id("hotels"));
		hotel.click();
		Select s1=new Select(hotel);
		s1.selectByIndex(2);
		
		WebElement hoteltype = driver.findElement(By.id("room_type"));
		hoteltype.click();
		Select s2=new Select(hoteltype);
		s2.selectByIndex(2);
		WebElement nroom = driver.findElement(By.id("room_nos"));
		nroom.click();
		Select s3=new Select(nroom);
		s3.selectByIndex(1);
	  
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys("11-10-21");
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys("13-10-2021");
		
		WebElement adults = driver.findElement(By.id("adult_room"));
		adults.click();
		Select s4=new Select(adults);
		s4.selectByIndex(1);
		WebElement childrens = driver.findElement(By.id("child_room"));
		childrens.click();
		Select s5=new Select(childrens);
		s5.selectByIndex(1);
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();

			
	}
	@Parameters({"Madhan","kumar","AAAAAAAASSS","6543789976543254","432"})
	@Test
	private void tc5(String s,String s1,String s3,String s4,String s5)
	{
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		WebElement first = driver.findElement(By.id("first_name"));
	    first.sendKeys(s);
		WebElement last = driver.findElement(By.id("last_name"));
		last.sendKeys(s1);
		WebElement address = driver.findElement(By.id("address"));
		 address.sendKeys(s3);
		WebElement ccno = driver.findElement(By.id("cc_num"));
		ccno.sendKeys(s4);
		
		WebElement cctype = driver.findElement(By.id("cc_type"));
		cctype.click();
		Select s6=new Select(cctype);
		s6.selectByIndex(2);
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		month.click();
		Select s7=new Select(month);
		s7.selectByIndex(6);
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		year.click();
		Select s8=new Select(year);
		s8.selectByIndex(3);
		
        WebElement cvvno = driver.findElement(By.id("cc_cvv"));
        cvvno.sendKeys(s5);
		
		driver.findElement(By.id("book_now")).click();
		}
		*/
		
	
	@AfterMethod
	private void tc72()
	{
		System.out.println("test32");
	}
	@AfterClass
	private void tc73()
	{
		System.out.println("test32");
	}
	
	
	
	
}
