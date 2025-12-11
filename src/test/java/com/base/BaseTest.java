package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	protected WebDriver driver;
	
	public Properties prop;
	@BeforeMethod
	public void setup() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
