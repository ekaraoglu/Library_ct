package com.Library_ct.pages;

import com.Library_ct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserModulesPage {

      public UserModulesPage(){PageFactory.initElements(Driver.getDriver(), this);}

        @FindBy(xpath = "//a[@class='nav-link']")
        public List<WebElement> studentModules;

        @FindBy(xpath = "//a[@class='nav-link']")
        public List<WebElement> librarianModules;
    }

