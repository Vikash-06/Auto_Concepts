package testconcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowshandling {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	String ParentID = driver.getWindowHandle();
	System.out.println(ParentID);
	
	WebElement OpenNewWindowTab = driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
	OpenNewWindowTab.click();
	
	Set <String> Stringlist = driver.getWindowHandles();
	for(String shop: Stringlist) {
	if (!ParentID.equals(shop)) {
		driver.switchTo().window(shop);
		break;	
	}
	}
	
	WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
	firstname.sendKeys("Sonal");
	driver.close();
	
	driver.switchTo().window(ParentID);
	WebElement Text = driver.findElement(By.xpath("//input[@id='name']"));
	Text.sendKeys("Gobar");
	
	
	
	
}
}