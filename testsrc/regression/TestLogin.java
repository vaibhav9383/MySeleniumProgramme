package regression;

import com.MySeleniumProgramme.pages.Login;
import com.MySeleniumProgramme.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
//import utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.ws.handler.LogicalHandler;
import java.util.ResourceBundle;

/**
 * Created by LDNAPC on 5/15/2019.
 */
public class TestLogin {

  WebDriver driver= Driver.getDriver(Driver.DriverTypes.CHROME);

  @Test
    public void testlogin() throws InterruptedException {
      ResourceBundle rb=ResourceBundle.getBundle("MySeleniumProgramme");

      String url=rb.getString("url");


      driver.get(url);
     Thread.sleep(20000);


      Login login=new Login(driver);

     // Thread.sleep(30000);

     login.setTxtCompanyCode("DMOC1");

     login.clickProceed();


      login.setTxtMobileNum("1234567890");

      login.setTxtPassword("test123");

      login.clickLogin();


    }
}
