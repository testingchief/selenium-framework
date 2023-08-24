package org.testingchief;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.testingchief.utilities.DriverFactory;
import org.testng.annotations.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/"},
        glue = {"org.testingchief"},
        plugin = {"pretty", "junit:reports/cucumber.xml", "junit:reports/cucumber.json"})

public class RunCucumberTest extends AbstractTestNGCucumberTests {

    @Parameters({"env", "browser"})
    @BeforeClass
    public void startBrowser(String env, String browser){
        DriverFactory.setDriver("Chrome");
    }

    @AfterTest
    public void logOut(){
        DriverFactory.getDriver().findElement(By.xpath("//a[normalize-space()='Log Out']")).click();
    }

    @AfterClass
    public void tearDown(){
        DriverFactory.quitDriver();
    }
}
