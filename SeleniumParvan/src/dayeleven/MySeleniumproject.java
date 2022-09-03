package dayeleven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MySeleniumproject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://goo.gl/RVdKM9");
		driver.manage().window().maximize();
		String act_title = driver.getTitle();
		System.out.println("actual title of page is: "+act_title);
		String exp_title = "Selenium Practice Form";
		if(act_title.equals(exp_title)) {
			System.out.println("Test is Passed");
		}
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("nero");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).sendKeys("ogud");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")).sendKeys("Naija");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).sendKeys("Warri");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]")).sendKeys("o@gmail.com");
		
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]")));
		System.out.println("number of options is: "+dropdown.getOptions().size());
		List <WebElement> options = dropdown.getOptions();
		for(WebElement e:options) {
			System.out.println(e.getText());
		}
		dropdown.selectByIndex(1);
		//use Xpath of label for radio button
		WebElement radioButtonLabel = driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label"));
		WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-7_0\"]"));
		
		System.out.println("Assert that radio button is displayed: " + radioButtonLabel.isDisplayed());
		System.out.println("Assert that radio button is enabled: " + radioButtonLabel.isEnabled());
		radioButtonLabel.click();
		
		//use Xpath for radio button
		System.out.println("Before click: Radio button is selected " + radioButton.isSelected());
		radioButton.click();
		//System.out.println("After click: Radio button is selected " + radioButton.isSelected());
		WebElement sunday_box = driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td/label"));
		//driver.findElement(By.id("RESULT_CheckBox-8_6")).click();
		System.out.println("assert sunday_checkbox is displayed "+sunday_box.isDisplayed());
		driver.findElement(By.linkText("Software Testing Tools Training")).click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Tools Training")).click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
	}

}
