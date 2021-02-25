package com.Library_ct.pages;

import com.Library_ct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    public PageBase(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Users']")
    public WebElement usersPageLink;

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardPageLink;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksPageLink;

    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle']/span")
    public WebElement accountUserName;

    @FindBy(xpath = "//a[@href='#borrowing-books']")
    public WebElement borrowingBooksLink;
}
