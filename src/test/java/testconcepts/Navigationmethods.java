package testconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigationmethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		// to go back 
		driver.navigate().back();
		
		//to go forward
		driver.navigate().forward();
		
		//to refresh the window
		driver.navigate().refresh();
		
		
		
	}

}
