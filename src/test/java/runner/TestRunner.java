package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features",glue={"stepDefination", "helper"} , tags = "@reg" , plugin = "html:target/test/report.html")
public class TestRunner extends AbstractTestNGCucumberTests {

	
	
}
