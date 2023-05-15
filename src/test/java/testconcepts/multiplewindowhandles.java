package testconcepts;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplewindowhandles {

public static void main(String[] args) {
//match driver version to browser version
WebDriverManager.chromedriver().setup();

//browser launch
WebDriver driver = new ChromeDriver();

//URL launch
driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

//maximize the window
driver.manage().window().maximize();

//Use driver.getwindowHandle() method gives the single parent window ID in "String type format"
String parentwindowID = driver.getWindowHandle();

//PRINT to find the parent window ID in console
System.out.println(parentwindowID);

//click to Open Multiple tab
WebElement openmultipletab = driver.findElement(By.xpath("//button[@id='newTabsBtn']"));
openmultipletab.click();

//driver.getwindowHandles() gives the set of String values or ID for multiple child windows
Set <String> Allwindows = driver.getWindowHandles();

//to find the specific one child window we use each loop method with if condition
for(String s: Allwindows) {
if (!parentwindowID.equals(s)) {
driver.switchTo().window(s);
String Windowtitle = driver.getTitle();
if(Windowtitle.contains("AlertsDemo")) {
WebElement clickme = driver.findElement(By.xpath("//button[@id='alertBox']"));
clickme.click();

//switch to alert PopUp
Alert a = driver.switchTo().alert();
a.accept();
break;
}
}
}

//switch to parent window
driver.switchTo().window(parentwindowID);
WebElement Text = driver.findElement(By.xpath("//input[@id='name']"));
Text.sendKeys("baba ka dhaba");

//to perform any action on basic window controls use the same above method (for each loop)
for(String s: Allwindows) {
if (!parentwindowID.equals(s)) {
driver.switchTo().window(s);
String Windowtitle = driver.getTitle();
if(Windowtitle.contains("Basic Controls")) {
WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
firstname.sendKeys("sonal");

}	
}
}		
}
}
