package testconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoveringplusEnterplusImplicitwaitpluspageloadtimeout {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.browserstack.com/");
	driver.manage().window().maximize();
	
	//Apply Implicit wait for 10 seconds to whole session
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//Pageload timeout
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	
	
	// Create object of Action class using driver parameter
	Actions action = new Actions (driver);
	
	//locating the element by using xpath method
	WebElement Product = driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
	WebElement Live = driver.findElement(By.xpath("//a[@class='menu-item-live']"));
	
	//mouse hovering by moveToElement method
	action.moveToElement(Product);
	action.click(Live).build().perform(); //Click method
	//note: In case of subsequent(Multiple method in one class) build().perform(); will always be occurred in the last statement of action class method.
	
	//find Element search bar
	WebElement Searchbar = driver.findElement(By.xpath("//input[@id='live-form-url']"));
	
	//Selenium predefined method JavascriptExecutor to scrolling for element view. it can be also use for click
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Searchbar);
	
	// send keys to enter value
 	Searchbar.sendKeys("Sonal loves Vikash");
 	
 	// Method to perform Enter(Keyboard)
	action.sendKeys(Keys.ENTER).build().perform();
	}
}
