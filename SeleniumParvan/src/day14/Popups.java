package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
		//Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
//		WebElement outerframe = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]"));
//		driver.switchTo().frame(outerframe);
//		
//		WebElement innerframe = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div"));
//		driver.switchTo().frame(innerframe);
//		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("oke");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("nero");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("pee");
	}

}
