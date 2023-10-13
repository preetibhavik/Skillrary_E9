package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryAppPage;
import POM.DownloadInvoicePage;
import POM.SkillraryHomePage;
import genericLibrary.BaseClass;

public class TestCase2 extends BaseClass {
	@Test
	public void tc2() {
		SkillraryHomePage s=new SkillraryHomePage(driver);
		s.gearsButton();
		s.skillrarydemoappWebElement();
		utiles.childBrowser(driver);
		DemoSkillraryAppPage ds=new DemoSkillraryAppPage(driver);
		ds.feedbackButton();
		DownloadInvoicePage di=new DownloadInvoicePage(driver);
		di.downloadInvoiceWebElement();
	}

}
