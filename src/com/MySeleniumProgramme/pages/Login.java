package com.MySeleniumProgramme.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by LDNAPC on 5/16/2019.
 *
 * Not working it is only used on Staging
 */
public class Login {

    WebDriver driver;




    @FindBy(id = "componentcontainer---login--cmpcode-inner")
    WebElement txtCompanycode;


    @FindBy(id = "__button0-BDI-content")
    WebElement btnProceed;

   @FindBy(id = "componentcontainer---login--umobile-inner")
    WebElement txtMobileNum;

    @FindBy(id="componentcontainer---login--pasw-inner")
    WebElement txtPassword;


    //id="sap-ui-invisible-componentcontainer---login--vboxForPsw"
    // @FindBy(id = "sap-ui-invisible-componentcontainer---login--vboxForPsw")

    @FindBy(id="//__button1-BDI-content")
    WebElement btnLogin;


    public Login(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void setTxtCompanyCode(String cmpCode)
    {
       txtCompanycode.sendKeys(cmpCode);

    }

    public void clickProceed()
    {
        btnProceed.click();
    }

    public void setTxtMobileNum(String username)
    {
        txtMobileNum.sendKeys(username);

    }

    public void setTxtPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public void clickLogin()
    {
        btnLogin.click();
    }

}
