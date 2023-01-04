package Assignements_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		//Verify Login Page
		String expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String actualurl=driver.getCurrentUrl();	
		boolean verifyurl=expectedurl.equals(actualurl);
		if (verifyurl==true)
		{
			System.out.println("Login Page Verify Sucessfully");
		}
		else
		{
			System.out.println("Login Page is Not Verifyed");
		}
		
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();;
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		
		
		
		driver.close();
		
	
}
}