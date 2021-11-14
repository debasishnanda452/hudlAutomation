package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
            features = "./src/test/resources/Features/TestScriptDemo.feature",
            glue= "stepDefs",
            publish = true,
            		plugin = {"pretty",
                            "html:target/cucumber-reports/cucumber.html",
                            "json:target/cucumber-reports/cucumber.json"}
    )

    public class TestRunner extends AbstractTestNGCucumberTests {
        @DataProvider(parallel = true)
        public Object[][] scenarios(){
            return super.scenarios();
        }

    }


