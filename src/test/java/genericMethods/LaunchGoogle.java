package genericMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchGoogle {

	@Test
	public static void googleResults() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.xpath("(//input[@name='q'])"));
		element.sendKeys("Hello");
		element.submit();
		System.out.println("List of links Available: ");
		List<WebElement> lstelement = driver.findElements(By.cssSelector(".r>a")); 
		for(int i=0;i<5;i++)
		{
		
		String link =lstelement.get(i).getAttribute("href");
		System.out.println(link);
		   
		}
		
		
	}

}
