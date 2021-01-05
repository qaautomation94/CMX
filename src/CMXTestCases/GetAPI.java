
package CMXTestCases;


import org.openqa.selenium.support.PageFactory;

import PageFactoryandTestdata.CMXLocatiors;
import PageFactoryandTestdata.HelpingFunction;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;


public class GetAPI extends HelpingFunction  {


				public static void ContentValidation() throws InterruptedException{
						
					CMXLocatiors GetData=PageFactory.initElements(driver, CMXLocatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					RequestSpecification request = null;
					Response resp;
					CID=CID.substring(1, CID.length()-1);
					request=RestAssured.given();
					request.header("Accept","application/json");
					request.header("Content-Type","application/json");
					resp =request.request(Method.GET, envirnment+"api/module/"+CID);								
					String responseBody =	 resp.getBody().asString();
					System.out.println(responseBody);

					int length=UpdatedContent.length;
					System.out.println("Length of Array is"+ length);
					
					for(int a =0; a<length; a++) {
					//	Assert.assertTrue(responseBody.contains(UpdatedContent[a]));
					}
					
						
				}
				
}

