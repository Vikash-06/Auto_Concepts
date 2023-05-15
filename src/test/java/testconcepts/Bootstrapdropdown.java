package testconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrapdropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		driver.manage().window().maximize();
		WebElement Dropdowntab = driver.findElement(By.xpath("//button[@id='menu1']"));
		Dropdowntab.click();
		List <WebElement> listnameABC = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		for(WebElement xyz:listnameABC) {
			String optionvalue = xyz.getText();
			if (optionvalue.equals("CSS")) {
				xyz.click();
				
			}
			
		}
		
		
		

	}

}
