package org.pageexection;

import org.factory.PageFactory;

public class PageExe2 extends PageExecution  {

public static void main(String[] args) {
		
		PageFactory p1 = new PageFactory();
		PageExe2 p = new PageExe2();
		p1.browserlaunch("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Project\\target\\chromedriver.exe", "chrome");
		p1.loadurl("https://www.facebook.com/");
		p.searchText(p1.getUsername(), "shah");
	}
}
