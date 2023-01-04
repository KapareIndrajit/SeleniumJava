package Assignements_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		String actualtitle=driver.getTitle();
		System.out.println("Page Title is : "+actualtitle);
		System.out.println("Length of Title is :"+actualtitle.length());
		
		String actualurl=driver.getCurrentUrl();
		String expectedurl="https:google.com";
		
		boolean url=(actualurl.equals(expectedurl));
		if(url==true)
		{
			System.out.println("Correct Page is Open");
		}
		else
		{
			System.out.println("Correct Page is Not Open");
		}
		
		String pagesource=driver.getPageSource();
		System.out.println("Langth of Source code :"+pagesource.length());
		
		driver.close();
	}

}
