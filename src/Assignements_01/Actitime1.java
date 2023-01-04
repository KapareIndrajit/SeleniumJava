package Assignements_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://indrajitkapare/login.do");
		
	    WebElement userName= driver.findElement(By.xpath("//input[@name='username']"));
	    System.out.println("Username field is Visible or Not:"+userName.isDisplayed());
	    System.out.println("Username field is Editable or Not:"+userName.isEnabled());
	    System.out.println("Default Value of Username field:"+userName.getAttribute("Placeholder"));
	    //userName.sendKeys("admin");
		
		WebElement password=driver.findElement(By.xpath("//input[@name='pwd']"));
		System.out.println("Password field is Visible or Not:"+password.isDisplayed());
		System.out.println("Password field is Editable or Not:"+password.isEnabled());
		System.out.println("Default Value of Password Field:"+password.getAttribute("Placeholder"));
		//password.sendKeys("manager");
		
		WebElement login=driver.findElement(By.xpath("//a[@id='loginButton']"));
		System.out.println("Login Button is Visible or Not:"+login.isDisplayed());
		System.out.println("Login Button is Functional or Not:"+login.isEnabled());
		System.out.println("Text of Login Button:"+login.getText());
		
		
		login.click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		
		//driver.close();
		
		
	}

}
