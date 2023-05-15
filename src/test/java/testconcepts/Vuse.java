package testconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vuse {

	private static final WebElement Dropdown = null;

	public static void main(String[] args) {
		//Driver version match to local browser version
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Launch the URL by using get method
		driver.get("https://www.vuse.com/gb/en/customer/account/create/");
		
		//Maximize the screen
		driver.manage().window().maximize();
		
		//cookeis handle
		WebElement AcceptCookie = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		AcceptCookie.click();	
		
		//go to Age allow tab
		WebElement Ageallow = driver.findElement(By.xpath("//button[@id='btn-entry-age-allow']"));
		Ageallow.click();
		
		//go to first name tab
		WebElement firstname = driver.findElement(By.xpath("(//input[@id='firstname']) [1]"));
		firstname.sendKeys("Vikash");
		
		//go to the last name tab
		WebElement LastName = driver.findElement(By.xpath("(//input[@id='lastname']) [1]"));
		LastName.sendKeys("Tyagi");
		
		//go to email id tab
		WebElement emailID = driver.findElement(By.xpath("//input[@id='email_address']"));
		emailID.sendKeys("vik06031994@gmail.com");
		
		
		//Gender Tab
		WebElement Dropdown = driver.findElement(By.xpath("//select[@id='gender']"));
		Select y = new Select (Dropdown);
		y.selectByVisibleText("Female");
		
		
		//Quick Address finder
		WebElement Addressfinder = driver.findElement(By.xpath("//input[@id='address-search']"));
		Addressfinder.sendKeys("Sihani Ghaziabad");
		
		//Mobile Tab
		WebElement MobileNumber = driver.findElement(By.xpath("(//input[@id='telephone']) [1]"));
		MobileNumber.sendKeys("9015489439");
		
		//checkmark 1
		WebElement checkmark01 = driver.findElement(By.xpath("//label[@for='mobile_text_required']"));
		checkmark01.click();
		
		//password tab
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("12345");
		
		//Confirm password tab
		WebElement Confirmpassword = driver.findElement(By.xpath("//input[@id='password-confirmation']"));
		Confirmpassword.sendKeys("12345");
		
		//checkmark T&C
		WebElement Termsconditions = driver.findElement(By.xpath("(//label[@class='label choice-box__label']) [1]"));
		Termsconditions.click();
		

		
		
			}

}
