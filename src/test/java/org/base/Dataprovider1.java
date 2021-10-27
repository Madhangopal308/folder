package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider1 {
	
	@DataProvider(name="Excel data")
	public Object[][] getData() throws IOException
	{
	File f=new File("C:\\Users\\elcot\\eclipse-workspace\\framework3\\Exceldata\\Adact.xlsx");
	FileInputStream stream=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(stream);
	Sheet sheet = w.getSheet("Sheet1");
	
	int rowNo = sheet.getPhysicalNumberOfRows();
	Row row = sheet.getRow(0);
	int lastCellNum = row.getLastCellNum();
	Object data[][] =new Object[rowNo-1][lastCellNum];
	for (int i = 0; i < rowNo-1; i++) {
		Row row2 = sheet.getRow(i+1);
		for (int j = 0; j < lastCellNum; j++) {
			Cell cell = row2.getCell(j);
			
			DataFormatter dataFormat=new DataFormatter();
			String formatCellValue = dataFormat.formatCellValue(cell);
			data[i][j]=formatCellValue;
		}			
	}
	
   return  data;	
	}
	
	@Test(dataProvider="Excel data")
	
	private void tc01(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10,String s11,String s12,String s13,String s14,String s15,String s16,String s17)
	{
			
		    WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://adactinhotelapp.com/index.php");
			WebElement txtuser = driver.findElement(By.id("username"));
		    txtuser.sendKeys(s);
		    WebElement txtpwd = driver.findElement(By.id("password"));
		    txtpwd.sendKeys(s1);
		    WebElement buttonclick = driver.findElement(By.id("login"));
		    buttonclick.click();
		    
		    
		    WebElement location = driver.findElement(By.id("location"));
			location.click();
			Select z=new Select(location);
		    int parseInt = Integer.parseInt(s2);
			z.selectByIndex(parseInt);
			
			WebElement hotel = driver.findElement(By.id("hotels"));
			hotel.click();
			Select z1 =new Select(hotel);
			int parseInt2 = Integer.parseInt(s3);
			z1.selectByIndex(parseInt2);
			
			WebElement hoteltype = driver.findElement(By.id("room_type"));
			hoteltype.click();
			Select z2=new Select(hoteltype);
			int parseInt3 = Integer.parseInt(s4);
			z2.selectByIndex(parseInt3);
			
			WebElement nroom = driver.findElement(By.id("room_nos"));
			nroom.click();
			Select z3=new Select(nroom);
			int parseInt4 = Integer.parseInt(s5);
			z3.selectByIndex(parseInt4);
			
			WebElement indate = driver.findElement(By.id("datepick_in"));
			indate.sendKeys(s6);
			
			WebElement outdate = driver.findElement(By.id("datepick_out"));
			outdate.sendKeys(s7);
			
			WebElement adults = driver.findElement(By.id("adult_room"));
			adults.click();
			Select z4=new Select(adults);
			int parseInt5 = Integer.parseInt(s8);
			z4.selectByIndex(parseInt5);
			
			WebElement childrens = driver.findElement(By.id("child_room"));
			childrens.click();
			Select z5=new Select(childrens);
			int parseInt6 = Integer.parseInt(s9);
			z5.selectByIndex(parseInt6);
			
			driver.findElement(By.id("Submit")).click();
			driver.findElement(By.id("radiobutton_0")).click();
			driver.findElement(By.id("continue")).click();
			
			WebElement first = driver.findElement(By.id("first_name"));
			first.sendKeys(s10);
			WebElement last = driver.findElement(By.id("last_name"));
			last.sendKeys(s11);
			WebElement address = driver.findElement(By.id("address"));
			address.sendKeys(s12);
			WebElement ccno = driver.findElement(By.id("cc_num"));
			ccno.sendKeys(s13);
			
			WebElement cctype = driver.findElement(By.id("cc_type"));
			cctype.click();
			Select z6=new Select(cctype);
			int parseInt7 = Integer.parseInt(s14);
			z6.selectByIndex(parseInt7);
			
			WebElement month = driver.findElement(By.id("cc_exp_month"));
			month.click();
			Select z7=new Select(month);
			int parseInt8 = Integer.parseInt(s15);
			z7.selectByIndex(parseInt8);
			
			WebElement year = driver.findElement(By.id("cc_exp_year"));
			year.click();
			Select z8=new Select(year);
			int parseInt9 = Integer.parseInt(s16);
			z8.selectByIndex(parseInt9);
			
			WebElement cvv = driver.findElement(By.id("cc_cvv"));
			cvv.sendKeys(s17);
			
			driver.findElement(By.id("book_now")).click();
			
	}
    @Test
	private void tc011() {
		
	}
	

}
