package CMXTestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Master.CMXExecution;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StartBrowser extends CMXExecution {


				public static void StartupBrowser(String Suite) throws InterruptedException, AWTException, IOException{
	
					
						if(browser.equals("chrome")){
					     WebDriverManager.chromedriver().setup();
						ChromeOptions options = new ChromeOptions();
						options.addArguments("-incognito");
					  	options.addArguments("--disable-popup-blocking");
					  	options.addArguments("--disable-extensions");
					  	options.addArguments();
					 	options.addArguments("--start-maximized");
					// 	options.addArguments("--start-fullscreen");

					  	driver = new ChromeDriver(options);
					 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
						}
					}
			
			}







