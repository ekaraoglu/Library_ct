package com.Library_ct.step_definitions;

import com.Library_ct.pages.BookCatagoryPage;
import com.Library_ct.pages.LoginPage;
import com.Library_ct.pages.UserManagementPage;
import com.Library_ct.pages.UserModulesPage;
import com.Library_ct.utilities.BrowserUtils;
import com.Library_ct.utilities.ConfigurationReader;
import com.Library_ct.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US3_UsersAccessToModules_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    UserModulesPage userModulesPage = new UserModulesPage();


    @Given("the student is on the home page")
    public void the_student_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginToLibraryAsStudent();
    }

    @Then("the user should see following 2 modules")
    public void the_user_should_see_following_2_modules(List<String> expectedStudentModules) {
        List<String> actualStudentModules = BrowserUtils.getElementsText(userModulesPage.studentModules);

        System.out.println("Expected Student Modules = " + expectedStudentModules);
        System.out.println("Actual Student Modules = " + actualStudentModules);
        Assert.assertEquals(expectedStudentModules,actualStudentModules);

        Driver.closeDriver();
    }

    @Given("the librarian is on the homepage")
    public void the_librarian_is_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginToLibraryAsLibrarian();
    }

    @Then("the user should see following 3 modules")
    public void the_user_should_see_following_3_modules(List<String> expectedLibrarianModules) {
        List<String> actualLibrarianModules = BrowserUtils.getElementsText(userModulesPage.librarianModules);

        System.out.println("Expected Librarian Modules = " + expectedLibrarianModules);
        System.out.println("Actual Librarian Modules = " + actualLibrarianModules );
        Assert.assertEquals(expectedLibrarianModules,actualLibrarianModules);

        Driver.closeDriver();
    }

}
