package April_DSAlgoPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import April_DriverFactory.driverFactory;
import Utils.configReader;
import Utils.ScreenShots_Utils;

public class PF_04_DataStructures {

	String homeurl = configReader.getHomePage();
	String loginurl=configReader.getLoginPage();
	
	public static WebDriver driver=driverFactory.getdriver();
	
	@FindBy (xpath = "//a[@href='data-structures-introduction']")  WebElement dataSbtn;
	@FindBy (xpath = "//a[text()='Time Complexity']") static WebElement timeC;
	@FindBy (xpath = "//a[text()='Try here>>>']") static WebElement tryhere;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") static WebElement print ;
	@FindBy (xpath = "//button[text()='Run']") static WebElement run;
	
	private By username=By.id("id_username");
	private By password=By.id("id_password");
	private By loginbtn=By.xpath("//input[@value='Login']");
	
	public PF_04_DataStructures() {
		PageFactory.initElements(driver, this);
	}
	
	public void getstartedDS() {
		dataSbtn.click();
	}
	
	public void timec() {
		timeC.click();
	}
	
	public void tryhere() {
		tryhere.click();
		
	}
	
	public void print() {
		print.sendKeys("print'Data Structure'");
	}
		
	public void runbutton() throws Exception {
			run.click();
			Thread.sleep(2000);
		}
		
	public void homepage() {
			driver.get(homeurl);
		}
	public void loginpage() {
		driver.get(loginurl);
		driver.findElement(username).sendKeys("code_warriors");
		driver.findElement(password).sendKeys("ssdet@88");
		driver.findElement(loginbtn).click();
	}
	public void takescreenshot(String filename) throws Exception {
		ScreenShots_Utils.capturescreenshots(driver,filename);
	}
}



