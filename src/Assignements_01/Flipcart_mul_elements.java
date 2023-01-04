package Assignements_01;




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart_mul_elements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		String ExpectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String ActualTitle=driver.getTitle();
		System.out.println("Actual Title:"+ActualTitle);
		
		//Home Page Validation
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("Home Page is Verified Successfully");
		}
		else
		{
			System.out.println("Home Page is Not Verified Successfully");
		}
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();
		
		List<WebElement> menulist=driver.findElements(By.cssSelector("div.xtXmba"));
		System.out.println("Size of the Menu:"+menulist.size());
		
		for(int i=0;i<menulist.size();i++)
		{
			System.out.println(menulist.get(i).getText());
			
		}
		
	}

}
