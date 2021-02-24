    package com.Library_ct.utilities;

    import com.Library_ct.pages.LoginPage;

    public class LibraryUtils {
        public static void loginAsStudent() {
            Driver.getDriver().get(ConfigurationReader.getProperty("url"));
            LoginPage loginPage = new LoginPage();
            loginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("studentU1"));
            loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("studentPasswordU1"));
            loginPage.loginButton.click();

        }
    }
