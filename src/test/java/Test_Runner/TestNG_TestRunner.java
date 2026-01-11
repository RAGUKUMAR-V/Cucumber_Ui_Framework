package Test_Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features="src/test/resources/features/Login.feature",
		glue="com.ragu.step_definitions",
		monochrome = true,
				  plugin = {
					        "pretty",
					        "junit:target/cucumber-reports/cucumber.xml",
					        "html:target/cucumber-reports/cucumber.html"
					    }
		//tags= "@Sanity and @Regression"
		
			
		)  

public class TestNG_TestRunner extends AbstractTestNGCucumberTests {

	
//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//	    return super.scenarios();
//	}
	
}
