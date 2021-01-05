
package CMXTestCases;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import PageFactoryandTestdata.CMXLocatiors;
import PageFactoryandTestdata.HelpingFunction;


public class InvalidateMessagesAndSearchCID extends HelpingFunction  {


				public static void InvalidateMessages() throws InterruptedException{
						
						
					CMXLocatiors GetData=PageFactory.initElements(driver, CMXLocatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
				
					Actions action = new Actions(driver);
					WebElement we = GetData.content;
					action.moveToElement(we).build().perform();
					Click("Please click login button",GetData.cacheinvalidationmessage);
					Thread.sleep(15000);
					Input("Please Enter Password", GetData.searchcid, CID);
					Click("Please click login button",GetData.applybutton);
					
					Thread.sleep(30000);
					List<WebElement> li =driver.findElements(By.xpath("//tr/td[1]"));
					int size = li.size();
				    String count = Integer.toString(size); 
					Assert.assertEquals(count, "2");
					
					for(int a=0; a<size; a++)
					{
						String content = li.get(a).getText();
						Assert.assertTrue(content.contains("lang\":\"en"));
					}
					
					
					SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
				    Date date = new Date();  
				    System.out.println(formatter.format(date)); 

				    
				    List<WebElement> SDate = driver.findElements(By.xpath("//tr/td[5]"));
					int date_size = SDate.size();
					
					for(int len=0; len<date_size; len++) {
						
						String SentDateText=SDate.get(len).getText();
					    Assert.assertTrue(SentDateText.contains(formatter.format(date)));

						
					}
					
					
					
										
					
				}
				
}

