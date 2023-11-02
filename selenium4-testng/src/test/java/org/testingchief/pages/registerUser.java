package org.testingchief.pages;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerUser {
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

    @FindBy(name = "username")
    @CacheLookup
    private WebElement ifYouHaveAnAccountWith1;

    @FindBy(id = "customer.ssn")
    @CacheLookup
    private WebElement ifYouHaveAnAccountWith10;

    @FindBy(id = "customer.username")
    @CacheLookup
    private WebElement ifYouHaveAnAccountWith11;

    @FindBy(id = "customer.password")
    @CacheLookup
    private WebElement ifYouHaveAnAccountWith12;

    @FindBy(id = "repeatedPassword")
    @CacheLookup
    private WebElement ifYouHaveAnAccountWith13;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement ifYouHaveAnAccountWith2;

    @FindBy(id = "customer.firstName")
    @CacheLookup
    private WebElement ifYouHaveAnAccountWith3;

    @FindBy(id = "customer.lastName")
    @CacheLookup
    private WebElement ifYouHaveAnAccountWith4;

    @FindBy(id = "customer.address.street")
    @CacheLookup
    private WebElement ifYouHaveAnAccountWith5;

    @FindBy(id = "customer.address.city")
    @CacheLookup
    private WebElement ifYouHaveAnAccountWith6;

    @FindBy(id = "customer.address.state")
    @CacheLookup
    private WebElement ifYouHaveAnAccountWith7;

    @FindBy(id = "customer.address.zipCode")
    @CacheLookup
    private WebElement ifYouHaveAnAccountWith8;

    @FindBy(id = "customer.phoneNumber")
    @CacheLookup
    private WebElement ifYouHaveAnAccountWith9;

    @FindBy(css = "#headerPanel ul:nth-of-type(1) li:nth-of-type(5) a")
    @CacheLookup
    private WebElement locations1;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(5) a")
    @CacheLookup
    private WebElement locations2;

    @FindBy(css = "#loginPanel form div:nth-of-type(3) input.button[type='submit']")
    @CacheLookup
    private WebElement logIn;

    private final String pageLoadedText = "If you have an account with us you can sign-up for free instant online access";

    private final String pageUrl = "/parabank/register.htm";

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
    private WebElement register1;

    @FindBy(css = "#customerForm table.form2 tbody tr:nth-of-type(13) td:nth-of-type(2) input.button[type='submit']")
    @CacheLookup
    private WebElement register2;

    @FindBy(css = "#headerPanel ul:nth-of-type(1) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement services1;

    @FindBy(css = "#footerPanel ul:nth-of-type(1) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement services2;

    @FindBy(css = "a[href='/parabank/sitemap.htm']")
    @CacheLookup
    private WebElement siteMap;

    @FindBy(css = "a[href='http://www.parasoft.com/']")
    @CacheLookup
    private WebElement wwwParasoftCom;

    public registerUser() {
    }

    public registerUser(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public registerUser(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public registerUser(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickAboutUs1Link() {
        aboutUs1.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickAboutUs2Link() {
        aboutUs2.click();
        return this;
    }

    /**
     * Click on Admin Page Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickAdminPageLink() {
        adminPage.click();
        return this;
    }

    /**
     * Click on Clear Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickClearLink() {
        clear.click();
        return this;
    }

    /**
     * Click on Contact Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickContactLink() {
        contact.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Forgot Login Info Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickForgotLoginInfoLink() {
        forgotLoginInfo.click();
        return this;
    }

    /**
     * Click on Forum Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickForumLink() {
        forum.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickLocations1Link() {
        locations1.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickLocations2Link() {
        locations2.click();
        return this;
    }

    /**
     * Click on Log In Button.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickLogInButton() {
        logIn.click();
        return this;
    }

    /**
     * Click on Parabank Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickParabankLink() {
        parabank.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickProducts1Link() {
        products1.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickProducts2Link() {
        products2.click();
        return this;
    }

    /**
     * Click on Register Button.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickRegister1Button() {
        register1.click();
        return this;
    }

    /**
     * Click on Register Button.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickRegister2Button() {
        register2.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickServices1Link() {
        services1.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickServices2Link() {
        services2.click();
        return this;
    }

    /**
     * Click on Site Map Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickSiteMapLink() {
        siteMap.click();
        return this;
    }

    /**
     * Click on Www.parasoft.com Link.
     *
     * @return the registerUser class instance.
     */
    public registerUser clickWwwParasoftComLink() {
        wwwParasoftCom.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the registerUser class instance.
     */
    public registerUser fill() {
        setIfYouHaveAnAccountWith1PasswordField();
        setIfYouHaveAnAccountWith2PasswordField();
        setIfYouHaveAnAccountWith3TextField();
        setIfYouHaveAnAccountWith4TextField();
        setIfYouHaveAnAccountWith5TextField();
        setIfYouHaveAnAccountWith6TextField();
        setIfYouHaveAnAccountWith7TextField();
        setIfYouHaveAnAccountWith8TextField();
        setIfYouHaveAnAccountWith9TextField();
        setIfYouHaveAnAccountWith10TextField();
        setIfYouHaveAnAccountWith11TextField();
        setIfYouHaveAnAccountWith12PasswordField();
        setIfYouHaveAnAccountWith13PasswordField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the registerUser class instance.
     */
    public registerUser fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith10TextField() {
        return setIfYouHaveAnAccountWith10TextField(data.get("IF_YOU_HAVE_AN_ACCOUNT_WITH_10"));
    }

    /**
     * Set value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith10TextField(String ifYouHaveAnAccountWith10Value) {
        ifYouHaveAnAccountWith10.sendKeys(ifYouHaveAnAccountWith10Value);
        return this;
    }

    /**
     * Set default value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith11TextField() {
        return setIfYouHaveAnAccountWith11TextField(data.get("IF_YOU_HAVE_AN_ACCOUNT_WITH_11"));
    }

    /**
     * Set value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith11TextField(String ifYouHaveAnAccountWith11Value) {
        ifYouHaveAnAccountWith11.sendKeys(ifYouHaveAnAccountWith11Value);
        return this;
    }

    /**
     * Set default value to If You Have An Account With Us You Can Signup For Free Instant Online Access Password field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith12PasswordField() {
        return setIfYouHaveAnAccountWith12PasswordField(data.get("IF_YOU_HAVE_AN_ACCOUNT_WITH_12"));
    }

    /**
     * Set value to If You Have An Account With Us You Can Signup For Free Instant Online Access Password field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith12PasswordField(String ifYouHaveAnAccountWith12Value) {
        ifYouHaveAnAccountWith12.sendKeys(ifYouHaveAnAccountWith12Value);
        return this;
    }

    /**
     * Set default value to If You Have An Account With Us You Can Signup For Free Instant Online Access Password field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith13PasswordField() {
        return setIfYouHaveAnAccountWith13PasswordField(data.get("IF_YOU_HAVE_AN_ACCOUNT_WITH_13"));
    }

    /**
     * Set value to If You Have An Account With Us You Can Signup For Free Instant Online Access Password field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith13PasswordField(String ifYouHaveAnAccountWith13Value) {
        ifYouHaveAnAccountWith13.sendKeys(ifYouHaveAnAccountWith13Value);
        return this;
    }

    /**
     * Set default value to If You Have An Account With Us You Can Signup For Free Instant Online Access Password field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith1PasswordField() {
        return setIfYouHaveAnAccountWith1PasswordField(data.get("IF_YOU_HAVE_AN_ACCOUNT_WITH_1"));
    }

    /**
     * Set value to If You Have An Account With Us You Can Signup For Free Instant Online Access Password field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith1PasswordField(String ifYouHaveAnAccountWith1Value) {
        ifYouHaveAnAccountWith1.sendKeys(ifYouHaveAnAccountWith1Value);
        return this;
    }

    /**
     * Set default value to If You Have An Account With Us You Can Signup For Free Instant Online Access Password field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith2PasswordField() {
        return setIfYouHaveAnAccountWith2PasswordField(data.get("IF_YOU_HAVE_AN_ACCOUNT_WITH_2"));
    }

    /**
     * Set value to If You Have An Account With Us You Can Signup For Free Instant Online Access Password field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith2PasswordField(String ifYouHaveAnAccountWith2Value) {
        ifYouHaveAnAccountWith2.sendKeys(ifYouHaveAnAccountWith2Value);
        return this;
    }

    /**
     * Set default value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith3TextField() {
        return setIfYouHaveAnAccountWith3TextField(data.get("IF_YOU_HAVE_AN_ACCOUNT_WITH_3"));
    }

    /**
     * Set value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith3TextField(String ifYouHaveAnAccountWith3Value) {
        ifYouHaveAnAccountWith3.sendKeys(ifYouHaveAnAccountWith3Value);
        return this;
    }

    /**
     * Set default value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith4TextField() {
        return setIfYouHaveAnAccountWith4TextField(data.get("IF_YOU_HAVE_AN_ACCOUNT_WITH_4"));
    }

    /**
     * Set value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith4TextField(String ifYouHaveAnAccountWith4Value) {
        ifYouHaveAnAccountWith4.sendKeys(ifYouHaveAnAccountWith4Value);
        return this;
    }

    /**
     * Set default value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith5TextField() {
        return setIfYouHaveAnAccountWith5TextField(data.get("IF_YOU_HAVE_AN_ACCOUNT_WITH_5"));
    }

    /**
     * Set value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith5TextField(String ifYouHaveAnAccountWith5Value) {
        ifYouHaveAnAccountWith5.sendKeys(ifYouHaveAnAccountWith5Value);
        return this;
    }

    /**
     * Set default value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith6TextField() {
        return setIfYouHaveAnAccountWith6TextField(data.get("IF_YOU_HAVE_AN_ACCOUNT_WITH_6"));
    }

    /**
     * Set value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith6TextField(String ifYouHaveAnAccountWith6Value) {
        ifYouHaveAnAccountWith6.sendKeys(ifYouHaveAnAccountWith6Value);
        return this;
    }

    /**
     * Set default value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith7TextField() {
        return setIfYouHaveAnAccountWith7TextField(data.get("IF_YOU_HAVE_AN_ACCOUNT_WITH_7"));
    }

    /**
     * Set value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith7TextField(String ifYouHaveAnAccountWith7Value) {
        ifYouHaveAnAccountWith7.sendKeys(ifYouHaveAnAccountWith7Value);
        return this;
    }

    /**
     * Set default value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith8TextField() {
        return setIfYouHaveAnAccountWith8TextField(data.get("IF_YOU_HAVE_AN_ACCOUNT_WITH_8"));
    }

    /**
     * Set value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith8TextField(String ifYouHaveAnAccountWith8Value) {
        ifYouHaveAnAccountWith8.sendKeys(ifYouHaveAnAccountWith8Value);
        return this;
    }

    /**
     * Set default value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith9TextField() {
        return setIfYouHaveAnAccountWith9TextField(data.get("IF_YOU_HAVE_AN_ACCOUNT_WITH_9"));
    }

    /**
     * Set value to If You Have An Account With Us You Can Signup For Free Instant Online Access Text field.
     *
     * @return the registerUser class instance.
     */
    public registerUser setIfYouHaveAnAccountWith9TextField(String ifYouHaveAnAccountWith9Value) {
        ifYouHaveAnAccountWith9.sendKeys(ifYouHaveAnAccountWith9Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the registerUser class instance.
     */
    public registerUser submit() {
        clickRegisterButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the registerUser class instance.
     */
    public registerUser verifyPageLoaded() {
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
     * @return the registerUser class instance.
     */
    public registerUser verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
