package com.Library_ct.pages;

import com.Library_ct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LibraryCTPage {

    public LibraryCTPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="inputEmail")
    public WebElement inputEmail;

    @FindBy(id="inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath="//*[@id=\"login-form\"]/button")
    public WebElement signInButton;

    @FindBy(xpath="//*[@id=\"menu_item\"]/li[2]/a")
    public WebElement usersButton;

    @FindBy(id="user_status")
    public WebElement statusDropDown;

    @FindBy(tagName = "th")
    public List<WebElement> tableCollumNames;



}
