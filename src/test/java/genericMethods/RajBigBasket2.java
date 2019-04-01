package genericMethods;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RajBigBasket2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement drpdown=driver.findElement(By.xpath("//div[@id='navbar']/ul/li/a"));
		Actions acc=new Actions(driver);
		acc.moveToElement(drpdown).build().perform();
		
		System.out.println("mouse hover performed");
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Fruits")).click();
		System.out.println(driver.getTitle());
		//driver.findElement(By.cssSelector("span[class='bskt-icon']")).click();
		Thread.sleep(1000);
		List<WebElement> addItem=driver.findElements(By.cssSelector("span[class='bskt-icon']"));
		int listSize=addItem.size();
		System.out.println("number of items found "+listSize);
		
		Iterator itr=addItem.iterator();
		while(itr.hasNext())
		{
			WebElement clickAdd=(WebElement) itr.next();
			clickAdd.click();
		}
		
		/*Random rand=new Random();
		int n=rand.nextInt(listSize);
		System.out.println(n);
		int itemCount=0; 
		Thread.sleep(1000);
		for(int i=n;i<=listSize;)
		{
			String randItem="(//span[class='bskt-icon'])"+"["+i+"]";
			System.out.println(randItem);
			driver.findElement(By.cssSelector(randItem)).click();
			n=n+1;
			itemCount++;
			System.out.println("Number of items added so far are  "+itemCount);
		}*/
	}

}
