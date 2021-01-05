package Master;
import static CMXTestCases.StartBrowser.StartupBrowser;

import java.awt.AWTException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.google.common.base.Predicate;
import CMXTestCases.*;
import PageFactoryandTestdata.CMXTestData;
import PageFactoryandTestdata.HelpingFunction;
public class CMXExecution {
	
	protected static WebDriver driver;
	protected static String CID;
	protected static ExtentReports extent;
	protected static ExtentTest test;
	public static String browser="chrome";
	static String Suite="CMX.html";
	
	protected static String PageName="Page 2020";
	
	public static String[] ModuleName = {"moduleA (249) - 2020-10-11-05-49", "moduleB (3cf) - 2020-10-11-12-17"};
	public static String[][] UpdatedContent = {{"FLAT 60% OFF"}, {"False"}};

	protected static String envirnment=CMXTestData.stage;
		
	@BeforeSuite
			public static void SystmProperties() throws InterruptedException, AWTException, IOException{

		
//		Runtime rt = Runtime.getRuntime();
//		rt.exec("cmd.exe /c start dir");
		
//		Runtime rt = Runtime.getRuntime();
//		rt.exec("cmd.exe /c start dir", null, new File("D:\\APIAutomation"));
		
		//taskkill /F /IM iexplore. exe;
		/*
		String command = "ping esp.asicentral.com";
		 
		try {
		    Process process = Runtime.getRuntime().exec(command);
		 
		    BufferedReader reader = new BufferedReader(
		            new InputStreamReader(process.getInputStream()));
		    String line=reader.readLine();
		    while ((line = reader.readLine()) != null) {
		        Assert.assertTrue(line.contains("52.177.84.6"));
		        break;
		    }
		 
		    reader.close();
		 
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		*/

				
			Systemroperties.Property();
	
		}

	
	@BeforeTest
			public void Startup() throws InterruptedException, AWTException, IOException{

					StartupBrowser(Suite);
			} 
	

	@Test(priority=1)
	 		public   void LoginCMX() throws InterruptedException, AWTException, IOException{
				 	Login.login();
				 	
			 	}
	
	
	@Test(priority=2)
	public static  void ValidateContent() throws InterruptedException, AWTException, IOException{
				//	ValidateContent.ValidateContent();
	 	
 				}
/*
	@Test(priority=2)
		public   void SearchPageFromPublishedContent() throws InterruptedException, AWTException, IOException{
					SearchPageFromPublishedcontent.SearchPageFromPublishedcontent();
		 	
	 	}

	
	@Test(priority=3)
	public   void NavigateToModuleAndgetCID() throws InterruptedException, AWTException, IOException{
					NavigateModuleAndgetCID.GotoModuleAndGetCID();
 	}
	
	@Test(priority=4)
	public   void GoToRevisionAndValidatePageIsPublishedAtCurrentDate() throws InterruptedException, AWTException, IOException{
					Revision.revision();
 	}
	
	@Test(priority=5)
	public   void SendInvalidationsMessages() throws InterruptedException, AWTException, IOException{
					SendMessages.SendMessages();
 	}
	
	@Test(priority=6)
	public   void NavigatetoInvalidateMessagesAndSearchCIDToVerifyCountAndDates() throws InterruptedException, AWTException, IOException{
					InvalidateMessagesAndSearchCID.InvalidateMessages();
 	}
	
	@Test(priority=7)
	public   void VerifyContentinAPI() throws InterruptedException, AWTException, IOException{
					GetAPI.ContentValidation();
 	}

	*/ 	
			 @AfterMethod

			public void getResult(ITestResult result) throws IOException, InterruptedException{
				 //System.out.println(result.getStatus());
				if(result.getStatus()==ITestResult.SUCCESS){
	 				test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case is Passed", ExtentColor.GREEN));
//	 				test.log(Status.PASS, " Please see attached screenshot");
//	 				String screenshotPath = HelpingFunction.capture(result.getName());
//		 			test.addScreenCaptureFromPath(screenshotPath);
		 			extent.flush();

		 			
	 				}

	 			
	 			if(result.getStatus()==ITestResult.FAILURE){
				 	test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case is Failed due to Below Issue", ExtentColor.RED));
//				 	String screenshotPath = HelpingFunction.capture(result.getName());
//				 	test.addScreenCaptureFromPath(screenshotPath);
			 		test.fail(result.getThrowable());
			 		extent.flush();
			 		}
				
	 			
	 			if(result.getStatus()==ITestResult.SKIP){
	 				System.out.print(result.getStatus());
	 				System.out.print("Test cases is skipped");
					test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Test Case is SKIPPED", ExtentColor.YELLOW));
					test.skip(result.getThrowable());
					extent.flush();
				    }				 		
	 			
			 }
			 
			@AfterTest
			public void endReport(){
			
			//	driver.get(System.getProperty("user.dir")+"/Reports/CRMReport.html");
			}
			@AfterSuite
			 public void CloseBrowser() throws IOException {
				
			
			}
			 
			  	
}
