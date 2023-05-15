package testconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); //driver version
		WebDriver driver = new ChromeDriver(); // browser launch
		
		driver.get("https://saucedemo.com/"); //URL launch
		
		driver.manage().window().maximize();  // maximize the screen
		
		WebElement Username = driver.findElement(By.xpath("//input [@id = 'user-name']"));
		Username.sendKeys("Vik0603@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input [@id ='password']"));
		Password.sendKeys("vik@1994");
		
		WebElement LoginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		LoginButton.click();
			// hi this is vikash i hope you are well today!
		
		
		

	}

}
