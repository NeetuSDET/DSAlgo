package April_DSAlgoPageFactory;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import April_DriverFactory.driverFactory;
import Utils.ExcelReadProperties;
import Utils.configReader;

public class PF_03_SignInPage {
	String url = configReader.getHomePage();
	
	Properties prop;
	public  WebDriver driver = driverFactory.getdriver();
	ExcelReadProperties RER=new ExcelReadProperties();
	//private By signin=By.xpath("//a[@href='/login']");
	private By signin=By.xpath("//*[@id='navbarCollapse']/div[2]/ul/a[3]");
	private By username=By.id("id_username");
	private By password=By.id("id_password");
	private By loginbtn=By.xpath("//input[@value='Login']");
	
	@FindBy (xpath = "//a[@href='/logout']") WebElement Signout;
	

	public PF_03_SignInPage(WebDriver driver)
	{
		this.driver=driver;
		//PF_03_SignInPage.driver=driver;
		//PageFactory.initElements(driver, this);
		
	}
	public void url(){
		
		driver.get(url);
	}
	public void signin_link()
	{
		driver.findElement(signin).click();
	}
	
	public void enter_username() throws Exception
	{
		String excelusername=RER.getloginusername(); 
		driver.findElement(username).sendKeys(excelusername);
		
	}
	public void enter_pwd() throws Exception
	{
	 	String excelpassword=RER.getloginpassword(); //excel reader methods
		driver.findElement(password).sendKeys(excelpassword);
	}
	public void login_click()
	{
		driver.findElement(loginbtn).click();
	}
	
	
	public void signout() {
		Signout.click();
	}

}

