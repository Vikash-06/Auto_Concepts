package testconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehoveringaction {

public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
		
//URL Launch
driver.get("https://sellglobal.ebay.in/seller-center/#");
driver.manage().window().maximize();
		
//find element by using link text as the element was created as link
WebElement element = driver.findElement(By.linkText("Payments & Fees"));
		
//create a action object
Actions a = new Actions (driver);
		
//method to mouse hovering
a.moveToElement(element).build().perform();

}
}
