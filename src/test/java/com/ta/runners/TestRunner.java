package com.ta.runners;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		

//you can specify which feature you want to run, we can also run all features
features = "src/test/resources/features/",
		  
//show where we can find the implementation regarding the steps in the feature files above
glue = "com.ta.steps",
	

//if true, it does not really run the steps. it just check if every step b feature files is defined
dryRun = false,

//tags is similar to go groups in testNG
tags = "@viewcart",

monochrome = true,
plugin = {
		  "pretty", //prints gherkin steps in console
		   "html:target/cucumber/report.html", //create a basic html report in target folder
		   "json:target/cucumber/report.json",
		   "message:target/cucumber/failed.message"
		   

}

)

public class TestRunner {


}
