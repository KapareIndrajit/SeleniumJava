package Assignements_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Operations {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement userName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		userName.sendKeys("Admin");
		
		Actions act=new Actions(driver);
		act.moveToElement(userName).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		WebElement lastName=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		act.moveToElement(lastName).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
