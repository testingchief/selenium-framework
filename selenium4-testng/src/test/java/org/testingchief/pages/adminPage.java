package org.testingchief.pages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class adminPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#headerPanel ul:nth-of-type(2) li:nth-of-type(2) a")
    @CacheLookup
    private WebElement about;

    @FindBy(css = "#headerPanel ul:nth-of-type(1) li:nth-of-type(2) a")
    @CacheLookup
    private WebElement aboutUs1;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(2) a")
    @CacheLookup
    private WebElement aboutUs2;

    @FindBy(css = "a[href='admin.htm']")
    @CacheLookup
    private WebElement adminPage;

    @FindBy(name = "action")
    @CacheLookup
    private WebElement clean;

    @FindBy(css = "a[href='/parabank/admin.htm']")
    @CacheLookup
    private WebElement clear;

    @FindBy(css = "#headerPanel ul:nth-of-type(2) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement contact;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(8) a")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "a[href='lookup.htm']")
    @CacheLookup
    private WebElement forgotLoginInfo;

    @FindBy(css = "a[href='http://forums.parasoft.com/']")
    @CacheLookup
    private WebElement forum;

    @FindBy(css = "#headerPanel ul:nth-of-type(2) li:nth-of-type(1) a")
    @CacheLookup
    private WebElement home1;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(1) a")
    @CacheLookup
    private WebElement home2;

    @FindBy(name = "action")
    @CacheLookup
    private WebElement initialize;

    @FindBy(name = "accessMode")
    @CacheLookup
    private List<WebElement> leaveBlankToUseDefaultEndpoint1;

    @FindBy(id = "loanProvider")
    @CacheLookup
    private WebElement leaveBlankToUseDefaultEndpoint10;

    @FindBy(id = "loanProcessor")
    @CacheLookup
    private WebElement leaveBlankToUseDefaultEndpoint11;

    @FindBy(id = "loanProcessorThreshold")
    @CacheLookup
    private WebElement leaveBlankToUseDefaultEndpoint12;

    @FindBy(name = "accessMode")
    @CacheLookup
    private List<WebElement> leaveBlankToUseDefaultEndpoint2;

    @FindBy(name = "accessMode")
    @CacheLookup
    private List<WebElement> leaveBlankToUseDefaultEndpoint3;

    @FindBy(name = "accessMode")
    @CacheLookup
    private List<WebElement> leaveBlankToUseDefaultEndpoint4;

    @FindBy(id = "soapEndpoint")
    @CacheLookup
    private WebElement leaveBlankToUseDefaultEndpoint5;

    @FindBy(id = "restEndpoint")
    @CacheLookup
    private WebElement leaveBlankToUseDefaultEndpoint6;

    @FindBy(id = "endpoint")
    @CacheLookup
    private WebElement leaveBlankToUseDefaultEndpoint7;

    @FindBy(id = "initialBalance")
    @CacheLookup
    private WebElement leaveBlankToUseDefaultEndpoint8;

    @FindBy(id = "minimumBalance")
    @CacheLookup
    private WebElement leaveBlankToUseDefaultEndpoint9;

    private final String leaveBlankToUseDefaultEndpointValue = "soap";

    private final String leaveBlankToUseDefaultEndpointValue = "restxml";

    private final String leaveBlankToUseDefaultEndpointValue = "restjson";

    private final String leaveBlankToUseDefaultEndpointValue = "jdbc";

    @FindBy(css = "#headerPanel ul:nth-of-type(1) li:nth-of-type(5) a")
    @CacheLookup
    private WebElement locations1;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(5) a")
    @CacheLookup
    private WebElement locations2;

    @FindBy(css = "#loginPanel form div:nth-of-type(3) input.button[type='submit']")
    @CacheLookup
    private WebElement logIn;

    private final String pageLoadedText = "(leave blank to use default endpoint)";

    private final String pageUrl = "/parabank/admin.htm";

    @FindBy(css = "#topPanel a:nth-of-type(2)")
    @CacheLookup
    private WebElement parabank;

    @FindBy(css = "#headerPanel ul:nth-of-type(1) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement products1;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement products2;

    @FindBy(css = "a[href='register.htm']")
    @CacheLookup
    private WebElement register;

    @FindBy(css = "#headerPanel ul:nth-of-type(1) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement services1;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement services2;

    @FindBy(css = "#rightPanel table.table_hidden tbody tr td:nth-of-type(2) form table.form2 tbody tr td:nth-of-type(3) input.button[type='submit']")
    @CacheLookup
    private WebElement shutdown;

    @FindBy(css = "a[href='/parabank/sitemap.htm']")
    @CacheLookup
    private WebElement siteMap;

    @FindBy(css = "#adminForm input.button[type='submit']")
    @CacheLookup
    private WebElement submit;

    @FindBy(css = "a[href='/parabank/api-docs/index.html']")
    @CacheLookup
    private WebElement swagger;

    @FindBy(css = "a[href='services/bank?_wadl&_type=xml']")
    @CacheLookup
    private WebElement wadl;

    @FindBy(css = "a[href='services/ParaBank?wsdl']")
    @CacheLookup
    private WebElement wsdl1;

    @FindBy(css = "a[href='services/LoanProcessor?wsdl']")
    @CacheLookup
    private WebElement wsdl2;

    @FindBy(css = "a[href='http://www.parasoft.com/']")
    @CacheLookup
    private WebElement wwwParasoftCom;

    public adminPage() {
    }

    public adminPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public adminPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public adminPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickAboutUs1Link() {
        aboutUs1.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickAboutUs2Link() {
        aboutUs2.click();
        return this;
    }

    /**
     * Click on Admin Page Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickadminPageLink() {
        adminPage.click();
        return this;
    }

    /**
     * Click on Clean Button.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickCleanButton() {
        clean.click();
        return this;
    }

    /**
     * Click on Clear Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickClearLink() {
        clear.click();
        return this;
    }

    /**
     * Click on Contact Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickContactLink() {
        contact.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Forgot Login Info Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickForgotLoginInfoLink() {
        forgotLoginInfo.click();
        return this;
    }

    /**
     * Click on Forum Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickForumLink() {
        forum.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Initialize Button.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickInitializeButton() {
        initialize.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickLocations1Link() {
        locations1.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickLocations2Link() {
        locations2.click();
        return this;
    }

    /**
     * Click on Log In Button.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickLogInButton() {
        logIn.click();
        return this;
    }

    /**
     * Click on Parabank Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickParabankLink() {
        parabank.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickProducts1Link() {
        products1.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickProducts2Link() {
        products2.click();
        return this;
    }

    /**
     * Click on Register Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickRegisterLink() {
        register.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickServices1Link() {
        services1.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickServices2Link() {
        services2.click();
        return this;
    }

    /**
     * Click on Shutdown Button.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickShutdownButton() {
        shutdown.click();
        return this;
    }

    /**
     * Click on Site Map Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickSiteMapLink() {
        siteMap.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickSubmitButton() {
        submit.click();
        return this;
    }

    /**
     * Click on Swagger Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickSwaggerLink() {
        swagger.click();
        return this;
    }

    /**
     * Click on Wadl Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickWadlLink() {
        wadl.click();
        return this;
    }

    /**
     * Click on Wsdl Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickWsdl1Link() {
        wsdl1.click();
        return this;
    }

    /**
     * Click on Wsdl Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickWsdl2Link() {
        wsdl2.click();
        return this;
    }

    /**
     * Click on Www.parasoft.com Link.
     *
     * @return the adminPage class instance.
     */
    public adminPage clickWwwParasoftComLink() {
        wwwParasoftCom.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the adminPage class instance.
     */
    public adminPage fill() {
        setLeaveBlankToUseDefaultEndpoint1RadioButtonField();
        setLeaveBlankToUseDefaultEndpoint2RadioButtonField();
        setLeaveBlankToUseDefaultEndpoint3RadioButtonField();
        setLeaveBlankToUseDefaultEndpoint4RadioButtonField();
        setLeaveBlankToUseDefaultEndpoint5TextField();
        setLeaveBlankToUseDefaultEndpoint6TextField();
        setLeaveBlankToUseDefaultEndpoint7TextField();
        setLeaveBlankToUseDefaultEndpoint8TextField();
        setLeaveBlankToUseDefaultEndpoint9TextField();
        setLeaveBlankToUseDefaultEndpoint10DropDownListField();
        setLeaveBlankToUseDefaultEndpoint11DropDownListField();
        setLeaveBlankToUseDefaultEndpoint12TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the adminPage class instance.
     */
    public adminPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Leave Blank To Use Default Endpoint Drop Down List field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint10DropDownListField() {
        return setLeaveBlankToUseDefaultEndpoint10DropDownListField(data.get("LEAVE_BLANK_TO_USE_DEFAULT_ENDPOINT_10"));
    }

    /**
     * Set value to Leave Blank To Use Default Endpoint Drop Down List field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint10DropDownListField(String leaveBlankToUseDefaultEndpoint10Value) {
        new Select(leaveBlankToUseDefaultEndpoint10).selectByVisibleText(leaveBlankToUseDefaultEndpoint10Value);
        return this;
    }

    /**
     * Set default value to Leave Blank To Use Default Endpoint Drop Down List field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint11DropDownListField() {
        return setLeaveBlankToUseDefaultEndpoint11DropDownListField(data.get("LEAVE_BLANK_TO_USE_DEFAULT_ENDPOINT_11"));
    }

    /**
     * Set value to Leave Blank To Use Default Endpoint Drop Down List field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint11DropDownListField(String leaveBlankToUseDefaultEndpoint11Value) {
        new Select(leaveBlankToUseDefaultEndpoint11).selectByVisibleText(leaveBlankToUseDefaultEndpoint11Value);
        return this;
    }

    /**
     * Set default value to Leave Blank To Use Default Endpoint Text field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint12TextField() {
        return setLeaveBlankToUseDefaultEndpoint12TextField(data.get("LEAVE_BLANK_TO_USE_DEFAULT_ENDPOINT_12"));
    }

    /**
     * Set value to Leave Blank To Use Default Endpoint Text field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint12TextField(String leaveBlankToUseDefaultEndpoint12Value) {
        leaveBlankToUseDefaultEndpoint12.sendKeys(leaveBlankToUseDefaultEndpoint12Value);
        return this;
    }

    /**
     * Set default value to Leave Blank To Use Default Endpoint Radio Button field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint1RadioButtonField() {
        for (WebElement el : leaveBlankToUseDefaultEndpoint1) {
            if (el.getAttribute("value").equals(leaveBlankToUseDefaultEndpoint1Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Leave Blank To Use Default Endpoint Radio Button field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint2RadioButtonField() {
        for (WebElement el : leaveBlankToUseDefaultEndpoint2) {
            if (el.getAttribute("value").equals(leaveBlankToUseDefaultEndpoint2Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Leave Blank To Use Default Endpoint Radio Button field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint3RadioButtonField() {
        for (WebElement el : leaveBlankToUseDefaultEndpoint3) {
            if (el.getAttribute("value").equals(leaveBlankToUseDefaultEndpoint3Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Leave Blank To Use Default Endpoint Radio Button field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint4RadioButtonField() {
        for (WebElement el : leaveBlankToUseDefaultEndpoint4) {
            if (el.getAttribute("value").equals(leaveBlankToUseDefaultEndpoint4Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Leave Blank To Use Default Endpoint Text field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint5TextField() {
        return setLeaveBlankToUseDefaultEndpoint5TextField(data.get("LEAVE_BLANK_TO_USE_DEFAULT_ENDPOINT_5"));
    }

    /**
     * Set value to Leave Blank To Use Default Endpoint Text field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint5TextField(String leaveBlankToUseDefaultEndpoint5Value) {
        leaveBlankToUseDefaultEndpoint5.sendKeys(leaveBlankToUseDefaultEndpoint5Value);
        return this;
    }

    /**
     * Set default value to Leave Blank To Use Default Endpoint Text field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint6TextField() {
        return setLeaveBlankToUseDefaultEndpoint6TextField(data.get("LEAVE_BLANK_TO_USE_DEFAULT_ENDPOINT_6"));
    }

    /**
     * Set value to Leave Blank To Use Default Endpoint Text field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint6TextField(String leaveBlankToUseDefaultEndpoint6Value) {
        leaveBlankToUseDefaultEndpoint6.sendKeys(leaveBlankToUseDefaultEndpoint6Value);
        return this;
    }

    /**
     * Set default value to Leave Blank To Use Default Endpoint Text field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint7TextField() {
        return setLeaveBlankToUseDefaultEndpoint7TextField(data.get("LEAVE_BLANK_TO_USE_DEFAULT_ENDPOINT_7"));
    }

    /**
     * Set value to Leave Blank To Use Default Endpoint Text field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint7TextField(String leaveBlankToUseDefaultEndpoint7Value) {
        leaveBlankToUseDefaultEndpoint7.sendKeys(leaveBlankToUseDefaultEndpoint7Value);
        return this;
    }

    /**
     * Set default value to Leave Blank To Use Default Endpoint Text field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint8TextField() {
        return setLeaveBlankToUseDefaultEndpoint8TextField(data.get("LEAVE_BLANK_TO_USE_DEFAULT_ENDPOINT_8"));
    }

    /**
     * Set value to Leave Blank To Use Default Endpoint Text field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint8TextField(String leaveBlankToUseDefaultEndpoint8Value) {
        leaveBlankToUseDefaultEndpoint8.sendKeys(leaveBlankToUseDefaultEndpoint8Value);
        return this;
    }

    /**
     * Set default value to Leave Blank To Use Default Endpoint Text field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint9TextField() {
        return setLeaveBlankToUseDefaultEndpoint9TextField(data.get("LEAVE_BLANK_TO_USE_DEFAULT_ENDPOINT_9"));
    }

    /**
     * Set value to Leave Blank To Use Default Endpoint Text field.
     *
     * @return the adminPage class instance.
     */
    public adminPage setLeaveBlankToUseDefaultEndpoint9TextField(String leaveBlankToUseDefaultEndpoint9Value) {
        leaveBlankToUseDefaultEndpoint9.sendKeys(leaveBlankToUseDefaultEndpoint9Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the adminPage class instance.
     */
    public adminPage submit() {
        clickSubmitButton();
        return this;
    }

    /**
     * Unset default value from Leave Blank To Use Default Endpoint Drop Down List field.
     *
     * @return the adminPage class instance.
     */
    public adminPage unsetLeaveBlankToUseDefaultEndpoint10DropDownListField() {
        return unsetLeaveBlankToUseDefaultEndpoint10DropDownListField(data.get("LEAVE_BLANK_TO_USE_DEFAULT_ENDPOINT_10"));
    }

    /**
     * Unset value from Leave Blank To Use Default Endpoint Drop Down List field.
     *
     * @return the adminPage class instance.
     */
    public adminPage unsetLeaveBlankToUseDefaultEndpoint10DropDownListField(String leaveBlankToUseDefaultEndpoint10Value) {
        new Select(leaveBlankToUseDefaultEndpoint10).deselectByVisibleText(leaveBlankToUseDefaultEndpoint10Value);
        return this;
    }

    /**
     * Unset default value from Leave Blank To Use Default Endpoint Drop Down List field.
     *
     * @return the adminPage class instance.
     */
    public adminPage unsetLeaveBlankToUseDefaultEndpoint11DropDownListField() {
        return unsetLeaveBlankToUseDefaultEndpoint11DropDownListField(data.get("LEAVE_BLANK_TO_USE_DEFAULT_ENDPOINT_11"));
    }

    /**
     * Unset value from Leave Blank To Use Default Endpoint Drop Down List field.
     *
     * @return the adminPage class instance.
     */
    public adminPage unsetLeaveBlankToUseDefaultEndpoint11DropDownListField(String leaveBlankToUseDefaultEndpoint11Value) {
        new Select(leaveBlankToUseDefaultEndpoint11).deselectByVisibleText(leaveBlankToUseDefaultEndpoint11Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the adminPage class instance.
     */
    public adminPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the adminPage class instance.
     */
    public adminPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
