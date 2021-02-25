package com.Library_ct.step_definitions;

import com.Library_ct.pages.LoginPage;
import com.Library_ct.pages.UsersPage;
import com.Library_ct.utilities.BrowserUtils;
import com.Library_ct.utilities.ConfigurationReader;
import com.Library_ct.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserGroupFunctionality_StepDefinitions {

    LoginPage loginPage =new LoginPage();

    UsersPage usersPage = new UsersPage();

    Select select;

    @Given("the user \\(Librarian) on the homepage")
    public void the_user_librarian_on_the_homepage() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("librarian"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
        loginPage.signInButton.click();
    }

    @When("the user click users module")
    public void the_user_click_users_module() {
        usersPage.usersPageLink.click();
    }

    @When("the user click User Group dropdown")
    public void the_user_click_user_group_dropdown() {
        select = new Select(usersPage.userGroupDropdown);
    }

    @Then("the user should see the following options:")
    public void the_user_should_see_the_following_options(List<String> expectedListOfUsersGroup) {
        // List<WebElement> actualListOfUsersGroup = select.getOptions();
        List<String> actualUsersGroupAsText = BrowserUtils.getElementsText(select.getOptions());

        // System.out.println("expectedListOfUsersGroup.size() = " + expectedListOfUsersGroup.size());
        // System.out.println("expectedListOfUsersGroup = " + expectedListOfUsersGroup);
        // for (WebElement element : actualListOfUsersGroup) {
        //    System.out.println("element.getText() = " + element.getText());

        Assert.assertTrue(expectedListOfUsersGroup.equals(actualUsersGroupAsText));
    }
}
