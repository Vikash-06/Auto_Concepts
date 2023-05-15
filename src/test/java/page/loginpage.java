package page;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Baseclass;
public class loginpage extends Baseclass {
	
	
	public void enter_the_valid_credentials(String uname, String pass) {
		WebElement Heading = driver.findElement(By.xpath("//div[@class='login_logo']"));
		String Headingloginpage = Heading.getText();
		assertEquals("Swag Labs", Headingloginpage);
		
		
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='user-name']"));
		WaitforExpectedElement(Username, 10);
		Username.sendKeys(uname);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(pass);

}
	 
	public void click_the_login_button() {
		  WebElement Loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		  Loginbutton.click();
	
}
	public boolean validate_successfull_login () {
		WebElement Productsheading = driver.findElement(By.xpath("//span[@class='title']"));
		 return Productsheading.isDisplayed();
		
		
	}
	
}