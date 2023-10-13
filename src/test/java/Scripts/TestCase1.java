package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryAppPage;
import POM.SkillraryHomePage;
import POM.TestingPage;
import genericLibrary.BaseClass;

public class TestCase1 extends BaseClass {
	@Test
	public void tc1() throws Throwable {
		SkillraryHomePage s=new SkillraryHomePage(driver);
		s.gearsButton();
		s.skillrarydemoappWebElement();
		utiles.childBrowser(driver);
		DemoSkillraryAppPage ds=new DemoSkillraryAppPage(driver);
		utiles.dropDown(ds.getsearchdd(),pdata.getPropertydata("coursedd"));
		TestingPage tp=new TestingPage(driver);
		utiles.scrolling(driver, tp.getFb());
		tp.fbWebElement();
		
	}

}
