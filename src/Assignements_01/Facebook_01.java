package Assignements_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		String Actualtitle=driver.getTitle();
		String Expectedtitle="Facebook – log in or sign up";
		System.out.println("Actual Title is:"+Actualtitle);
		
		if(Expectedtitle.equals(Actualtitle))
		{
			System.out.println("Home page is Verified Successfully");
			
		}
		driver.findElement(By.cssSelector("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy")).click();
		
		System.out.println("*************************************************************************");
		
		//Day Scrollbar WebElement
		WebElement dayscrollbar=driver.findElement(By.id("day"));
		Select sle=new Select(dayscrollbar);
		
		System.out.println("Scrollbar is Visibled or Not:"+dayscrollbar.isDisplayed());
		System.out.println("Scrollbar is enabled or Not:"+dayscrollbar.isEnabled());
		System.out.println("Scrollbar is Multiselect or Not:"+sle.isMultiple());
		System.out.println("Total Options Count in Scrollbar:"+sle.getOptions().size());
		System.out.println("Default Value of Scrollbar:"+sle.getFirstSelectedOption().getText());
		System.out.println("Name of Scrollbar:"+dayscrollbar.getAttribute("Placeholder"));
		sle.selectByIndex(6);
		System.out.println("Updated Value of Scrollbar:"+sle.getFirstSelectedOption().getText());
		
		System.out.println("*************************************************************************");
		
		WebElement monthscrollbar=driver.findElement(By.id("month"));
		Select sle1=new Select(monthscrollbar);
		
		System.out.println("Scrollbar is Visibled or Not:"+monthscrollbar.isDisplayed());
		System.out.println("Scrollbar is enabled or Not:"+monthscrollbar.isEnabled());
		System.out.println("Scrollbar is Multiselect or Not:"+sle1.isMultiple());
		System.out.println("Total Options Count in Scrollbar:"+sle1.getOptions().size());
		System.out.println("Default Value of Scrollbar:"+sle1.getFirstSelectedOption().getText());
		System.out.println("Name of Scrollbar:"+monthscrollbar.getAttribute("Placeholder"));
		sle1.selectByIndex(1);
		System.out.println("Updated Value of Scrollbar:"+sle1.getFirstSelectedOption().getText());
		
		
		Thread.sleep(8000);
		driver.quit();
		

	}

}
