package com.ta.steps;

import com.ta.testbase.BaseClass;
import com.ta.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before
	public void start() {
		BaseClass.setUp();
	}
	
	
	@After
	public void end(Scenario scenario ) {
		
		byte[] picture;
		if ( scenario.isFailed())
		{
			//take screenshot and save it in /failed
			picture= CommonMethods.takeScreenshot("failed/"+scenario.getName());
		}
		else
		{
			//take screenshot and save it in /passed
			picture= CommonMethods.takeScreenshot("passed/"+scenario.getName());
		}
        
		scenario.attach(picture,"image/png",scenario.getName());
		
		BaseClass.tearDown();
}
}