import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
		driver.switchTo().alert().accept();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("maro");
		
		//System.out.println(driver.getWindowHandles());
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("yes");
		 

	}

}
