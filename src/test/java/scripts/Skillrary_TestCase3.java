package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryJavaVideoPage2;
import pomPages.SkillraryLoginPage;

public class Skillrary_TestCase3 extends BaseClass{

	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.searching(pdata.getPropertydata("coursedata"));
		s.searchbutton();
		
		CoreJavaPage c = new CoreJavaPage(driver);
		c.selenium();
		
		
		SkillraryJavaVideoPage2 v2= new SkillraryJavaVideoPage2(driver);
		utilities.switchFrame(driver);
		Thread.sleep(8000);  //for manually close the cookies popup
	    v2.playvideo();
		v2.pausevideo();
		utilities.switchbackframe(driver);
		v2.addtowishlist();
	}
}
