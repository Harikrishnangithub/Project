package org.pageexection;

import org.factory.PageFactory;
import org.openqa.selenium.WebElement;

public class PageExecution extends PageFactory{
	
	public static void searchText(WebElement element, String data) 
	{
		// TODO Auto-generated method stub
		element.sendKeys(data);
	}
	public static void searchPass(WebElement element, String data) {
		// TODO Auto-generated method stub
		element.sendKeys(data);	}
	public static void main(String[] args) {
		browserlaunch("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Project\\target\\chromedriver.exe", "chrome");
		loadurl("https://adactin.com/HotelApp/");
		PageFactory p = new PageFactory();
		searchText(p.getUsername(), "Harikrishnan15");
		searchPass(p.getPassword(), "Hari@");
	}
	
	
}
