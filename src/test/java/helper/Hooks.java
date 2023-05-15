package helper;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Baseclass {
	@Before	
	public void Setup () {
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		driver = new ChromeDriver(option);
		
		} else if (browserName.equals("firefox")) {	
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions option = new FirefoxOptions();
			option.addArguments("--incognito");
			driver = new FirefoxDriver(option);
			
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		
		
		driver.get (prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}
	
	@After
	public void tearDown (Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(srcFile, new File ("Screenshots/"+ s.getName() +".png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		driver.quit();
		

}
}
