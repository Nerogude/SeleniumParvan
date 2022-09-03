package dayeleven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Another_Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://goo.gl/RVdKM9");
		System.out.println("Title of page is: "+ driver.getTitle());
		String actual_title = driver.getTitle();
		String expected_title = "Selenium Practice Form";
		if (actual_title.equals(expected_title)) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test failed");
		}
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("ovie");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).sendKeys("nero");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")).sendKeys("08032");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")).sendKeys("Nigeria");
		
		
		//radio button
		WebElement male_radio_button = driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label"));
		male_radio_button.click();
		System.out.println("Assert male radio button is enabled: "+ male_radio_button.isEnabled());
		
		WebElement maleradbut = driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-7_0\"]"));
		
		
		System.out.println("Assert male radio button is selected: "+ maleradbut.isSelected());
		
		//checkbox
		driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td/label")).click();
		driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[7]/td/label")).click();
		
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]")));
		
		System.out.println("Number of dropdown options is: "+ dropdown.getOptions().size());
		List <WebElement> options = dropdown.getOptions();
		for (WebElement e: options) {
		System.out.println(e.getText());
		}
		dropdown.selectByIndex(1);
		
		driver.findElement(By.linkText("Software Testing Tutorials")).click();
		System.out.println("Title of page is: "+driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Tools Training")).click();
		System.out.println("Title of page is: "+driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		
		
		
		
	}

}
