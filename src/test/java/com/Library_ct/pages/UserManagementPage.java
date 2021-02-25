package com.Library_ct.pages;

import com.Library_ct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagementPage {
    public UserManagementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//span[@class='title']")
    public WebElement usersModule;

    @FindBy(xpath="//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    public WebElement addUserButton;

    @FindBy(xpath="//button[@type='cancel']")
    public WebElement closeButton;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement saveChangesButton;

    @FindBy(xpath="(//a[@role='button'])[2]")
    public WebElement editUserButton;

    @FindBy(xpath="//input[@name='full_name']")
    public WebElement fullNameInput;

    @FindBy(xpath="//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath="//input[@name='email']")
    public WebElement emailInput;

    @FindBy(id="address")
    public WebElement addressInput;

}
