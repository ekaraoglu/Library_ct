package com.Library_ct.pages;

import com.Library_ct.utilities.ConfigurationReader;
import com.Library_ct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "inputEmail")
    public WebElement inputEmail;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;




    public void loginToLibraryAsStudent() {
        inputEmail.sendKeys(ConfigurationReader.getProperty("email"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

    public void loginToLibraryAsLibrarian(){
        inputEmail.sendKeys(ConfigurationReader.getProperty("librarian"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
        loginButton.click();
    }
}