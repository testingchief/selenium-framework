package org.testingchief;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.testingchief.utilities.DriverFactory;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/"},
        glue = {"org.testingchief"},
        plugin = {"pretty", "junit:reports/cucumber.xml", "junit:reports/cucumber.json"})

public class RunCucumberTest {

    @BeforeClass
    public static void startBrowser() {
        DriverFactory.setDriver("Chrome");
    }

    @After
    public static void logOut() {
        DriverFactory.getDriver().findElement(By.xpath("//a[normalize-space()='Log Out']")).click();
    }

    @AfterClass
    public static void tearDown() {
        DriverFactory.quitDriver();
    }
}
