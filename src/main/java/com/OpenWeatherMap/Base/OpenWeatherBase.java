package com.OpenWeatherMap.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWeatherBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
 public OpenWeatherBase() throws IOException {
	 
	 try {
		prop = new Properties();
		 
		 FileInputStream ip= new FileInputStream("C:\\Users\\pc\\Desktop\\newProject"
		 		+ "\\OpenWeatherMaptest\\src\\main\\java\\com\\WeatherMap\\config\\config.properties");
		 prop.load(ip);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
 }
 
 public void intialization() {
	 String browser = prop.getProperty("browser");
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Desktop\\"
	 		+ "newProject\\OpenWeatherMaptest\\Browser\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get(prop.getProperty("url"));
 }
 
 
}
