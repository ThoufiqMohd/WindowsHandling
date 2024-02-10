package flightbooking;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BritishAirways {
	
	public static void main(String[] args) {
		
		
		String Fkart = "https://www.flipkart.com/";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get(Fkart);
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		element.sendKeys("mobile", Keys.ENTER);
		
		WebElement element1 = driver.findElement(By.xpath("(//*[text () =	'Motorola G34 5G (Ice Blue, 128 GB)'])[1]"));
		element1.click();
		
		WebElement element3 = driver.findElement(By.xpath("(//*[text ()='₹11,999']) [1]"));
		String text = element3.getText();
		
		System.out.print(text);
		
		
		
		
		
		
	}
}
