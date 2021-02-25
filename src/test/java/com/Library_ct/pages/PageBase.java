package com.Library_ct.pages;

import com.Library_ct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    public PageBase(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Users")
    public WebElement usersPageLink;
    //Link to "Users" Module

    @FindBy(linkText = "Dashboard")
    public WebElement dashboardPageLink;

    @FindBy(className = "nav-link")
    public WebElement booksPageLink;

}
