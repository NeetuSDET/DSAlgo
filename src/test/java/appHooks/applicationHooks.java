package appHooks;

import org.testng.annotations.AfterMethod;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import April_DriverFactory.driverFactory;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import Utils.configReader;
import Utils.loggerLoad;

public class applicationHooks {

		private static WebDriver driver;
		private static driverFactory dF;
		private static  configReader configReader1;
		static Properties prop;
		
		@BeforeAll
		public static void before() throws Throwable {
			
			try {
				configReader1 =new configReader();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			prop = configReader1.init_pop();
			String browserName=prop.getProperty("browser");
			dF=new driverFactory();
			driver = dF.init_driver(browserName);
			loggerLoad.info("Test is running on "+browserName);
			
		
			loggerLoad.info("Driver is Intialized");
		}

	

		
		@AfterMethod
		public void tearDown(Scenario scenario)
		{
			if(scenario.isFailed())
			{
				//take screenshot
				String screenshotname=scenario.getName().replaceAll(" ", "-");
				byte[] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(sourcePath, "image/png", screenshotname);
			}
		}
		
	}



		
		




