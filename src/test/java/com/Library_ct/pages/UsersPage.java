package com.Library_ct.pages;

import com.Library_ct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UsersPage extends PageBase{

   public UsersPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//select[@aria-controls='tbl_users']")
    public WebElement showRecordsDropdown;

    @FindBy(xpath = "//tr/th")
    public List<WebElement> tableHeaders;

    @FindBy(xpath = "//select[@id='user_groups']")
    public WebElement userGroupDropdown;
}
