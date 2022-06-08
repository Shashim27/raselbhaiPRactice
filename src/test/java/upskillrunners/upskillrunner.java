package upskillrunners;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;




@cucumber.api.CucumberOptions(plugin = { "pretty", "html:target/cucumber", "json:target/cucumber-json.json" }, features = {
"src/test/resources/Features" }, glue = { "upskillebay.stepDef" }, tags = { "@regression", }, monochrome = true)

public class upskillrunner {
	
	
		
		

	public class RunCucumberTest extends cucumber.api.testng.AbstractTestNGCucumberTests {

	@BeforeTest
	public void beforeTest() {
		System.out.println("... Test STarted ...");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("... Test Completed ...");
	}
	

}
}
