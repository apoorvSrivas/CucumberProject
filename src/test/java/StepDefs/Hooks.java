package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before("@Browser")    // This is called tagged hooks, now only those test cases will have this before and after where we have @Browser
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);	
		driver.manage().window().maximize(); 
	}
	
	
	@After("@Browser")
	public void tearDown() {
		
		driver.quit();
	}

}
