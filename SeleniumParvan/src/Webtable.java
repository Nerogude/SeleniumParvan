import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//driver.switchTo().alert();
		driver.findElement(By.xpath("//*[@id=\"ez-accept-all\"]")).click();
		int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println("Total number of rows: "+rows);
		
		int columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
		System.out.println("Total number of columns: "+columns);
		
		String value = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[1]")).getText();
		System.out.println("The value is: "+value);
		
//		List <WebElement> all_rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
//		for(WebElement row:all_rows) {
//			System.out.println(row.getText());
//		}
//		
//		List <WebElement> all_columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
//		for(WebElement column:all_columns) {
//			System.out.println("List of values in columns are: "+column.getText());
//		}
		for(int r= 1; r<=rows;r++) 
		{
			for(int c=1;c<=columns;c++) 
			{
				String data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.println(data+"    ");
				
			}
			System.out.println();
		}
		
	}

}
