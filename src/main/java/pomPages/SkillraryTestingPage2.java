package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryTestingPage2 {

	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtrainingbox;

	
	
	public WebElement getSeleniumtrainingbox() {
		return seleniumtrainingbox;
	}

	@FindBy(id="mycart")
	private WebElement mycartbox;
	
	public WebElement getMycartbox() {  // by using getter method
		return mycartbox;
	}

	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebooktab;
	
	
	public SkillraryTestingPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFacebooktab() {
		return facebooktab;
	}

	public void facebookclick()
	{
		facebooktab.click();
	}
}
