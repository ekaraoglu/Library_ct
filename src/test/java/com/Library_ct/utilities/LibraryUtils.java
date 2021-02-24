    package com.Library_ct.utilities;

    import com.Library_ct.pages.LoginPage;

    public class LibraryUtils {
        public static  void loginAsStudent() {
            Driver.getDriver().get(ConfigurationReader.getProperty("url"));
            LoginPage loginPage=new LoginPage();
            loginPage.userNameInput.sendKeys(ConfigurationReader.getProperty("studentU1"));
            loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("studentPasswordU1"));
            loginPage.sighInButton.click();

        }
    }
