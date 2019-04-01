package genericMethods;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//import org.openqa.selenium.firefox.FirefoxDriver;

public class RajDiceJobSeach {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.dice.com");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		String srchText="JAVA";
		try {
		
		WebElement element=driver.findElement(By.id("search-field-keyword"));
		if(element.isDisplayed())
		{
		element.sendKeys(srchText);
		
		}
		WebElement city=driver.findElement(By.id("search-field-location"));
		city.clear();
		city.sendKeys("Lakewood, CO");
		driver.findElement(By.id("findTechJobs")).click();
		
		Thread.sleep(3000);
		WebElement cmpny=driver.findElement(By.xpath("//div[@id='serp']/div/div/ul/li/h3/a/span"));
		if(cmpny.isDisplayed())
		{
		System.out.println(cmpny.getText());
		}
		
		//WebElement elmntdesc=driver.findElement(By.xpath("//div[@id='serp']/div/div/div[2]/span"));
		List<WebElement> elmntdesc=driver.findElements(By.xpath("//div[@id='serp']/div/div/div[2]/span"));
		Iterator itr=elmntdesc.iterator();
	
		//for(int i=0;i<elmntdesc.size();i++)
		while(itr.hasNext())
		{
			WebElement desc=(WebElement) itr.next(); 
			String s=desc.getText().toUpperCase();
			
			System.out.println(s);
			
			if(s.contains(srchText))
			{
				System.out.println("Description contains search keyword "+srchText);
			}
			else
			{
				System.out.println("Description doesn't contain search keyword");
			}
		}
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		//driver.close();
	}

}
