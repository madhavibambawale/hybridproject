package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLogin {

	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement coursebtn;
	
	public WebElement getCoursebtn() {
		return coursebtn;
	}
	
	@FindBy(name="addresstype")
	private WebElement coursedropdown;
	
	
	public WebElement getCoursedropdown() {
		return coursedropdown;
	}

	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	public SkillraryDemoLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void seleniumtrainingtab()
	{
		seleniumtraining.click();
	}

	
}
