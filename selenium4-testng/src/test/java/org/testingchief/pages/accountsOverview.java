package org.testingchief.pages;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class accountsOverview {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='activity.htm?id=12345']")
    @CacheLookup
    private WebElement _12345;

    @FindBy(css = "a[href='activity.htm?id=12456']")
    @CacheLookup
    private WebElement _12456;

    @FindBy(css = "a[href='activity.htm?id=12567']")
    @CacheLookup
    private WebElement _12567;

    @FindBy(css = "a[href='activity.htm?id=12678']")
    @CacheLookup
    private WebElement _12678;

    @FindBy(css = "a[href='activity.htm?id=12789']")
    @CacheLookup
    private WebElement _12789;

    @FindBy(css = "a[href='activity.htm?id=12900']")
    @CacheLookup
    private WebElement _12900;

    @FindBy(css = "a[href='activity.htm?id=13011']")
    @CacheLookup
    private WebElement _13011;

    @FindBy(css = "a[href='activity.htm?id=13122']")
    @CacheLookup
    private WebElement _13122;

    @FindBy(css = "a[href='activity.htm?id=13233']")
    @CacheLookup
    private WebElement _13233;

    @FindBy(css = "a[href='activity.htm?id=13344']")
    @CacheLookup
    private WebElement _13344;

    @FindBy(css = "a[href='activity.htm?id=54321']")
    @CacheLookup
    private WebElement _54321;

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
    private WebElement home1;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(1) a")
    @CacheLookup
    private WebElement home2;

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
    private WebElement openNewAccount;

    private final String pageLoadedText = "*Balance includes deposits that may be subject to holds";

    private final String pageUrl = "/parabank/overview.htm";

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

    @FindBy(css = "a[href='http://www.parasoft.com/']")
    @CacheLookup
    private WebElement wwwParasoftCom;

    public accountsOverview() {
    }

    public accountsOverview(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public accountsOverview(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public accountsOverview(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickAboutUs1Link() {
        aboutUs1.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickAboutUs2Link() {
        aboutUs2.click();
        return this;
    }

    /**
     * Click on Accounts Overview Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickAccountsOverviewLink() {
        accountsOverview.click();
        return this;
    }

    /**
     * Click on Admin Page Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickAdminPageLink() {
        adminPage.click();
        return this;
    }

    /**
     * Click on Bill Pay Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickBillPayLink() {
        billPay.click();
        return this;
    }

    /**
     * Click on Clear Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickClearLink() {
        clear.click();
        return this;
    }

    /**
     * Click on Contact Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickContactLink() {
        contact.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Find Transactions Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickFindTransactionsLink() {
        findTransactions.click();
        return this;
    }

    /**
     * Click on Forum Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickForumLink() {
        forum.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickHome1Link() {
        home1.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickHome2Link() {
        home2.click();
        return this;
    }

    /**
     * Click on 12345 Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickLink12345() {
        _12345.click();
        return this;
    }

    /**
     * Click on 12456 Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickLink12456() {
        _12456.click();
        return this;
    }

    /**
     * Click on 12567 Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickLink12567() {
        _12567.click();
        return this;
    }

    /**
     * Click on 12678 Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickLink12678() {
        _12678.click();
        return this;
    }

    /**
     * Click on 12789 Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickLink12789() {
        _12789.click();
        return this;
    }

    /**
     * Click on 12900 Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickLink12900() {
        _12900.click();
        return this;
    }

    /**
     * Click on 13011 Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickLink13011() {
        _13011.click();
        return this;
    }

    /**
     * Click on 13122 Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickLink13122() {
        _13122.click();
        return this;
    }

    /**
     * Click on 13233 Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickLink13233() {
        _13233.click();
        return this;
    }

    /**
     * Click on 13344 Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickLink13344() {
        _13344.click();
        return this;
    }

    /**
     * Click on 54321 Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickLink54321() {
        _54321.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickLocations1Link() {
        locations1.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickLocations2Link() {
        locations2.click();
        return this;
    }

    /**
     * Click on Log Out Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickLogOutLink() {
        logOut.click();
        return this;
    }

    /**
     * Click on Open New Account Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickOpenNewAccountLink() {
        openNewAccount.click();
        return this;
    }

    /**
     * Click on Parabank Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickParabankLink() {
        parabank.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickProducts1Link() {
        products1.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickProducts2Link() {
        products2.click();
        return this;
    }

    /**
     * Click on Request Loan Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickRequestLoanLink() {
        requestLoan.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickServices1Link() {
        services1.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickServices2Link() {
        services2.click();
        return this;
    }

    /**
     * Click on Site Map Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickSiteMapLink() {
        siteMap.click();
        return this;
    }

    /**
     * Click on Transfer Funds Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickTransferFundsLink() {
        transferFunds.click();
        return this;
    }

    /**
     * Click on Update Contact Info Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickUpdateContactInfoLink() {
        updateContactInfo.click();
        return this;
    }

    /**
     * Click on Www.parasoft.com Link.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview clickWwwParasoftComLink() {
        wwwParasoftCom.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the accountsOverview class instance.
     */
    public accountsOverview verifyPageLoaded() {
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
     * @return the accountsOverview class instance.
     */
    public accountsOverview verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
