package Test_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features="src/test/resources/features/Practice.feature",
		glue="com.ragu.step_definitions",
		monochrome = true,
		tags= "@Sanity and @Regression"
		
			
		)

public class TestNG_TestRunner extends AbstractTestNGCucumberTests {

	
	
	
}
