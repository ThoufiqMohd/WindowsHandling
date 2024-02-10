package flightbooking;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IndigoAirlines {
	
	
	// BASIC CHROME DRIVER ACTIONS AND ROBOTS

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		String WebSite = "https://www.amazon.in/";
		
		String WebSite1 = "https://www.facebook.com/";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(WebSite1);
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement
				(By.id("email"));
		
		Actions a = new Actions (driver);
		a.sendKeys(element, "Thoufiq").perform();
		a.doubleClick().perform();
		a.contextClick().perform();
		
		Thread.sleep(2000);
		
		Robot r = new Robot();
		
		for (int i = 0; i < 2; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
}
		
		
		
	
}
