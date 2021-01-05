
package CMXTestCases;


import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import PageFactoryandTestdata.CMXLocatiors;
import PageFactoryandTestdata.CMXTestData;
import PageFactoryandTestdata.HelpingFunction;


public class Login extends HelpingFunction  {


				public static  void login() throws InterruptedException, AWTException, IOException{
						
						
					CMXLocatiors GetData=PageFactory.initElements(driver, CMXLocatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.get(envirnment);
					Input("Please Enter UserName", GetData.UserName, CMXTestData.USER);
					Input("Please Enter Password", GetData.Password, CMXTestData.PASS);
					Click("Please click login button",GetData.LoginButton);
					Thread.sleep(20000);
										
				}
				
}

