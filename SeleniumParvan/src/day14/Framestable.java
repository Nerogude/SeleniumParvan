package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framestable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"i0\"]/th/a")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		


	}

}
