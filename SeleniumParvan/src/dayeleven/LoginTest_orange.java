package dayeleven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_orange {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//WebElement usernametxt=driver.findElement(By.name("username"));
		//usernametxt.sendKeys("Admin");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
	
		
		
		

	}

}
