package testconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwaitclass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Actions a = new Actions(driver);
		WebElement Product = driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
		a.moveToElement(Product).build().perform();
		
		WebElement Live = driver.findElement(By.xpath("//a[@class='menu-item-live']"));
		
		//Explicit wait with condition of visibility of Live Element
		//create an object
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//apply condition with using reference variable w
		w.until(ExpectedConditions.visibilityOf(Live));
		
		a.click(Live).build().perform();
		
		WebElement Searchbar = driver.findElement(By.xpath("//input[@id='live-form-url']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Searchbar);
		Searchbar.sendKeys("Sonal loves Vikash");
		a.sendKeys(Keys.ENTER).build().perform();
		
		

	}

}
