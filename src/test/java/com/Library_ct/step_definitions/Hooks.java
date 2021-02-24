package com.Library_ct.step_definitions;

import com.Library_ct.utilities.BrowserUtils;
import com.Library_ct.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After(order = 2)
    public void tearDownScenario(){

        //BrowserUtils.sleep(1);
        Driver.closeDriver();

    }
}
