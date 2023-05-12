package com.ta.pages;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ta.testbase.BaseClass;

public class AddProdPage {
	
	
	@FindBy(xpath="//input[@name='search']")
	public static WebElement search;
	
	@FindBy(xpath="//input[@name='search']")
	public static WebElement productname;
	
	
	@FindBy(xpath="//*[@id=\"shopfront-app\"]/header/div/div/div[2]/form/div[1]/div[2]/button")
	public static WebElement searchagain;
	
	
	@FindBy(xpath="//*[@id=\"68848170\"]/div/div[4]/div/button")
    public static WebElement clickprod;
	
	
	@FindBy(xpath="//button[@class='button badge-button mini-cart-button dark-green  badge-button-module_badge-button_3TXVp badge-button-module_badge-icon_LvKrF badge-button-module_badge-count_28PIS']")
	public static WebElement viewcard;
	
	public AddProdPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
	
	
}
