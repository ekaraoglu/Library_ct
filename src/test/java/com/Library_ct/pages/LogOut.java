package com.Library_ct.pages;

import com.Library_ct.utilities.ConfigurationReader;
import com.Library_ct.utilities.Driver;
import com.sun.xml.internal.ws.model.WrapperBeanGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
    public LogOut(){
        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(id="inputEmail")
    public WebElement InputEmail;

    @FindBy(id="inputPassword")
    public WebElement InputPassword;

    @FindBy(xpath = "//*[@id=\"login-form\"]/button[1]")
    public WebElement LoginButton;

   @FindBy(xpath = "//*[@id=\"navbarDropdown\"]/span[1]")
    public WebElement TestStudent101Button;

    @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/ul[2]/li/div/a")

    public WebElement LogOutButton;
    @FindBy(xpath = "//p[.='© 2020']")

    public WebElement AssertText2020;



    public void LoginandOutOfLibraryAsStudent(){

        InputEmail.sendKeys(ConfigurationReader.getProperty("email"));
        InputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        LoginButton.click();



    }
}
