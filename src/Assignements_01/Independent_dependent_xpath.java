package Assignements_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Independent_dependent_xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung");
		
		WebElement value=driver.findElement(By.xpath("//div[div[a[text()='SAMSUNG Galaxy F13 (Nightsky Green, 64 GB)']]]/div/div/div[1]"));
		System.out.println("Price of SAMSUNG Galaxy F13 (Nightsky Green, 64 GB)is:"+value.getText());
		
		
		Thread.sleep(4000);
		driver.quit();
		
	
	}

}
