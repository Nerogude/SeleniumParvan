import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherDatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.expedia.ca/");
		//driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
		
		String month = "September 2022";
		String exp_date = "15";
		
		//while(true) {
		
			
		//String text = driver.findElement(By.xpath("//h2[contains(text(),'September 2022')]")).getText();
		//System.out.println(text);
		//if(text.equals(month)) {
		//String datee = driver.findElement(By.xpath("//*[@id=\"app-layer-datepicker-check-in-out-start\"]/div[2]/div/div/div[2]/div/div[1]/table/tbody/tr[2]/td[6]/button")).getText();
		
		//System.out.println(datee);
		}
		
		}
		
	



