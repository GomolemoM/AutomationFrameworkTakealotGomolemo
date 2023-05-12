package com.ta.testbase;




import org.openqa.selenium.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ta.utils.ConfigsReader;
import com.ta.utils.Constants;

import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
/*
 * This method will create a driver and return it
 * 
 * @return WebDriver driver
 */

        @SuppressWarnings("deprecation")
		public static WebDriver setUp() {
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		switch (ConfigsReader.getProperty("browser").toLowerCase()) {
		case "chrome":
		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		break;
		case "firefox":
		System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
		driver = new FirefoxDriver();
		break;
		case "msedge":
		System.setProperty("webdriver.edge.driver", Constants.MSEDGE_DRIVER_PATH);
		driver = new EdgeDriver();
		break;
		default:
			throw new RuntimeException("Browser is not supported!");
			}
		
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().setSize(new Dimension(1200,800));

		driver.get(ConfigsReader.getProperty("url"));
		
		PageInitializer.initialize();
		
		return driver;
	}
        public static void tearDown() {
        	if (driver != null) {
        		driver.quit();
        	}
        }
}
