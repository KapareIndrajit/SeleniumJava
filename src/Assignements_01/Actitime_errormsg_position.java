package Assignements_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_errormsg_position {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		
		driver.get("http://indrajitkapare/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		WebElement errorMsg=driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
		
		WebElement userName=driver.findElement(By.cssSelector("input[name='username']"));
		
		Point errorPosition=errorMsg.getLocation();
		int error_x_cord=errorPosition.getX();
		int error_y_cord=errorPosition.getY();
		System.out.println("Error Msg X_cord="+error_x_cord);
		System.out.println("Error Msg Y cord="+error_y_cord);
		
		Point usernamePosition=userName.getLocation();
		int user_x_cord=usernamePosition.getX();
		int user_y_cord=usernamePosition.getY();
		System.out.println("Username field x_cord value="+user_x_cord);
		System.out.println("Username field y_cord value="+user_y_cord);
		
		
		System.out.println("Error msg is Displayed above Username field:"+(error_y_cord<user_y_cord));
		
		driver.quit();
		
		
	
	}

}
