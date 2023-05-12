package com.ta.steps;


import org.junit.Assert;

//import org.junit.Assert;

import com.ta.pages.AddProdPage;
import com.ta.pages.CartPage;
import com.ta.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingProdSteps extends CommonMethods  {
	
	
	
	@When("click search")
	public void click_search() {
	click(AddProdPage.search);
		wait(2);
	}

	@When("enter prodname")
	public void  enter_prodname() {
		SendText(AddProdPage.productname, "Maynards - Original Round Wine Gums 400g");
	}
	
	@When("click searchAgain")
	public void click_searchAgain() {
		click(AddProdPage.searchagain);
		wait(2);
		
	}

	@When("add to cart")
	public void add_to_cart() {
		click(AddProdPage.clickprod);
		wait(2);
	}

	@Then("view cart")
	public void view_cart() {
	click(AddProdPage.viewcard);
	wait(2);
	}

	@Then("i validate that I added to cart")
	public void i_validate_that_i_added_to_cart() {
		Assert.assertTrue(CartPage.takealotlogo.isDisplayed());
	    
	}
}
