package com.MySeleniumProgramme.utilities;


//import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriverService;


/**
 * Created by LDNAPC on 5/14/2019.
 */
public class Driver {
    private static WebDriver myDriver;

    //private static Logger LOGGER = Logger.getLogger(Driver.class.getName());

    private static long timeout=10;
    public enum DriverTypes {
        INTERNETEXPLORER,FIREFOX,CHROME,GHOST

    }
    public static DriverTypes defaultDriver = DriverTypes.FIREFOX;
    /*  private static FirefoxProfile profile = new FirefoxProfile();
      private static ChromeOptions options = new ChromeOptions();
  */
    public static WebDriver getDriver(DriverTypes d)
    {
        if(myDriver==null)
        {
            switch(d)
            {
                /*case INTERNETEXPLORER:
                    System.setProperty("webdriver.ie.driver", "C:\\Users\\idnkiw\\bin\\IEDriverServer_64.exe");
                    myDriver = new InternetExplorerDriver();
                    break;  */
                case CHROME:
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\LDNAPC\\IdeaProjects\\MySeleniumProgramme\\src\\Driver\\chromedriver.exe");
                    myDriver = new ChromeDriver();
                    break;

                case FIREFOX:
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\LDNAPC\\IdeaProjects\\MySeleniumProgramme\\src\\Driver\\geckodriver.exe");
                    myDriver = new ChromeDriver();
                    break;

                /*case GHOST:
                    Capabilities caps = new DesiredCapabilities();
                    ((DesiredCapabilities) caps).setJavascriptEnabled(true);                //< not really needed: JS enabled by default
                    ((DesiredCapabilities) caps).setCapability("takesScreenshot", true);    //< yeah, GhostDriver haz screenshotz!
                    ((DesiredCapabilities) caps).setCapability(
                            PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                            "C:\\DEV\\ghostDriver\\phantomjs-1.9.7-windows\\phantomjs.exe"
                    );
                    myDriver = new PhantomJSDriver(caps);
                    break;   */
            }

            defaultDriver = d;

            // LOGGER.debug("Setting Browser to " + d);

            myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //LOGGER.debug("Setting Driver Time Out to 20 Seconds");

            myDriver.manage().window().maximize();

            //LOGGER.debug("Maximising Browser Window");
        }

        timeout=10;
        //  SetBrowserLanguage(l);
        return myDriver;
    }

}
