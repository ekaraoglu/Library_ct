package com.Library_ct.step_definitions;

import com.Library_ct.pages.BorrowingBooksPage;
import com.Library_ct.pages.LoginPage;
import com.Library_ct.utilities.BrowserUtils;
import com.Library_ct.utilities.ConfigurationReader;
import com.Library_ct.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BorrowingBooksTable_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    BorrowingBooksPage borrowingBooksPage = new BorrowingBooksPage();

    @Given("the user on the homepage")
    public void the_user_on_the_homepage() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("studentU1"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("studentPasswordU1"));
        loginPage.signInButton.click();

    }

    @When("the user click Borrowing Books module")
    public void the_user_click_borrowing_books_module() {
        borrowingBooksPage.borrowingBooksLink.click();
    }

    @Then("the user should see the following column names:")
    public void the_user_should_see_the_following_column_names(List<String> expectedBooksColumnName) {
        List<WebElement> actualBooksColumnNames = borrowingBooksPage.borrowedBooksColumnName;
        /*
         List<String > actualBooksColumnNamesAsText = new ArrayList<>();

        for (WebElement each : actualBooksColumnNames) {

           // System.out.println("each.getText() = " + each.getText());

            System.out.println("actualBooksColumnNamesAsText.add(each.getText()) = " + actualBooksColumnNamesAsText.add(each.getText()));

            //  System.out.println("actualBooksColumnNamesAsText.add(actualBooksColumnName.getText()) = " + actualBooksColumnNamesAsText.add(each.getText()));


        }
Assert.assertTrue(expectedBooksColumnName.equals(actualBooksColumnNamesAsText));

         */

        List<String> actualText = BrowserUtils.getElementsText(borrowingBooksPage.borrowedBooksColumnName);

        System.out.println("actualText = " + actualText);

        Assert.assertTrue(expectedBooksColumnName.equals(actualText));

    }

}
