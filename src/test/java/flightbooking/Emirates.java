package flightbooking;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Emirates {

	
	// ALERTS
	
	
public static void main(String[] args) throws InterruptedException {
	
	
      String url = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
	
	  WebDriverManager.chromedriver ().setup ();
	  WebDriver driver = new ChromeDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
	  
	  WebElement element = driver.findElement(By.name("alert"));
	  element.click();
	  Thread.sleep(4000);
	  Alert simple = driver.switchTo().alert();
	  simple.accept();
	  
	  WebElement element1 = driver.findElement(By.name("confirmation"));
	  element1.click();
	  Thread.sleep(5000);  
	  Alert confirm =driver.switchTo().alert();
	  confirm.dismiss();
	  
	  WebElement element2 = driver.findElement(By.name("prompt"));
	  element2.click();
	  Thread.sleep(5000);  
	  Alert prompt =driver.switchTo().alert();
	  prompt.sendKeys("Thoufiq");
	  Thread.sleep(4000);  
	  prompt.accept();
	  String outputEntered = prompt.getText();
	  
	  
	  
	  
	  
	  
	  
	  
	
	
}
	
	
	
}
