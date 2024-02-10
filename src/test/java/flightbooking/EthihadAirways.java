package flightbooking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EthihadAirways {
	
	//DROPDOWN PRACTICES

	public static void main(String[] args) throws InterruptedException {

		String url = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//select[@id='second']"));

		Select s = new Select(element);

		//boolean multiple = s.isMultiple();
		//System.out.println(multiple);
		
		//List <WebElement> options = s.getOptions ();
		//for (int i = 0; i < options.size (); i++) {
			//WebElement element2 = options.get(i);
			
			//String ddValues = element2.getText ();
			//System.out.println(ddValues);
			
		
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByIndex(2);
		Thread.sleep(3000);
		
		
		}
	
	
	
	}

		

		// s.selectByIndex(1);
		// Thread.sleep(3000);
		// s.selectByValue("Microsoft");
		// Thread.sleep(3000);
		// s.selectByVisibleText("Yahoo");

	


