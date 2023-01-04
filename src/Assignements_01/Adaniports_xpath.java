package Assignements_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adaniports_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.nseindia.com/market-data/exchange-traded-funds-etf");
		
		
		
		WebElement volume=driver.findElement(By.xpath("//tr[td[a[text()='ICICI500']]]/td[10]"));
		System.out.println("Volume of this Company is:"+volume.getText());

	}

}
