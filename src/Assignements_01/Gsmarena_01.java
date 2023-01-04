package Assignements_01;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena_01 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/");
		
		String Actualtitle=driver.getTitle();
		String Expectedtitle="GSMArena.com - mobile phone reviews, news, specifications and more...";
		System.out.println("Actual Title:"+Actualtitle);
		
		if(Actualtitle.equals(Expectedtitle))
		{
			System.out.println("Page is Verified Successfully");
		}
		
		List<WebElement> mobilelist=driver.findElements(By.cssSelector("aside>div:nth-of-type(1)>ul>li>a"));
		System.out.println("Total Options in List:"+mobilelist.size());
		
		for(int i=0;i<mobilelist.size();i++)
		{
			System.out.println(mobilelist.get(i).getText());
		}
		
		driver.findElement(By.cssSelector("aside>div:nth-of-type(1)>ul>li:nth-of-type(1)>a")).click();;
		
		List<WebElement> samsunglist=driver.findElements(By.cssSelector("div:nth-of-type(1)>ul>li>a>strong>span"));
		System.out.println("Total Options in Samsung List:"+samsunglist.size());
		
		for(int i=0;i<samsunglist.size();i++)
		{
			System.out.println(samsunglist.get(i).getText());
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	

	}

}
