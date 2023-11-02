package org.testingchief.pages;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class openNewAccount {
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

    @FindBy(css = "a[href='/parabank/overview.htm']")
    @CacheLookup
    private WebElement accountsOverview;

    @FindBy(css = "a[href='admin.htm']")
    @CacheLookup
    private WebElement adminPage;

    @FindBy(css = "a[href='/parabank/billpay.htm']")
    @CacheLookup
    private WebElement billPay;

    @FindBy(css = "a[href='/parabank/admin.htm']")
    @CacheLookup
    private WebElement clear;

    @FindBy(css = "#headerPanel ul:nth-of-type(2) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement contact;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(8) a")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "a[href='/parabank/findtrans.htm']")
    @CacheLookup
    private WebElement findTransactions;

    @FindBy(css = "a[href='http://forums.parasoft.com/']")
    @CacheLookup
    private WebElement forum;

    @FindBy(css = "#headerPanel ul:nth-of-type(2) li:nth-of-type(1) a")
    @CacheLookup
    private WebElement home;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(1) a")
    @CacheLookup
    private WebElement home;

    @FindBy(css = "#headerPanel ul:nth-of-type(1) li:nth-of-type(5) a")
    @CacheLookup
    private WebElement locations1;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(5) a")
    @CacheLookup
    private WebElement locations2;

    @FindBy(css = "a[href='/parabank/logout.htm']")
    @CacheLookup
    private WebElement logOut;

    @FindBy(css = "a[href='/parabank/openaccount.htm']")
    @CacheLookup
    private WebElement openNewAccount1;

    @FindBy(css = "input.button")
    @CacheLookup
    private WebElement openNewAccount2;

    private final String pageLoadedText = "00 must be deposited into this account at time of opening";

    private final String pageUrl = "/parabank/openaccount.htm";

    @FindBy(css = "#topPanel a:nth-of-type(2)")
    @CacheLookup
    private WebElement parabank;

    @FindBy(css = "#headerPanel ul:nth-of-type(1) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement products1;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement products2;

    @FindBy(css = "a[href='/parabank/requestloan.htm']")
    @CacheLookup
    private WebElement requestLoan;

    @FindBy(css = "#headerPanel ul:nth-of-type(1) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement services1;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement services2;

    @FindBy(css = "a[href='/parabank/sitemap.htm']")
    @CacheLookup
    private WebElement siteMap;

    @FindBy(css = "a[href='/parabank/transfer.htm']")
    @CacheLookup
    private WebElement transferFunds;

    @FindBy(css = "a[href='/parabank/updateprofile.htm']")
    @CacheLookup
    private WebElement updateContactInfo;

    @FindBy(id = "type")
    @CacheLookup
    private WebElement whatTypeOfAccountWouldYou1;

    @FindBy(id = "fromAccountId")
    @CacheLookup
    private WebElement whatTypeOfAccountWouldYou2;

    @FindBy(css = "a[href='http://www.parasoft.com/']")
    @CacheLookup
    private WebElement wwwParasoftCom;

    public openNewAccount() {
    }

    public openNewAccount(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public openNewAccount(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public openNewAccount(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickAboutUs1Link() {
        aboutUs1.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickAboutUs2Link() {
        aboutUs2.click();
        return this;
    }

    /**
     * Click on Accounts Overview Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickAccountsOverviewLink() {
        accountsOverview.click();
        return this;
    }

    /**
     * Click on Admin Page Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickAdminPageLink() {
        adminPage.click();
        return this;
    }

    /**
     * Click on Bill Pay Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickBillPayLink() {
        billPay.click();
        return this;
    }

    /**
     * Click on Clear Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickClearLink() {
        clear.click();
        return this;
    }

    /**
     * Click on Contact Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickContactLink() {
        contact.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Find Transactions Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickFindTransactionsLink() {
        findTransactions.click();
        return this;
    }

    /**
     * Click on Forum Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickForumLink() {
        forum.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickLocations1Link() {
        locations1.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickLocations2Link() {
        locations2.click();
        return this;
    }

    /**
     * Click on Log Out Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickLogOutLink() {
        logOut.click();
        return this;
    }

    /**
     * Click on Open New Account Button.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickOpenNewAccount1Button() {
        openNewAccount1.click();
        return this;
    }

    /**
     * Click on Open New Account Button.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickOpenNewAccount2Button() {
        openNewAccount2.click();
        return this;
    }

    /**
     * Click on Parabank Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickParabankLink() {
        parabank.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickProducts1Link() {
        products1.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickProducts2Link() {
        products2.click();
        return this;
    }

    /**
     * Click on Request Loan Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickRequestLoanLink() {
        requestLoan.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickServices1Link() {
        services1.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickServices2Link() {
        services2.click();
        return this;
    }

    /**
     * Click on Site Map Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickSiteMapLink() {
        siteMap.click();
        return this;
    }

    /**
     * Click on Transfer Funds Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickTransferFundsLink() {
        transferFunds.click();
        return this;
    }

    /**
     * Click on Update Contact Info Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickUpdateContactInfoLink() {
        updateContactInfo.click();
        return this;
    }

    /**
     * Click on Www.parasoft.com Link.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount clickWwwParasoftComLink() {
        wwwParasoftCom.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount fill() {
        setWhatTypeOfAccountWouldYou1DropDownListField();
        setWhatTypeOfAccountWouldYou2DropDownListField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to What Type Of Account Would You Like To Open Drop Down List field.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount setWhatTypeOfAccountWouldYou1DropDownListField() {
        return setWhatTypeOfAccountWouldYou1DropDownListField(data.get("WHAT_TYPE_OF_ACCOUNT_WOULD_YOU_1"));
    }

    /**
     * Set value to What Type Of Account Would You Like To Open Drop Down List field.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount setWhatTypeOfAccountWouldYou1DropDownListField(String whatTypeOfAccountWouldYou1Value) {
        new Select(whatTypeOfAccountWouldYou1).selectByVisibleText(whatTypeOfAccountWouldYou1Value);
        return this;
    }

    /**
     * Set default value to What Type Of Account Would You Like To Open Drop Down List field.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount setWhatTypeOfAccountWouldYou2DropDownListField() {
        return setWhatTypeOfAccountWouldYou2DropDownListField(data.get("WHAT_TYPE_OF_ACCOUNT_WOULD_YOU_2"));
    }

    /**
     * Set value to What Type Of Account Would You Like To Open Drop Down List field.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount setWhatTypeOfAccountWouldYou2DropDownListField(String whatTypeOfAccountWouldYou2Value) {
        new Select(whatTypeOfAccountWouldYou2).selectByVisibleText(whatTypeOfAccountWouldYou2Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount submit() {
        clickOpenNewAccountButton();
        return this;
    }

    /**
     * Unset default value from What Type Of Account Would You Like To Open Drop Down List field.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount unsetWhatTypeOfAccountWouldYou1DropDownListField() {
        return unsetWhatTypeOfAccountWouldYou1DropDownListField(data.get("WHAT_TYPE_OF_ACCOUNT_WOULD_YOU_1"));
    }

    /**
     * Unset value from What Type Of Account Would You Like To Open Drop Down List field.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount unsetWhatTypeOfAccountWouldYou1DropDownListField(String whatTypeOfAccountWouldYou1Value) {
        new Select(whatTypeOfAccountWouldYou1).deselectByVisibleText(whatTypeOfAccountWouldYou1Value);
        return this;
    }

    /**
     * Unset default value from What Type Of Account Would You Like To Open Drop Down List field.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount unsetWhatTypeOfAccountWouldYou2DropDownListField() {
        return unsetWhatTypeOfAccountWouldYou2DropDownListField(data.get("WHAT_TYPE_OF_ACCOUNT_WOULD_YOU_2"));
    }

    /**
     * Unset value from What Type Of Account Would You Like To Open Drop Down List field.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount unsetWhatTypeOfAccountWouldYou2DropDownListField(String whatTypeOfAccountWouldYou2Value) {
        new Select(whatTypeOfAccountWouldYou2).deselectByVisibleText(whatTypeOfAccountWouldYou2Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the openNewAccount class instance.
     */
    public openNewAccount verifyPageLoaded() {
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
     * @return the openNewAccount class instance.
     */
    public openNewAccount verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
