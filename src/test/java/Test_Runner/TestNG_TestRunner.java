package Test_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features="src/test/resources/features",
		glue="com.ragu.step_definitions",
		monochrome = true
			
		)

public class TestNG_TestRunner extends AbstractTestNGCucumberTests {

	
	
	
}
