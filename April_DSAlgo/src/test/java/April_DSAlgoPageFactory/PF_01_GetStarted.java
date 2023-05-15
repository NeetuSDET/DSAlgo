package April_DSAlgoPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PF_01_GetStarted {
	
	private WebDriver driver;
	
	private By getstart=By.xpath("//a[@href='/home']");
	
	public PF_01_GetStarted(WebDriver driver)
	{
		this.driver=driver;
	}
	public void getstartclick()
	{
	 driver.findElement(getstart).click();
	}

}


 

