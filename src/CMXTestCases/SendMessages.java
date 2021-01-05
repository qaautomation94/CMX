
package CMXTestCases;


import org.openqa.selenium.support.PageFactory;

import PageFactoryandTestdata.CMXLocatiors;
import PageFactoryandTestdata.HelpingFunction;


public class SendMessages extends HelpingFunction  {


				public static void SendMessages() throws InterruptedException{
						
						
					CMXLocatiors GetData=PageFactory.initElements(driver, CMXLocatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					Click("Please click login button",GetData.Sendinvalidationmessages);
					Thread.sleep(10000);
					Click("Please click login button",GetData.Sendmessages);
					Thread.sleep(15000);
				
		
					
					
				}
				
}

