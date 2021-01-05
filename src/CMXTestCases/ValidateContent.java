
package CMXTestCases;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PageFactoryandTestdata.CMXLocatiors;
import PageFactoryandTestdata.HelpingFunction;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class ValidateContent extends HelpingFunction  {


				public static void ValidateContent() throws InterruptedException{
						
						
					CMXLocatiors GetData=PageFactory.initElements(driver, CMXLocatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					int modulesize=ModuleName.length;
					
					for(int moduleno=0; moduleno<modulesize; moduleno++)
					{
						if(moduleno==0) {
					driver.findElement(By.xpath("//a[contains(text(), 'Advanced')]")).click();
						}
					Actions action = new Actions(driver);
					WebElement we = GetData.content;
					action.moveToElement(we).build().perform();
					
					Thread.sleep(10000);
					Click("Please click login button",GetData.schedulecontent);

					Thread.sleep(10000);
					driver.findElement(By.xpath("//a[contains(text(), '"+PageName+"')]")).click();
					Thread.sleep(10000);
					if(moduleno>0) {
						driver.findElement(By.xpath("//span[contains(text(), '"+PageName+"')]")).click();

					}

					
					
					driver.findElement(By.xpath("//a[contains(text(), '"+ModuleName[moduleno]+"')]")).click();
					CID = GetData.getCid.getText();
					System.out.println(CID);

					
					
			//Revision		
					Click("Please click login button",GetData.revisions);
					Thread.sleep(15000);
					String PublishedDate=GetData.modifiedDate.getText();
					
					SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
				    Date date = new Date();  
				    System.out.println(formatter.format(date)); 
				    System.out.println(PublishedDate);

				    Assert.assertTrue(PublishedDate.contains(formatter.format(date)));
				    
					String status=GetData.status.getText();
				    Assert.assertEquals("Published", status);

					
						////////////////
				    
				    
					Click("Please click login button",GetData.Sendinvalidationmessages);
					Thread.sleep(10000);
					Click("Please click login button",GetData.Sendmessages);
					Thread.sleep(15000);
				
					
					////////////////////////
					
					
					
					
					 we = GetData.content;
					action.moveToElement(we).build().perform();
					Click("Please click login button",GetData.cacheinvalidationmessage);
					Thread.sleep(15000);
					Input("Please Enter Password", GetData.searchcid, CID);
					Click("Please click login button",GetData.applybutton);
					
					Thread.sleep(30000);
					List<WebElement> li =driver.findElements(By.xpath("//tr/td[1]"));
					int size = li.size();
				    String count = Integer.toString(size); 
					/*
				    Assert.assertEquals(count, "2");
					
					for(int m=0; m<size; m++)
					{
						String content = li.get(m).getText();
						Assert.assertTrue(content.contains("lang\":\"en"));
					}
					
					
				//	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
				     date = new Date();  
				    System.out.println(formatter.format(date)); 

				    
				    List<WebElement> SDate = driver.findElements(By.xpath("//tr/td[5]"));
					int date_size = SDate.size();
					
					for(int len=0; len<date_size; len++) {
						
						String SentDateText=SDate.get(len).getText();
					    Assert.assertTrue(SentDateText.contains(formatter.format(date)));

						
					}
					
					*/
					
					RequestSpecification request = null;
					Response resp;
					CID=CID.substring(1, CID.length()-1);
					request=RestAssured.given();
					request.header("Accept","application/json");
					request.header("Content-Type","application/json");
					resp =request.request(Method.GET, envirnment+"api/module/"+CID);								
					String responseBody =	 resp.getBody().asString();
					System.out.println(responseBody);

					int length=UpdatedContent.length;// Return Rows
					
					System.out.println("Length of Array is"+ length);
					
					for(int rows =moduleno; rows<moduleno; rows++) {
						int colLenth=UpdatedContent[rows].length;
						  for(int col=0; col<colLenth; col++) {
								Assert.assertTrue(responseBody.contains(UpdatedContent[rows][col]));

						  }
				
					}
					
						
				}
				

				}

					
					
				}
				
				
