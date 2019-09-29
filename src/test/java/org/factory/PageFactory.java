package org.factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.util.Base;

public class PageFactory extends Base {
	
	public PageFactory(){
		org.openqa.selenium.support.PageFactory.initElements(driver, this);
	}
	
@FindBy(id="username")
private WebElement username;

@FindBy(id="password")
private WebElement password;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	// TODO Auto-generated method stub
	return password;
}

}
