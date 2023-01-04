package Assignements_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String actualtitleofpage=driver.getTitle();
		String expectedtitleofpage="Facebook – log in or sign up";
		
		System.out.println(actualtitleofpage.equals(expectedtitleofpage));
		
		System.out.println("Title of Page is:"+actualtitleofpage);
		
		driver.close();
		
	}

}
