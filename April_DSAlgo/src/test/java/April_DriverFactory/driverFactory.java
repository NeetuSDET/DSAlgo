package April_DriverFactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driverFactory {
	
	public static WebDriver driver;
	public WebDriver init_driver(String browser) {
		
//		if (browser.equalsIgnoreCase("safari")) {
//			WebDriverManager.safaridriver().setup();
//			driver = new SafariDriver();
//		}
//							
//		else
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("headless");
			driver = new ChromeDriver();
			options.setAcceptInsecureCerts(true);
		}
		else
		{
			System.out.println("please pass correct browser value"+browser);
		}
		
		getdriver().manage().deleteAllCookies();
		getdriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(80));
		getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getdriver().manage().window().maximize();
		return getdriver();
	
	}

	public static  WebDriver getdriver() {
		return driver;
	}
  	
    public static  void closedriver() {
    	driver.close();
    }

//	public static WebDriver init_driver(String browserName) {
		
//		return null;
//	}

}




	
    


