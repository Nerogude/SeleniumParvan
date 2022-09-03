import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		String month = "December 2022";
		String day = "25";
		
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		Thread.sleep(1000);
		
		while(true) {
			String text = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
			if(text.equals(month)) {
				break; }
			else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
			}
				
			}
		driver.findElement(By.xpath("//tbody/tr/td/a[1][contains(text(),"+day+")]")).click();
			
		}
		
		

	}


