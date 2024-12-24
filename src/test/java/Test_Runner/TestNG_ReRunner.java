package Test_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features="@target/failed_scenarios.txt",
		glue="com.ragu.step_definitions",
		monochrome = true
		
			
		)

public class TestNG_ReRunner extends AbstractTestNGCucumberTests {

	
	
	
}
