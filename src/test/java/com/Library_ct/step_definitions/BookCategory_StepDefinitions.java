package com.Library_ct.step_definitions;

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



    @Given("student logins and lands on books page")
    public void studentLoginsAndLandsOnBooksPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(3);


        loginPage.logintoLibraryAsStudent();
    }


    @Then("Student can choose from the list all the category dropdown")
    public void studentCanChooseFromTheListAllTheCategoryDropdown(List<String> allCategories) {
        System.out.println("allCategories = " + allCategories);
        Select select = new Select(loginPage.dropDownList);
        List<String> actualCategoryList = new ArrayList<>();

        for(WebElement each : select.getOptions()){
            actualCategoryList.add(each.getText());
        }
        System.out.println("actualCategoryList = " + actualCategoryList);

        Assert.assertEquals(actualCategoryList, allCategories);


    }
}
