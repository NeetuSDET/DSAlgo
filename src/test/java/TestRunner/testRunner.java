package TestRunner;

//import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class testRunner {
	
	//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:target/DSALgo.html",
					"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, //reporting purpose
			//plugin = {"pretty", "html:target/SignIn1.html"}, //reporting purpose
			//plugin = {"pretty", "html:target/Register1.html"}, //reporting purpose
			monochrome=false,  //console output color
			//tags = "@feature001 or TS001", //tags from feature file
			//tags = "@SignIn",
			//tags = "@Register",
			features = {"src/test/resources/features"}, //location of feature files
			glue={"stepDefinition","appHooks"}) //location of step definition file

	public class TestRunner extends AbstractTestNGCucumberTests{
		
		
		}
}	
//@CucumberOptions(
//plugin = {"pretty", "html:target/register1.html"}, //reporting purpose
//monochrome=false, // console output
////tags = "@feature001 or TS001", //tags from feature file// tags from feature file
//tags = "@GetStarted",
//features = {"src/test/resources/features"}, // location of feature files
//glue ={"stepDefinition","appHooks"}) // location of step definition files
//
//public class TestRunner extends AbstractTestNGCucumberTests {
////	@Override
////	@DataProvider(parallel = false)
////	public Object[][] scenarios() {
////
////		return super.scenarios();
////	}
//}
//
//}