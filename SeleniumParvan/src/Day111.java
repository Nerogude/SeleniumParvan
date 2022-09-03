import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day111 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://goo.gl/RVdKM9");
		driver.manage().window().maximize();
		String actual_title =  driver.getTitle();
		System.out.println("actual page title is; "+ actual_title);
		String expecetd_title = "Selenium Practice Form";
		if(actual_title.equals(expecetd_title)) {
			System.out.println("Test is Passed");
		}
			 else {
				System.out.println("Failed");
			}
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("Nero");
		driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label")).click();
		WebElement MaleRadioButton = driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label"));
		System.out.println("Assert male radio button is displayed: "+MaleRadioButton.isDisplayed());
		System.out.println("Assert male radio button is enabled: "+MaleRadioButton.isEnabled());
		WebElement male_radio_button = driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-7_0\"]"));
		System.out.println("Assert male radio button is selected: "+male_radio_button.isSelected());
		
		driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td/label")).click();
		
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]")));
		
		List <WebElement> options = dropdown.getOptions();
		
		System.out.println("number of options: "+ options.size());
		for(WebElement time: options) {
			System.out.println(time.getText());
		}
		//driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]")).click();
		dropdown.selectByIndex(1);
		
		driver.findElement(By.xpath("//*[@id=\"q22\"]/div/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		//driver.close();
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement a: links) {
			System.out.println(a.getText());
		}
		System.out.println(driver.getWindowHandle());
		String handle = driver.getWindowHandle();
		System.out.println(driver.switchTo().window(handle).getTitle());
		String title = driver.switchTo().window(handle).getTitle();
		
//		if (title.equals("Selenium Practice Form")) {
//			driver.close();
//		}
		
		
		}
		

	}


