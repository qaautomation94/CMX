
package CMXTestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import PageFactoryandTestdata.CMXLocatiors;
import PageFactoryandTestdata.HelpingFunction;


public class NavigateModuleAndgetCID extends HelpingFunction  {


				public static void GotoModuleAndGetCID() throws InterruptedException{
						
						
					CMXLocatiors GetData=PageFactory.initElements(driver, CMXLocatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.findElement(By.xpath("//a[contains(text(), '"+ModuleName+"')]")).click();
					
					 CID = GetData.getCid.getText();
					System.out.println(CID);

					
					
						
					
					
				}
				
}

