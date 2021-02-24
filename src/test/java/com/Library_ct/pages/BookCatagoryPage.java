package com.Library_ct.pages;

import com.Library_ct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BookCatagoryPage {

    public BookCatagoryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//select[@id='book_categories']")
    public WebElement dropDownList;

    @FindBy(tagName = "th")//it will return all 6
    public List<WebElement> tableHeaders;
}
