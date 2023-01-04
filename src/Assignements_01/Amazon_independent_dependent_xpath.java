package Assignements_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_independent_dependent_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/s?bbn=1389401031&rh=n%3A1389401031%2Cp_89%3ARedmi&dc&qid=1671630727&rnid=3837712031&ref=lp_1389401031_nr_p_89_0");
		
		
		WebElement price=driver.findElement(By.xpath("//div[div[h2[a[span[text()='Redmi A1 (Black, 2GB RAM, 32GB Storage) | Segment Best AI Dual Cam | 5000mAh Battery | Leather Texture Design | Android 12']]]]]/div[3]/div[2]/a/span/span[2]/span[2]"));
		System.out.println("Price of this Mobile is:"+price.getText());
	
	
	}

}