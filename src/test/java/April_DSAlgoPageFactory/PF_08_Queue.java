package April_DSAlgoPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import April_DriverFactory.driverFactory;
import Utils.configReader;

public class PF_08_Queue {
	
		public static WebDriver driver=driverFactory.getdriver();
		String homeurl = configReader.getHomePage();
			
		@FindBy (xpath  = "//a[@href='queue']") WebElement getstartedqueue ;
		@FindBy (xpath = "//a[text()='Implementation of Queue in Python']") WebElement operationqueue;
		@FindBy (xpath = "//a[text()='Try here>>>']")static WebElement tryhere;
		@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement printqueue ;
		@FindBy (xpath = "//button[text()='Run']") WebElement run;
		
		public PF_08_Queue() {
		PageFactory.initElements(driver, this);
		}
		
		public void getstartedqueue() throws Exception {
		getstartedqueue.click();
		Thread.sleep(2000);
		}
			
		public void queueoperation() {
		operationqueue.click();
		}
		
		public void tryhere() {
		tryhere.click();
		}
			
		public void queueprint() {
		printqueue.sendKeys("print'Queue'");
		}
		
		public void run() throws InterruptedException {
		run.click();
		Thread.sleep(1000);
		}
		
		public void queuehomeurl() {
		driver.get(homeurl);
		}

}





