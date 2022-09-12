package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryJavaVideoPage2 {

	
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playabtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addwishlistbtn;
	
	public SkillraryJavaVideoPage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void playvideo()
	{
		playabtn.click();
	}
	public void pausevideo()
	{
		pausebtn.click();
	}
	public void addtowishlist()
	{
		addwishlistbtn.click();
	}
	
	
	
}
