package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class Skillrary_TestCase1 extends BaseClass{

	@Test
	public void tc1()
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		utilities.switchingtabs(driver);
		
		SkillraryDemoLogin sd = new SkillraryDemoLogin(driver);
		utilities.mouseHover(driver,sd.getCoursebtn());
		sd.seleniumtrainingtab();
		
		AddtoCartPage a = new AddtoCartPage(driver);
		utilities.doubleClick(driver,a.getAddbtn());
		a.addtocartbutton();
		
		utilities.alertPopup(driver);
		
		
		
		
	}
	
}
