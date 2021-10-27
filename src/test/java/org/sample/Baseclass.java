package org.sample;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
		
		static WebDriver driver;

		//1
			public static void browserlaunch(String url)
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.get(url);		
			}
	//2		
			public static void enterText(WebElement element,String txt)
			{
				element.sendKeys(txt);
			}
	//3		
			public static void login(WebElement element)
			{
				element.click();
			}
			
	//4		public static void maximise()
			{
				driver.manage().window().maximize();
				
	
			}
    //5
			public static String Titlename()
			{
				String title = driver.getTitle();
				return title;
				
			}
			
	//6		
			
			public static void sendtext(WebElement element,String data)
			{
				element.sendKeys(data);
				
			}
			
			
	//7
			
			public static String currentUrl(WebElement element)
			{
				String currentUrl = driver.getCurrentUrl();
				return currentUrl;
				
			}
			
	//8		
			
			public static WebElement id(WebElement element, String id)
			{
				WebElement findElement = driver.findElement(By.id(id));
				return findElement;
				
			}
			
	//9
			public static WebElement name(WebElement element, String name)
			{
				
				WebElement findElement = driver.findElement(By.id(name));
				return findElement;
			}
	//10
			public static WebElement xpath(String xpath)
			{
				WebElement element = driver.findElement(By.xpath(xpath));
				return element;
				
			}
	//11
			public static void SelectbyAttribute(WebElement element,String data)
			{
				Select select=new Select(element);
				select.selectByValue(data);
			}
	//12
			
		    public static void SelectbyIndex(WebElement element,int index) {
			 Select s1=new Select(element);
			 s1.selectByIndex(index);
		 }
    //13
		    
		    public static void SelectbyText(WebElement element,String text)
		    {
		    	Select s1=new Select(element);
		    	s1.selectByVisibleText(text);
		    }
     //14
		    
		    public static void deselectbyIndex(WebElement element, int index)
		    {
		    	Select s1=new Select(element);
		    	s1.deselectByIndex(index);
		    	
		    }
		    
	//15

		    public static void deselectbyAlloption(WebElement element)
		    {
		    	Select s1=new Select(element);
		    	s1.deselectAll();
		    }
		    
     //16
		    public static String getOptionText(WebElement element, int i)
		    {
		    	Select s1=new Select(element);
		    	List<WebElement> options = s1.getOptions();
		    	WebElement webElement = options.get(i);
		    	String text = webElement.getText();
		    	return text;
	  	
		    }
		//17
		    
		    public static void deslectbyText(WebElement element, String text)
		    {
		    	Select s=new Select(element);
		    	s.deselectByVisibleText(text);
		    }
		  //18
		    
		    public static void deselectbyAttributevalue(WebElement element, String data)
		    {
		    	Select s=new Select(element);
		    	s.deselectByValue(data);
		    	
		    }
		   
		    //19
		    public static String getFirstselectoption(WebElement element)
		    {
		    	Select s=new Select(element);
		    	WebElement firstSelectedOption = s.getFirstSelectedOption();
		    	String text = firstSelectedOption.getText();
		    	return text;
		    	
		    	
		    }
		    
		    //20
		    
		    public static String getAllselectoption(WebElement element, int i)
		    
		    {
		    	Select s=new Select(element);
		    	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		    	WebElement webElement = allSelectedOptions.get(i);
		    	String text = webElement.getText();
		    	return text;
		    	
		    }
		    
		    public static String excelRead(String path, String sheetname, int rowno, int cellno) throws IOException
		    {
		    	
		    	File f=new File(path);
		    	FileInputStream stream=new FileInputStream(f);
		    	Workbook w=new XSSFWorkbook(stream);
		    	Sheet sheet = w.getSheet(sheetname);
		    	Row row = sheet.getRow(rowno);
		    	Cell cell = row.getCell(cellno);
		    	int cellType = cell.getCellType();
		    	if(cellType==1)
		    	{
		    		String stringCellValue = cell.getStringCellValue();
		    		return stringCellValue;
		    	}
		    	else if (DateUtil.isCellDateFormatted(cell))
		    	{
		    		
		    		Date dateCellValue = cell.getDateCellValue();
		    		SimpleDateFormat d=new SimpleDateFormat("dd/mm/yyyy");
		    		String format = d.format(dateCellValue);
		    		return format;
		    		
		    	}
				return sheetname;
		    	
		    	
		    			
		    	
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    

}
