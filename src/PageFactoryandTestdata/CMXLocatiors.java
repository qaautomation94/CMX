package PageFactoryandTestdata;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Master.CMXExecution;



public class CMXLocatiors extends CMXExecution{
	

	@FindBy(id="edit-name") public WebElement UserName;
	@FindBy(id="edit-pass") public WebElement Password;
	@FindBy(xpath="//input[contains(@id,'edit-submit')]") public WebElement LoginButton;
	@FindBy(xpath="(//a[contains(@data-drupal-link-system-path, 'admin/content')])[3]") public WebElement content;
	@FindBy(xpath="//a[contains(text(), 'Scheduled content for Publish')]") public WebElement schedulecontent;
	@FindBy(xpath="//span[contains(text(), 'cid')]/following-sibling::span[contains(@class, 'str')]") public WebElement getCid;

	@FindBy(xpath="//a[contains(text(), 'Cache Invalidation message')]") public WebElement cacheinvalidationmessage;
	@FindBy(xpath="(//a[contains(text(), 'Revisions')])[2]") public WebElement revisions;

	@FindBy(xpath="//tbody/tr[1]/descendant::a[1]") public WebElement modifiedDate;

	@FindBy(xpath="//tbody/tr[1]/descendant::strong") public WebElement status;

	@FindBy(xpath="//div[contains(@id, 'toolbar-item-administration-tray')]/descendant::li[contains(@class, 'menu-item menu-item--expanded')]") public WebElement configuration;

	@FindBy(xpath="//a[contains(text(), 'TCP')]") public WebElement tcp;

	@FindBy(xpath="//a[contains(text(), 'Send invalidation messages')]") public WebElement Sendinvalidationmessages;

	@FindBy(xpath="//input[contains(@id, 'edit-submit')]") public WebElement Sendmessages;
	
	@FindBy(xpath="//input[contains(@id, 'edit-message')]") public WebElement searchcid;

	
	@FindBy(xpath="//input[contains(@id, 'edit-submit-cache-invalidation-messages-node')]") public WebElement applybutton;

	
	@FindBy(xpath="//tr/td[5]") public WebElement sentDate;

	
	
	
	@FindBy(linkText="CRM") public WebElement CRM;

	
	
	
}




