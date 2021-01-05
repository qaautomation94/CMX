
package CMXTestCases;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PageFactoryandTestdata.CMXLocatiors;
import PageFactoryandTestdata.HelpingFunction;


public class Revision extends HelpingFunction  {


				public static void revision() throws InterruptedException{
												
					CMXLocatiors GetData=PageFactory.initElements(driver, CMXLocatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());

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
				    
				    /*
				     
		ZonedDateTime dateTime = ZonedDateTime.now(); // Gets the current date and time, with your default time-zone
		System.out.println(dateTime);
		dateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(dateTime);

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	    Date date1 = new Date();  
	    System.out.println(formatter.format(date1));
	    
		LocalDate date = LocalDate.now(ZoneId.of("Europe/Paris")); // Gets current date in Paris
		System.out.println(date);

		System.out.println(ZoneId.getAvailableZoneIds());

				     */
				    
				    
				    
				    
				    
				    
				    
				}
				
}

