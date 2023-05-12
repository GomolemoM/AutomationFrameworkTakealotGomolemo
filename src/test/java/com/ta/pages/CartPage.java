package com.ta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ta.testbase.BaseClass;

public class CartPage {
	
	@FindBy (xpath="//a[@class='top-nav-module_logo_R1oac']")
	public static WebElement takealotlogo;
	
	
	public CartPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	

}
