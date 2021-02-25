package com.Library_ct.step_definitions;

import com.Library_ct.pages.LoginPage;
import com.Library_ct.pages.PageBase;
import com.Library_ct.pages.UsersPage;
import com.Library_ct.utilities.BrowserUtils;
import com.Library_ct.utilities.ConfigurationReader;
import com.Library_ct.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US5_ShowRecords_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    PageBase pageBase = new PageBase();
    Select select;

    UsersPage usersPage = new UsersPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Given("User logs in as a librarian")
    public void user_logs_in_as_a_librarian() {
        BrowserUtils.sleep(2);
        loginPage.loginToLibraryAsLibrarian();

    }
    @When("User clicks on {string} link")
    public void user_clicks_on_link(String link) {
        BrowserUtils.waitForVisibility(pageBase.dashboardPageLink, 5);
        switch (link.toLowerCase()){
            case "dashboard":
                pageBase.dashboardPageLink.click();
                break;
            case "users":
                pageBase.usersPageLink.click();
                break;
            case "books":
                pageBase.booksPageLink.click();
                break;
        }

    }
    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer expected) {
        BrowserUtils.waitForVisibility(usersPage.showRecordsDropdown, 5);
        select = new Select(usersPage.showRecordsDropdown);
        System.out.println(select.getFirstSelectedOption().getText());
        String actual = select.getFirstSelectedOption().getText();
        Assert.assertEquals(expected+ "", actual);

    }
    @Then("show records should have the following <count> options:")
    public void show_records_should_have_the_following_count_options(List<String> options) {
        System.out.println("options = " + options);
        System.out.println("options.size() = " + options.size());

        select = new Select(usersPage.showRecordsDropdown);
        List<WebElement> webElements = select.getOptions();
        List<String> elementsText = BrowserUtils.getElementsText(webElements);
        Assert.assertEquals(options, elementsText);

    }
}
