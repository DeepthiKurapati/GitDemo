package genericMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cathaypacific {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cathaypacific.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class=\"selected-language\"]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'United States')]")).click();
		
		
		WebElement onway=driver.findElement(By.xpath("(//label[@class=\"radio-label\"])[2]"));
		
		
		WebDriverWait wait = new WebDriverWait(driver, 120); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@class=\"radio-label\"])[2]")));
		
		onway.click();
		
	/*	System.out.println(onway);
		try
		{
		if(onway.isDisplayed())
			{
			System.out.println("before click");
			onway.click();
			Thread.sleep(3000);
			System.out.println("after click");
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}*/
		
		WebElement	fromcity=driver.findElement(By.cssSelector("#depart-label"));
		fromcity.clear();
		fromcity.sendKeys("Boston");
		
		
		

	}

}
