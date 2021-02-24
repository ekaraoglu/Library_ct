package com.Library_ct.step_definitions;

import com.Library_ct.pages.BookCatagoryPage;
import com.Library_ct.pages.LoginPage;
import com.Library_ct.utilities.BrowserUtils;
import com.Library_ct.utilities.ConfigurationReader;
import com.Library_ct.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BookCategory_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    BookCatagoryPage bookCatagoryPage = new BookCatagoryPage();



    @Given("student logins and lands on books page")
    public void studentLoginsAndLandsOnBooksPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(3);


        loginPage.loginToLibraryAsStudent();
    }


    @Then("Student can choose from the list all the category dropdown")
    public void studentCanChooseFromTheListAllTheCategoryDropdown(List<String> expectedCategories) {
        System.out.println("allCategories = " + expectedCategories);
        Select select = new Select(bookCatagoryPage.dropDownList);
        List<String> actualCategoryList = new ArrayList<>();

        for(WebElement each : select.getOptions()){
            actualCategoryList.add(each.getText());
        }
        System.out.println("actualCategoryList = " + actualCategoryList);

        Assert.assertEquals(actualCategoryList, expectedCategories);


    }
}
