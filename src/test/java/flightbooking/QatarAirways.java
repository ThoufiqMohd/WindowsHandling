package flightbooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QatarAirways {

	public static void main(String[] args) {
		
		 String url = "https://chercher.tech/practice/frames";
			
		  WebDriverManager.chromedriver ().setup ();
		  WebDriver driver = new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
		  
		  
		  driver.switchTo().frame("frame1");
		  WebElement element = driver.findElement(By.xpath("/html/body/input"));
		  element.sendKeys("java");
		  driver.switchTo().parentFrame();
		  
		 // driver.findElement(By.xpath("//*[@id='page-top']/div/div/ol/li[1]/a/b")).click();
		  
		  driver.switchTo().frame("iframe"); 
		  WebElement checkBox = driver.findElement(By.id("a"));
		  checkBox.click();
			
		}
		  
		  
		  
		//  WebElement checkBoxSelected = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
			//boolean isSelected = checkBoxSelected.isSelected();

			// performing click operation if element is not selected 
			//if(isSelected == false) {
			//	checkBoxSelected.click();
		
		
		
		
		
	}
	
	
	

