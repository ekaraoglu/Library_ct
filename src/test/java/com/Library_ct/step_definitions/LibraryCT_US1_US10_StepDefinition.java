package com.Library_ct.step_definitions;

import com.Library_ct.pages.LibraryCTPage;
import com.Library_ct.utilities.BrowserUtils;
import com.Library_ct.utilities.ConfigurationReader;
import com.Library_ct.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class LibraryCT_US1_US10_StepDefinition {
    LibraryCTPage libraryCTPage = new LibraryCTPage();
    Select select;

    @Given("the user login as a {string}")
    public void the_user_login_as_a(String userName) throws InterruptedException {
        if (userName.equalsIgnoreCase("librarian")) {
            Driver.getDriver().get(ConfigurationReader.getProperty("LibraryUrl"));
            Thread.sleep(3);
            libraryCTPage.inputEmail.sendKeys("librarian19@library");
            Thread.sleep(3);
            libraryCTPage.inputPassword.sendKeys("6M0J2Wr7");
            Thread.sleep(3);
            libraryCTPage.signInButton.click();
            Thread.sleep(3);
        } else if (userName.equalsIgnoreCase("student")) {
            Driver.getDriver().get(ConfigurationReader.getProperty("LibraryUrl"));
            Thread.sleep(3);
            libraryCTPage.inputEmail.sendKeys("student93@library");
            Thread.sleep(3);
            libraryCTPage.inputPassword.sendKeys("QU5745l5");
            Thread.sleep(3);
            libraryCTPage.signInButton.click();
            Thread.sleep(3);
        }
    }

    @Then("the user on {string}")
    public void the_user_on(String userPageName) {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(userPageName));

        Driver.closeDriver();
    }

    @When("the user click users module")
    public void the_user_click_users_module() {
        libraryCTPage.usersButton.click();
    }

    @When("the user click Status dropdown")
    public void the_user_click_status_dropdown() {
        libraryCTPage.statusDropDown.click();

    }

    @Then("the user should see the following options:")
    public void the_user_should_see_the_following_options(List<String> expectedStatus) {
        select = new Select(libraryCTPage.statusDropDown);
        List<WebElement> statuses = select.getOptions();
        List<String> actualStatus = new ArrayList<>();
        for (WebElement each : statuses) {
            actualStatus.add(each.getText());
        }

        Assert.assertTrue(actualStatus.equals(expectedStatus));

        Driver.closeDriver();

    }

    @Then("the user should see the following column names:")
    public void the_user_should_see_the_following_column_names(List<String> expectedTable) {

        List<WebElement> a = libraryCTPage.tableCollumNames;
        List<String> actualTable = new ArrayList<>();
        for (WebElement each : a) {
            actualTable.add(each.getText());
        }

        Assert.assertEquals(expectedTable,actualTable);
        Driver.closeDriver();

    }

}
