import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("Hi");
		
		
		WebElement NewWindows = driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button"));
		System.out.println("Assert New Windows is displayed: "+ NewWindows.isDisplayed());
		System.out.println("Assert New Windows is displayed: "+ NewWindows.isEnabled());
		
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("nero");
		
		driver.switchTo().defaultContent();
		
		//dropdown
		
		WebElement drpdwn = driver.findElement(By.xpath("//*[@id=\"speed\"]"));
		
		Select dropdown = new Select(drpdwn);
		System.out.println(dropdown.getOptions().size());
		List <WebElement> options =  dropdown.getOptions();
		for(WebElement opts: options) {
			System.out.println(opts.getText());
		}
		dropdown.selectByIndex(1);
		
		//date picker
		String month = "January 2022";
		String day = "2";
		
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		
		Thread.sleep(2000);
		
		
		while(true) 
		{
			String act_date = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
			if(act_date.equals(month))
			{
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
				
			}
		
			
			
		}
		
		driver.findElement(By.xpath("//tbody/tr/td/a[1][contains(text(),"+day+")]")).click();	
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.linkText(day)).click();
		
		
		
		
		
		
		
		
		
		

	}

}
