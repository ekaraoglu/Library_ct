package com.Library_ct.step_definitions;

import com.Library_ct.pages.LogOut;
import com.Library_ct.pages.LoginPage;
import com.Library_ct.utilities.ConfigurationReader;
import com.Library_ct.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LogOut_StepDefinitons {
    LoginPage loginPages = new LoginPage();
    LogOut LogOut=new LogOut();


    @Given("Student logins in")
    public void student_logins_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
       loginPages.inputEmail.sendKeys(ConfigurationReader.getProperty("email"));
       loginPages.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
       loginPages.loginButton.click();
    }


    @Then("Student is on Books page")
    public void student_is_on_books_page() {

    }
    @Then("Student logs out")
    public void student_logs_out() {

       LogOut.TestStudent101Button.click();
       LogOut.LogOutButton.click();

        Assert.assertTrue(LogOut.AssertText2020.isDisplayed());


    }
}
