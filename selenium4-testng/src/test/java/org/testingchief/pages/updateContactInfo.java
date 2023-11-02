package org.testingchief.pages;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class updateContactInfo {
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
    private WebElement openNewAccount;

    private final String pageLoadedText = "";

    private final String pageUrl = "/parabank/updateprofile.htm";

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

    @FindBy(css = "input.button")
    @CacheLookup
    private WebElement updateProfile;

    @FindBy(css = "a[href='http://www.parasoft.com/']")
    @CacheLookup
    private WebElement wwwParasoftCom;

    public updateContactInfo() {
    }

    public updateContactInfo(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public updateContactInfo(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public updateContactInfo(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickAboutUs1Link() {
        aboutUs1.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickAboutUs2Link() {
        aboutUs2.click();
        return this;
    }

    /**
     * Click on Accounts Overview Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickAccountsOverviewLink() {
        accountsOverview.click();
        return this;
    }

    /**
     * Click on Admin Page Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickAdminPageLink() {
        adminPage.click();
        return this;
    }

    /**
     * Click on Bill Pay Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickBillPayLink() {
        billPay.click();
        return this;
    }

    /**
     * Click on Clear Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickClearLink() {
        clear.click();
        return this;
    }

    /**
     * Click on Contact Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickContactLink() {
        contact.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Find Transactions Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickFindTransactionsLink() {
        findTransactions.click();
        return this;
    }

    /**
     * Click on Forum Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickForumLink() {
        forum.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickLocations1Link() {
        locations1.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickLocations2Link() {
        locations2.click();
        return this;
    }

    /**
     * Click on Log Out Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickLogOutLink() {
        logOut.click();
        return this;
    }

    /**
     * Click on Open New Account Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickOpenNewAccountLink() {
        openNewAccount.click();
        return this;
    }

    /**
     * Click on Parabank Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickParabankLink() {
        parabank.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickProducts1Link() {
        products1.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickProducts2Link() {
        products2.click();
        return this;
    }

    /**
     * Click on Request Loan Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickRequestLoanLink() {
        requestLoan.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickServices1Link() {
        services1.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickServices2Link() {
        services2.click();
        return this;
    }

    /**
     * Click on Site Map Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickSiteMapLink() {
        siteMap.click();
        return this;
    }

    /**
     * Click on Transfer Funds Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickTransferFundsLink() {
        transferFunds.click();
        return this;
    }

    /**
     * Click on Update Contact Info Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickUpdateContactInfoLink() {
        updateContactInfo.click();
        return this;
    }

    /**
     * Click on Update Profile Button.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickUpdateProfileButton() {
        updateProfile.click();
        return this;
    }

    /**
     * Click on Www.parasoft.com Link.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo clickWwwParasoftComLink() {
        wwwParasoftCom.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo submit() {
        clickUpdateProfileButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo verifyPageLoaded() {
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
     * @return the updateContactInfo class instance.
     */
    public updateContactInfo verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
