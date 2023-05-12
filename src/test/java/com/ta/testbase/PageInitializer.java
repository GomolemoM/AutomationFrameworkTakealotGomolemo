package com.ta.testbase;


import com.ta.pages.AddProdPage;
import com.ta.pages.CartPage;

public class PageInitializer extends BaseClass {
	
	public static AddProdPage addprodPage;
	public static CartPage cartPage;
	
   public static void initialize() {
		
  //initialize page
  
  //landingPage.signButton().click();
  addprodPage = new AddProdPage();
  cartPage = new CartPage();

}
}