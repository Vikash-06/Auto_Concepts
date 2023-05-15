package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

//This is a base class where we kept reuseable codes it is a parent class, page folders' class(child class) and stepdefination folder's class  can call these methods without creating an object. this process is known as inheritance.

public class Baseclass {
	public static WebDriver driver;
	public static Properties prop;
	static {
		
	try {
		FileInputStream file = new FileInputStream("TestData/TestData.properties");
		 prop= new Properties();
		prop.load(file);
		
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	} 
	

//explicit wait
public void WaitforExpectedElement (WebElement ele, int timeout) {
	WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.visibilityOf(ele));
	
}

//wait for alert PopUp
public void WaitforAlert (int timeout) {
	WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.alertIsPresent());
}

//wait  for element Clickable
public void WaitforElementClickable (WebElement ele, int timeout) {
	WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.elementToBeClickable(ele));
}
//MouseHovering
 
public void Mousehovering (WebElement ele) {
	Actions a = new Actions (driver);
	a.moveToElement(ele).build().perform();	
}

//SelectAlertPopup

public void SelectalertPopup (int timeout) {
	WaitforAlert(timeout);
	Alert a = driver.switchTo().alert();
	a.accept();
}
//Select type Dropdown by visible text

public void SelectDropdownByvisibleText (WebElement ele, String value) {
	Select s = new Select (ele);
	s.selectByVisibleText(value);
}

//Select type Dropdown by value
public void SelectDropdownByValue (WebElement ele, String value) {
	Select s = new Select (ele);
	s.selectByValue(value);
}

//Select type Dropdown by Index

public void SelectDropdownByIndex (WebElement ele, int value) {
	Select s = new Select (ele);
	s.selectByIndex(value);
}
 
	
}

