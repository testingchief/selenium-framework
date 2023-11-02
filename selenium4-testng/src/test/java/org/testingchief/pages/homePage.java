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

public class homePage {
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

    @FindBy(css = "#rightPanel ul:nth-of-type(2) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement accountHistory;

    @FindBy(css = "a[href='admin.htm']")
    @CacheLookup
    private WebElement adminPage;

    @FindBy(css = "#rightPanel ul:nth-of-type(2) li:nth-of-type(2) a")
    @CacheLookup
    private WebElement billPay;

    @FindBy(css = "#rightPanel ul:nth-of-type(1) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement checkBalances;

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

    @FindBy(css = "input.button")
    @CacheLookup
    private WebElement logIn;

    @FindBy(css = "#rightPanel ul:nth-of-type(1) li:nth-of-type(5) a")
    @CacheLookup
    private WebElement makeDeposits;

    @FindBy(css = "a[href='news.htm#4']")
    @CacheLookup
    private WebElement newOnlineAccountTransfers;

    @FindBy(css = "a[href='news.htm#5']")
    @CacheLookup
    private WebElement newOnlineBillPay;

    private final String pageLoadedText = "ParaBank Is Now Re-Opened";

    private final String pageUrl = "/parabank/index.htm;jsessionid=C7534D0CE3885B90A99DAF04F3DAFE89";

    @FindBy(css = "#topPanel a:nth-of-type(2)")
    @CacheLookup
    private WebElement parabank;

    @FindBy(name = "username")
    @CacheLookup
    private WebElement parabankIsNowReopened1;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement parabankIsNowReopened2;

    @FindBy(css = "a[href='news.htm#6']")
    @CacheLookup
    private WebElement parabankIsNowReopened3;

    @FindBy(css = "#headerPanel ul:nth-of-type(1) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement products1;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement products2;

    @FindBy(css = "#rightPanel p:nth-of-type(1) a")
    @CacheLookup
    private WebElement readMore1;

    @FindBy(css = "a[href='news.htm']")
    @CacheLookup
    private WebElement readMore2;

    @FindBy(css = "a[href='register.htm']")
    @CacheLookup
    private WebElement register;

    @FindBy(css = "#headerPanel ul:nth-of-type(1) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement services1;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement services2;

    @FindBy(css = "a[href='/parabank/sitemap.htm']")
    @CacheLookup
    private WebElement siteMap;

    @FindBy(css = "#rightPanel ul:nth-of-type(1) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement transferFunds1;

    @FindBy(css = "#rightPanel ul:nth-of-type(2) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement transferFunds2;

    @FindBy(css = "#rightPanel ul:nth-of-type(1) li:nth-of-type(2) a")
    @CacheLookup
    private WebElement withdrawFunds;

    @FindBy(css = "a[href='http://www.parasoft.com/']")
    @CacheLookup
    private WebElement wwwParasoftCom;

    public homepage() {
    }

    public homepage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public homepage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public homepage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickAboutUs1Link() {
        aboutUs1.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickAboutUs2Link() {
        aboutUs2.click();
        return this;
    }

    /**
     * Click on Account History Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickAccountHistoryLink() {
        accountHistory.click();
        return this;
    }

    /**
     * Click on Admin Page Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickAdminPageLink() {
        adminPage.click();
        return this;
    }

    /**
     * Click on Bill Pay Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickBillPayLink() {
        billPay.click();
        return this;
    }

    /**
     * Click on Check Balances Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickCheckBalancesLink() {
        checkBalances.click();
        return this;
    }

    /**
     * Click on Clear Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickClearLink() {
        clear.click();
        return this;
    }

    /**
     * Click on Contact Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickContactLink() {
        contact.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Forgot Login Info Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickForgotLoginInfoLink() {
        forgotLoginInfo.click();
        return this;
    }

    /**
     * Click on Forum Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickForumLink() {
        forum.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickLocations1Link() {
        locations1.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickLocations2Link() {
        locations2.click();
        return this;
    }

    /**
     * Click on Log In Button.
     *
     * @return the homepage class instance.
     */
    public homepage clickLogInButton() {
        logIn.click();
        return this;
    }

    /**
     * Click on Make Deposits Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickMakeDepositsLink() {
        makeDeposits.click();
        return this;
    }

    /**
     * Click on New Online Account Transfers Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickNewOnlineAccountTransfersLink() {
        newOnlineAccountTransfers.click();
        return this;
    }

    /**
     * Click on New Online Bill Pay Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickNewOnlineBillPayLink() {
        newOnlineBillPay.click();
        return this;
    }

    /**
     * Click on Parabank Is Now Reopened Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickParabankIsNowReopened3Link() {
        parabankIsNowReopened3.click();
        return this;
    }

    /**
     * Click on Parabank Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickParabankLink() {
        parabank.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickProducts1Link() {
        products1.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickProducts2Link() {
        products2.click();
        return this;
    }

    /**
     * Click on Read More Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickReadMore1Link() {
        readMore1.click();
        return this;
    }

    /**
     * Click on Read More Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickReadMore2Link() {
        readMore2.click();
        return this;
    }

    /**
     * Click on Register Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickRegisterLink() {
        register.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickServices1Link() {
        services1.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickServices2Link() {
        services2.click();
        return this;
    }

    /**
     * Click on Site Map Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickSiteMapLink() {
        siteMap.click();
        return this;
    }

    /**
     * Click on Transfer Funds Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickTransferFunds1Link() {
        transferFunds1.click();
        return this;
    }

    /**
     * Click on Transfer Funds Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickTransferFunds2Link() {
        transferFunds2.click();
        return this;
    }

    /**
     * Click on Withdraw Funds Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickWithdrawFundsLink() {
        withdrawFunds.click();
        return this;
    }

    /**
     * Click on Www.parasoft.com Link.
     *
     * @return the homepage class instance.
     */
    public homepage clickWwwParasoftComLink() {
        wwwParasoftCom.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the homepage class instance.
     */
    public homepage fill() {
        setParabankIsNowReopened1PasswordField();
        setParabankIsNowReopened2PasswordField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the homepage class instance.
     */
    public homepage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Parabank Is Now Reopened Password field.
     *
     * @return the homepage class instance.
     */
    public homepage setParabankIsNowReopened1PasswordField() {
        return setParabankIsNowReopened1PasswordField(data.get("PARABANK_IS_NOW_REOPENED_1"));
    }

    /**
     * Set value to Parabank Is Now Reopened Password field.
     *
     * @return the homepage class instance.
     */
    public homepage setParabankIsNowReopened1PasswordField(String parabankIsNowReopened1Value) {
        parabankIsNowReopened1.sendKeys(parabankIsNowReopened1Value);
        return this;
    }

    /**
     * Set default value to Parabank Is Now Reopened Password field.
     *
     * @return the homepage class instance.
     */
    public homepage setParabankIsNowReopened2PasswordField() {
        return setParabankIsNowReopened2PasswordField(data.get("PARABANK_IS_NOW_REOPENED_2"));
    }

    /**
     * Set value to Parabank Is Now Reopened Password field.
     *
     * @return the homepage class instance.
     */
    public homepage setParabankIsNowReopened2PasswordField(String parabankIsNowReopened2Value) {
        parabankIsNowReopened2.sendKeys(parabankIsNowReopened2Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the homepage class instance.
     */
    public homepage submit() {
        clickLogInButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the homepage class instance.
     */
    public homepage verifyPageLoaded() {
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
     * @return the homepage class instance.
     */
    public homepage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
