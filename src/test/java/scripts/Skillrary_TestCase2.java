package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;
import pomPages.SkillraryTestingPage2;

public class Skillrary_TestCase2 extends BaseClass{

	@Test
	public void tc2() throws IOException {
	SkillraryLoginPage s= new SkillraryLoginPage(driver);
	s.gearsbutton();
	s.skillrarydemoapplication();
	
	SkillraryDemoLogin d = new SkillraryDemoLogin(driver);
	utilities.switchingtabs(driver);
	utilities.dropDown(d.getCoursedropdown(), pdata.getPropertydata("coursedropdown"));
	
	SkillraryTestingPage2 t = new SkillraryTestingPage2(driver);
	utilities.dragDrop(driver, t.getSeleniumtrainingbox(), t.getMycartbox());
	Point loc = t.getFacebooktab().getLocation();
	int x = loc.getX();
	int y = loc.getY();
	utilities.scrollBar(driver,x,y);
	t.facebookclick();
}
}
