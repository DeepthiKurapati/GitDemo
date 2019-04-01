package genericMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RajGoogleCalculator {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
	/*	WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("(//input[@name='q'])"));
		element.sendKeys("calculator");
		element.submit();
*/
		
		//*******		Reading data from Excel file
		System.out.println("Reading data from excel");
		File f=new File("E:\\Calculator.xlsx");
		
		FileInputStream fs=new FileInputStream(f);
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet sheet=workbook.getSheet("Addition");
		XSSFRow row=sheet.getRow(1);
		System.out.println(sheet.getRow(1).getCell(1));
		
		System.out.println("Starting to update the excel");
	    FileOutputStream fos=new FileOutputStream(f);
	    sheet.getRow(1).getCell(4).setCellValue(6);
	    workbook.write(fos);
	    fos.flush();
	    
		
		/*
		XSSFCell operand1=row.getCell(0);
		XSSFCell operand2=row.getCell(1);
		XSSFCell operator=row.getCell(2);
		XSSFCell expctresult=row.getCell(3);
		
		System.out.println("Reading data from excel is completed");
		
		String charop1=operand1.toString();
		String charop2=operand2.toString();
		String charop=operator.toString();
		String expectedresult=expctresult.toString();
		
				
		WebElement calcInput=driver.findElement(By.xpath("//div[@id='cwtltblr']"));
	    calcInput.sendKeys(charop1);
	    calcInput.sendKeys(charop);
	    calcInput.sendKeys(charop2);
	    calcInput.sendKeys(Keys.ENTER);
	    */
	    
	   // WebElement result=driver.findElement(By.xpath("//span[@id='cwos']"));
	    //String actualresult=result.getText();
	    
	    
	    
	 /*   if(actualresult.equals(expectedresult))
           {
        	   System.out.println("Results match");
        	   sheet.getRow(1).getCell(5).setCellValue("PASS");
        	   workbook.write(fos);
        	   fos.flush();
	       }
	    else {
	    	 System.out.println("Results do not match");
	    	 sheet.getRow(1).getCell(5).setCellValue("FAIL");
	    	 workbook.write(fos);
      	   fos.flush();
	       }*/
	    }
	    	
	    
	    
	    
		
	}


