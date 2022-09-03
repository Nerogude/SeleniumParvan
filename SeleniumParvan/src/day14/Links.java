package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://goo.gl/RVdKM9");
		driver.manage().window().maximize();
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement e:links) {
			System.out.println(e.getText());
		}

		

	}

}
