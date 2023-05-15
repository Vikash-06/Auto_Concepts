package testconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddropactionevent {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement Source = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement Target = driver.findElement(By.xpath("//div[@id='box103']"));
		Actions actions = new Actions (driver);
		actions.dragAndDrop(Source, Target).build().perform();
		driver.quit();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		driver.manage().window().maximize();
		
	
}
}
