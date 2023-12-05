package MyRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Features/HYR"}
,glue= {"StepDefenitions"},
monochrome	= true,
plugin = {"pretty","html:target/Reports/HYRhtmlreport.html",
		"json:target/Reports/HYRJsonreport.json"}
)

public class HYR_TestRunner {
	private TestNGCucumberRunner TestNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void Setupclass() throws Exception {
		TestNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature) {
        TestNGCucumberRunner.runScenario(pickle.getPickle());
    }

    @DataProvider
    public Object[][] scenarios() {
        return TestNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        TestNGCucumberRunner.finish();
    }
		
	}





    