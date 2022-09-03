package day14;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://demo.automationtesting.in/Windows.html");
//		String handleValue = driver.getWindowHandle();
//		System.out.println(handleValue);
		
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		Set <String> handlevalues = driver.getWindowHandles();
		
		System.out.println("number of handlevalues are "+ handlevalues.size());
		
		for(String e: handlevalues) {
			//System.out.println(e);
			
			String title = driver.switchTo().window(e).getTitle();
			System.out.println(title);
			
			if(title.equals("Selenium")) {
				driver.close();
			}
			
		}
		
		
		

	}

}
