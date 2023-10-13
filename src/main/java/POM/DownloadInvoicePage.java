package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoicePage {
	@FindBy(xpath="//input[@name='downloadInvoice']")
	private WebElement downloadInvoice;
	
	public DownloadInvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void downloadInvoiceWebElement() {
		downloadInvoice.click();
	}

}
