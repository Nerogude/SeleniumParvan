package day14;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitsdemo {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	driver.get("http://newtours.demoaut.com/");
	
	//WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	//username.sendKeys("wilfull");

	}

}
