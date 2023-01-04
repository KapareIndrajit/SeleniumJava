package Mouse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_HoverOver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/");
		
		List<WebElement> mainMenu=driver.findElements(By.cssSelector("#menu>ul>li>a"));
		System.out.println("Count of ManiMenu Options:"+mainMenu.size());
		
		Actions act=new Actions(driver);
		
		for(int i=0;i<mainMenu.size();i++)
		{
			WebElement options=mainMenu.get(i);
			act.moveToElement(options).perform();
			Thread.sleep(1000);
		}
		
		Thread.sleep(4000);
		
		

	}

}
