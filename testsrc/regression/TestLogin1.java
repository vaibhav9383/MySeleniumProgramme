package regression;

import com.MySeleniumProgramme.pages.Login;
import com.MySeleniumProgramme.pages.Login1;
import com.MySeleniumProgramme.utilities.Driver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ResourceBundle;

/**
 * Created by LDNAPC on 5/20/2019.
 *
 * Local Machine URL
 */

public class TestLogin1 {

    //ExtentReports extent;

  /*@BeforeClass
    public void before1()
   {
       extent=new ExtentReports("Report/report.html",true, NetworkMode.OFFLINE);

   }*/


   ExtentReports extent=new ExtentReports("Report/report1.html",true, NetworkMode.OFFLINE);
    ExtentTest test=extent.startTest("Login Test","To test the functionality of Login Button For Valid Input");



    WebDriver driver = Driver.getDriver(Driver.DriverTypes.CHROME);

   @Test


    public void testlogin1() throws InterruptedException {
       ResourceBundle rb = ResourceBundle.getBundle("MySeleniumProgramme");

        String url = rb.getString("url");


        driver.get(url);
      // Thread.sleep(20000);

        test.log(LogStatus.INFO, "Browser is Opened and Maximised");

        Login1 login1 = new Login1(driver);
        test.log(LogStatus.INFO, "URL is Opened");

        Thread.sleep(20000);

        login1.setTxtCompanyCode("c0001");
        test.log(LogStatus.INFO, "Company code is set");

        login1.clickProceed();
        test.log(LogStatus.INFO, "Proceed Button is clicked");

        login1.setTxtMobileNum("1234567890");
        test.log(LogStatus.INFO, "Mobile No is Entered");

        login1.setTxtPassword("test123");
        test.log(LogStatus.INFO, "Password is entered");

        login1.clickLogin();
        test.log(LogStatus.INFO, "Cliked On LoginButton");


        extent.endTest(test);
        extent.flush();

    }

   // ExtentReports extent=new ExtentReports("Report/report1.html",true, NetworkMode.OFFLINE);
    //ExtentTest test=extent.startTest("Login Test","To test the functionality of Login Button For Valid Input");



    //WebDriver driver = Driver.getDriver(Driver.DriverTypes.CHROME);

    @Test (priority = 2)
    public void testlogin2() throws InterruptedException
    {
        Thread.sleep(20000);
        ResourceBundle rb = ResourceBundle.getBundle("MySeleniumProgramme");

        //Thread.sleep(20000);

        String url = rb.getString("url");

       // Thread.sleep(20000);

        driver.get(url);
        Thread.sleep(20000);

        test.log(LogStatus.INFO, "Browser is Opened and Maximised");

        Login1 login1 = new Login1(driver);
        test.log(LogStatus.INFO, "URL is Opened");

        //Thread.sleep(20000);

        login1.setTxtCompanyCode("c0001");
        test.log(LogStatus.INFO, "Company code is set 2");

        login1.clickProceed();
        test.log(LogStatus.INFO, "Proceed Button is clicked");

        login1.setTxtMobileNum("1234567890");
        test.log(LogStatus.INFO, "Mobile No is Entered 2");

        login1.setTxtPassword("test123");
        test.log(LogStatus.INFO, "Password is entered 2");

        login1.clickLogin();
        test.log(LogStatus.INFO, "Cliked On LoginButton");

        extent.endTest(test);
        extent.flush();
    }


}
