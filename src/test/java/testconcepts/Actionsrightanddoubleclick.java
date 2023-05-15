package testconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsrightanddoubleclick {

public static void main(String[] args) {
//Launch driver
WebDriverManager.chromedriver().setup();
		
//launch browser
WebDriver driver = new ChromeDriver();
		
//Lunch URL
driver.get("https://demoqa.com/buttons");
		
//Maximize the window
driver.manage().window().maximize();
		
//Find the WebElement right click me
WebElement rightclickbtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
//create a Action object
Actions action = new Actions (driver);
		
//method to right click
action.contextClick(rightclickbtn).build().perform();
		
//find the webElement Double Click Me
WebElement doubleclickbtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
//Create Action object with different reference variable
Actions act = new Actions (driver);
		
//method to perform Double click
act.doubleClick(doubleclickbtn).build().perform();
		
}
}
