package April_DSAlgoPageFactory;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import April_DriverFactory.driverFactory;
import Utils.ExcelReadProperties;
import Utils.configReader;

import Utils.ScreenShots_Utils;

//@FindBy (xpath = "//a[contains(text(),'Login')]") WebElement login;

public class PF_02_RegisterPage {

	public static WebDriver driver = driverFactory.getdriver();
	String url = configReader.getHomePage();
	ExcelReadProperties RER = new ExcelReadProperties();
	
	@FindBy (xpath  = "//a/button[@class='btn']") WebElement getstarted ;
	@FindBy (xpath = "//a[text()=' Register ']") WebElement registerlink;
	//@FindBy (xpath = "//div//a[@href='/register']") WebElement registerlink;
	@FindBy (id = "id_username")static WebElement username;
	@FindBy (id="id_password1") WebElement password ;
	@FindBy (id="id_password2") WebElement confirmpassword;
	@FindBy (xpath = "//input[@type='submit']") WebElement registerbtn;
	@FindBy (xpath = "//a[text()='Sign out']") WebElement Signout;
	
		public PF_02_RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void url(){
		
		driver.get(url);
	}
	public void getstarted() throws InterruptedException {
	getstarted.click();
	Thread.sleep(3000);
	}

	public void register() {
 	registerlink.click();
 	
	}

	public void emptyfeilds() throws Exception {
		registerbtn.click();
		Thread.sleep(2000);
		
	}

	public void takescreenshot(String filename) throws Exception {
		ScreenShots_Utils.capturescreenshots(driver,filename);
}

	public void invalidusernameonly() throws Exception {
	   	String excelusername=RER.getregisterusername(2); 	
		Thread.sleep(3000);	
	   	username.sendKeys(excelusername);
	   
	   }

	public void registerclick() throws Exception {
		registerbtn.click();
			
	}
	
	public void invalidpassword() throws Exception {
		String excelusername=RER.getregisterusername(3); 	
	   	username.sendKeys(excelusername);
	   	
	   	String excelpassword=RER.getregisterpassword(3); 	
	   	password.sendKeys(excelpassword);
	   	Thread.sleep(2000);	
	   	
	   }
	
	public void mismatchdata() throws Exception {
		String excelusername=RER.getregisterusername(4); 	
	   	username.sendKeys(excelusername);
	   	String excelpassword=RER.getregisterpassword(4); 	
	   	password.sendKeys(excelpassword);
	   	String excelconfirmpassword=RER.getregisterpassword(4); 	
	   	confirmpassword.sendKeys(excelconfirmpassword);
	
	   }

	public void validdata() throws Exception {
		
		String s = RandomStringUtils.randomAlphanumeric(6); 
		username.sendKeys(s);
	 
	   	password.sendKeys("pwdcheck1234");
	  
	   	confirmpassword.sendKeys("pwdcheck1234");
		
	   }

	public void signout() {
		Signout.click();
	}

}
