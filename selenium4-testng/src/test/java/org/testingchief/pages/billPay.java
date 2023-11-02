package org.testingchief.pages;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class billPay {
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

    private final String pageUrl = "/parabank/billpay.htm";

    @FindBy(css = "#topPanel a:nth-of-type(2)")
    @CacheLookup
    private WebElement parabank;

    @FindBy(name = "payee.name")
    @CacheLookup
    private WebElement pleaseEnterAValidNumber1;

    @FindBy(name = "payee.address.street")
    @CacheLookup
    private WebElement pleaseEnterAValidNumber2;

    @FindBy(name = "payee.address.city")
    @CacheLookup
    private WebElement pleaseEnterAValidNumber3;

    @FindBy(name = "payee.address.state")
    @CacheLookup
    private WebElement pleaseEnterAValidNumber4;

    @FindBy(name = "payee.address.zipCode")
    @CacheLookup
    private WebElement pleaseEnterAValidNumber5;

    @FindBy(id = "3afeeb19-268e-47b4-b6a9-9e8b40cc0dc9")
    @CacheLookup
    private WebElement pleaseEnterAValidNumber6;

    @FindBy(name = "payee.accountNumber")
    @CacheLookup
    private WebElement pleaseEnterAValidNumber7;

    @FindBy(name = "verifyAccount")
    @CacheLookup
    private WebElement pleaseEnterAValidNumber8;

    @FindBy(name = "fromAccountId")
    @CacheLookup
    private WebElement pleaseEnterAValidNumber9;

    @FindBy(css = "#headerPanel ul:nth-of-type(1) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement products1;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement products2;

    @FindBy(css = "a[href='/parabank/requestloan.htm']")
    @CacheLookup
    private WebElement requestLoan;

    @FindBy(css = "input.button")
    @CacheLookup
    private WebElement sendPayment;

    @FindBy(css = "#headerPanel ul:nth-of-type(1) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement services1;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement services2;

    @FindBy(css = "a[href='/parabank/sitemap.htm']")
    @CacheLookup
    private WebElement siteMap;

    @FindBy(name = "amount")
    @CacheLookup
    private WebElement theAmountCannotBeEmpty;

    @FindBy(css = "a[href='/parabank/transfer.htm']")
    @CacheLookup
    private WebElement transferFunds;

    @FindBy(css = "a[href='/parabank/updateprofile.htm']")
    @CacheLookup
    private WebElement updateContactInfo;

    @FindBy(css = "a[href='http://www.parasoft.com/']")
    @CacheLookup
    private WebElement wwwParasoftCom;

    public billPay() {
    }

    public billPay(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public billPay(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public billPay(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickAboutUs1Link() {
        aboutUs1.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickAboutUs2Link() {
        aboutUs2.click();
        return this;
    }

    /**
     * Click on Accounts Overview Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickAccountsOverviewLink() {
        accountsOverview.click();
        return this;
    }

    /**
     * Click on Admin Page Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickAdminPageLink() {
        adminPage.click();
        return this;
    }

    /**
     * Click on Bill Pay Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickBillPayLink() {
        billPay.click();
        return this;
    }

    /**
     * Click on Clear Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickClearLink() {
        clear.click();
        return this;
    }

    /**
     * Click on Contact Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickContactLink() {
        contact.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Find Transactions Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickFindTransactionsLink() {
        findTransactions.click();
        return this;
    }

    /**
     * Click on Forum Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickForumLink() {
        forum.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickLocations1Link() {
        locations1.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickLocations2Link() {
        locations2.click();
        return this;
    }

    /**
     * Click on Log Out Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickLogOutLink() {
        logOut.click();
        return this;
    }

    /**
     * Click on Open New Account Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickOpenNewAccountLink() {
        openNewAccount.click();
        return this;
    }

    /**
     * Click on Parabank Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickParabankLink() {
        parabank.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickProducts1Link() {
        products1.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickProducts2Link() {
        products2.click();
        return this;
    }

    /**
     * Click on Request Loan Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickRequestLoanLink() {
        requestLoan.click();
        return this;
    }

    /**
     * Click on Send Payment Button.
     *
     * @return the billPay class instance.
     */
    public billPay clickSendPaymentButton() {
        sendPayment.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickServices1Link() {
        services1.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickServices2Link() {
        services2.click();
        return this;
    }

    /**
     * Click on Site Map Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickSiteMapLink() {
        siteMap.click();
        return this;
    }

    /**
     * Click on Transfer Funds Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickTransferFundsLink() {
        transferFunds.click();
        return this;
    }

    /**
     * Click on Update Contact Info Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickUpdateContactInfoLink() {
        updateContactInfo.click();
        return this;
    }

    /**
     * Click on Www.parasoft.com Link.
     *
     * @return the billPay class instance.
     */
    public billPay clickWwwParasoftComLink() {
        wwwParasoftCom.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the billPay class instance.
     */
    public billPay fill() {
        setPleaseEnterAValidNumber1TextField();
        setPleaseEnterAValidNumber2TextField();
        setPleaseEnterAValidNumber3TextField();
        setPleaseEnterAValidNumber4TextField();
        setPleaseEnterAValidNumber5TextField();
        setPleaseEnterAValidNumber6TextField();
        setPleaseEnterAValidNumber7TextField();
        setPleaseEnterAValidNumber8TextField();
        setTheAmountCannotBeEmptyTextField();
        setPleaseEnterAValidNumber9DropDownListField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the billPay class instance.
     */
    public billPay fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Please Enter A Valid Number Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber1TextField() {
        return setPleaseEnterAValidNumber1TextField(data.get("PLEASE_ENTER_A_VALID_NUMBER_1"));
    }

    /**
     * Set value to Please Enter A Valid Number Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber1TextField(String pleaseEnterAValidNumber1Value) {
        pleaseEnterAValidNumber1.sendKeys(pleaseEnterAValidNumber1Value);
        return this;
    }

    /**
     * Set default value to Please Enter A Valid Number Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber2TextField() {
        return setPleaseEnterAValidNumber2TextField(data.get("PLEASE_ENTER_A_VALID_NUMBER_2"));
    }

    /**
     * Set value to Please Enter A Valid Number Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber2TextField(String pleaseEnterAValidNumber2Value) {
        pleaseEnterAValidNumber2.sendKeys(pleaseEnterAValidNumber2Value);
        return this;
    }

    /**
     * Set default value to Please Enter A Valid Number Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber3TextField() {
        return setPleaseEnterAValidNumber3TextField(data.get("PLEASE_ENTER_A_VALID_NUMBER_3"));
    }

    /**
     * Set value to Please Enter A Valid Number Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber3TextField(String pleaseEnterAValidNumber3Value) {
        pleaseEnterAValidNumber3.sendKeys(pleaseEnterAValidNumber3Value);
        return this;
    }

    /**
     * Set default value to Please Enter A Valid Number Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber4TextField() {
        return setPleaseEnterAValidNumber4TextField(data.get("PLEASE_ENTER_A_VALID_NUMBER_4"));
    }

    /**
     * Set value to Please Enter A Valid Number Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber4TextField(String pleaseEnterAValidNumber4Value) {
        pleaseEnterAValidNumber4.sendKeys(pleaseEnterAValidNumber4Value);
        return this;
    }

    /**
     * Set default value to Please Enter A Valid Number Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber5TextField() {
        return setPleaseEnterAValidNumber5TextField(data.get("PLEASE_ENTER_A_VALID_NUMBER_5"));
    }

    /**
     * Set value to Please Enter A Valid Number Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber5TextField(String pleaseEnterAValidNumber5Value) {
        pleaseEnterAValidNumber5.sendKeys(pleaseEnterAValidNumber5Value);
        return this;
    }

    /**
     * Set default value to Please Enter A Valid Number Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber6TextField() {
        return setPleaseEnterAValidNumber6TextField(data.get("PLEASE_ENTER_A_VALID_NUMBER_6"));
    }

    /**
     * Set value to Please Enter A Valid Number Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber6TextField(String pleaseEnterAValidNumber6Value) {
        pleaseEnterAValidNumber6.sendKeys(pleaseEnterAValidNumber6Value);
        return this;
    }

    /**
     * Set default value to Please Enter A Valid Number Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber7TextField() {
        return setPleaseEnterAValidNumber7TextField(data.get("PLEASE_ENTER_A_VALID_NUMBER_7"));
    }

    /**
     * Set value to Please Enter A Valid Number Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber7TextField(String pleaseEnterAValidNumber7Value) {
        pleaseEnterAValidNumber7.sendKeys(pleaseEnterAValidNumber7Value);
        return this;
    }

    /**
     * Set default value to Please Enter A Valid Number Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber8TextField() {
        return setPleaseEnterAValidNumber8TextField(data.get("PLEASE_ENTER_A_VALID_NUMBER_8"));
    }

    /**
     * Set value to Please Enter A Valid Number Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber8TextField(String pleaseEnterAValidNumber8Value) {
        pleaseEnterAValidNumber8.sendKeys(pleaseEnterAValidNumber8Value);
        return this;
    }

    /**
     * Set default value to Please Enter A Valid Number Drop Down List field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber9DropDownListField() {
        return setPleaseEnterAValidNumber9DropDownListField(data.get("PLEASE_ENTER_A_VALID_NUMBER_9"));
    }

    /**
     * Set value to Please Enter A Valid Number Drop Down List field.
     *
     * @return the billPay class instance.
     */
    public billPay setPleaseEnterAValidNumber9DropDownListField(String pleaseEnterAValidNumber9Value) {
        new Select(pleaseEnterAValidNumber9).selectByVisibleText(pleaseEnterAValidNumber9Value);
        return this;
    }

    /**
     * Set default value to The Amount Cannot Be Empty Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setTheAmountCannotBeEmptyTextField() {
        return setTheAmountCannotBeEmptyTextField(data.get("THE_AMOUNT_CANNOT_BE_EMPTY"));
    }

    /**
     * Set value to The Amount Cannot Be Empty Text field.
     *
     * @return the billPay class instance.
     */
    public billPay setTheAmountCannotBeEmptyTextField(String theAmountCannotBeEmptyValue) {
        theAmountCannotBeEmpty.sendKeys(theAmountCannotBeEmptyValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the billPay class instance.
     */
    public billPay submit() {
        clickSendPaymentButton();
        return this;
    }

    /**
     * Unset default value from Please Enter A Valid Number Drop Down List field.
     *
     * @return the billPay class instance.
     */
    public billPay unsetPleaseEnterAValidNumber9DropDownListField() {
        return unsetPleaseEnterAValidNumber9DropDownListField(data.get("PLEASE_ENTER_A_VALID_NUMBER_9"));
    }

    /**
     * Unset value from Please Enter A Valid Number Drop Down List field.
     *
     * @return the billPay class instance.
     */
    public billPay unsetPleaseEnterAValidNumber9DropDownListField(String pleaseEnterAValidNumber9Value) {
        new Select(pleaseEnterAValidNumber9).deselectByVisibleText(pleaseEnterAValidNumber9Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the billPay class instance.
     */
    public billPay verifyPageLoaded() {
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
     * @return the billPay class instance.
     */
    public billPay verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
