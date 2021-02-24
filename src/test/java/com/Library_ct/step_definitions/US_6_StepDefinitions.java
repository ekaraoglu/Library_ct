package com.Library_ct.step_definitions;

import com.Library_ct.pages.BookManagementPage;
import com.Library_ct.utilities.BrowserUtils;
import com.Library_ct.utilities.Driver;
import com.Library_ct.utilities.LibraryUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US_6_StepDefinitions {
    BookManagementPage bookManagementPage=new BookManagementPage();
    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
       LibraryUtils.loginAsStudent();
    }

    @Then("the user should see the following column names:")
    public void the_user_should_see_the_following_column_names(List<String>expectedColumnNames) {
       List<WebElement>list= bookManagementPage.tableColumns;
       List<String>actualColumnNames= new ArrayList<>();
        for (WebElement each:list) {
            actualColumnNames.add(each.getText());
        }
        System.out.println("expectedColumnNames = " + expectedColumnNames);
        System.out.println("actualColumnNames = " + actualColumnNames);
        Assert.assertEquals("Not equals,check values",expectedColumnNames, actualColumnNames);
    }


}
