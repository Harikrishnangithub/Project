package org.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public static WebDriver driver;
	
	public static void browserlaunch(String key, String value,String browser) {
		// TODO Auto-generated method stub
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(key, value);
			driver = new ChromeDriver();	
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(key, value);
			driver = new ChromeDriver();	
		}
		else {
			System.setProperty(key, value);
			driver = new ChromeDriver();	
		}
		
	}
	public static void loadurl(String url) 
	{
		// TODO Auto-generated method stub
		driver.get(url);
	}
	public void clickLogIn(WebElement element) 
	{
		// TODO Auto-generated method stub
		element.click();
	}
	
	
	
	public void maximize() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
	}
	
	public void sleep(int time) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(time);
	}

	
	
}
