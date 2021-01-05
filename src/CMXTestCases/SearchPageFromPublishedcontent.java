
package CMXTestCases;


import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import PageFactoryandTestdata.CMXLocatiors;
import PageFactoryandTestdata.HelpingFunction;


public class SearchPageFromPublishedcontent extends HelpingFunction  {


				public static  void SearchPageFromPublishedcontent() throws InterruptedException, AWTException, IOException{
						
						
					CMXLocatiors GetData=PageFactory.initElements(driver, CMXLocatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.findElement(By.xpath("//a[contains(text(), 'Advanced')]")).click();
					
					Actions action = new Actions(driver);
					WebElement we = GetData.content;
					action.moveToElement(we).build().perform();
					
					Thread.sleep(10000);
					Click("Please click login button",GetData.schedulecontent);

					Thread.sleep(10000);
					driver.findElement(By.xpath("//a[contains(text(), '"+PageName+"')]")).click();
					Thread.sleep(10000);
								
				}
				
}

