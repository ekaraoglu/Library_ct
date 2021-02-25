package com.Library_ct.pages;

import com.Library_ct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BorrowingBooksPage extends PageBase{

    public  BorrowingBooksPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//section[@id='borrowing-books']//tr/th")
    public List<WebElement> borrowedBooksColumnName;
}
