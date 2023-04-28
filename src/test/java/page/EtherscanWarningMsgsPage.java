package page;


import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EtherscanWarningMsgsPage extends BaseTest {

    public EtherscanWarningMsgsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#ContentPlaceHolder1_txtUserName-error")
    WebElement enterUsernameMsg;
    @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtUserName']")
    WebElement usernameField;
    @FindBy(css="#ContentPlaceHolder1_txtEmail-error")
    WebElement incorrectMailMsg;
    @FindBy(css = "input[name='ctl00$ContentPlaceHolder1$txtEmail']")
    WebElement emailField;
    @FindBy(css = "input[name='ctl00$ContentPlaceHolder1$txtConfirmEmail']")
    WebElement confirmEmailField;
    @FindBy(id = "ContentPlaceHolder1_txtConfirmEmail-error")
    WebElement reEnterEmailMsg;
    @FindBy(id = "ContentPlaceHolder1_txtPassword-error")
    WebElement enterPassMsg;
    @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtPassword']")
    WebElement passwordField;
    @FindBy(css = "input[name='ctl00$ContentPlaceHolder1$txtPassword2']")
    WebElement confirmPasswordField;
    @FindBy(id = "ContentPlaceHolder1_txtPassword2-error")
    WebElement reEnterPassMsg;
    @FindBy(id = "ctl00$ContentPlaceHolder1$MyCheckBox-error")
    WebElement acceptTAndCMsg;
    @FindBy(xpath = "//div[@class='alert alert-danger'][contains(.,'captcha response')]")
    WebElement invalidCaptchaMsg;
    @FindBy(css = ".fa-question-circle ")
    WebElement questionCircleBtn;
    @FindBy(xpath = "//i[@aria-label='Username has to be from 5 to 30 characters in length, only alphanumeric characters allowed.']" )
    WebElement infoMsg;

    // Username field Warning messages: next 3 methods
    public boolean showEnterUsernameWarningMsg(){
        wdWait.until(ExpectedConditions.visibilityOf(enterUsernameMsg));
        return enterUsernameMsg.isDisplayed();
    }
    public boolean showEnterAtLeast5ChUsernameWarningMsg(){
        usernameField.sendKeys("keys");
        wdWait.until(ExpectedConditions.visibilityOf(enterUsernameMsg));
        return enterUsernameMsg.isDisplayed();
    }

    /* This method also checks if SQL injections and js injections are possible by entering special characters,
       although this is a registration form, not a sign in form. */
    public boolean showOnlyAlphanumericChUsernameWarningMsg(){
        usernameField.sendKeys("<>!1=1");
        wdWait.until(ExpectedConditions.visibilityOf(enterUsernameMsg));
        return enterUsernameMsg.isDisplayed();
    }
    public boolean showEnterValidEmailWarningMsg(){
        return incorrectMailMsg.isDisplayed();
    }

    // Confirm Email Address field Warning messages: next 2 methods
    public boolean showReEnterEmailWarningMsg(){
        return reEnterEmailMsg.isDisplayed();
    }
    public boolean showEmailDontMatchWarningMsg(){
        emailField.sendKeys("32Ydhgs@hgs.sgh");
        confirmEmailField.sendKeys("wrongmail@sgh.hgs");
        return reEnterEmailMsg.isDisplayed();
    }
    public boolean showEnterPasswordWarningMsg(){
        return enterPassMsg.isDisplayed();
    }

    // Confirm Password field Warning messages: next 2 methods
    public boolean showPassMustBe8ChLongWarningMsg(){
        return reEnterPassMsg.isDisplayed();
    }
    public boolean showPassDontMatchWarningMessage(){
        passwordField.sendKeys("combat1823");
        confirmPasswordField.sendKeys("wrongpass");
        return reEnterPassMsg.isDisplayed();
    }
    public boolean showAcceptTandCWarningMsg(){
        return acceptTAndCMsg.isDisplayed();
    }
    public boolean showInvalidCaptchaWarningMsg(){
        return invalidCaptchaMsg.isDisplayed();
    }
    public boolean showHiddenInfoMsg(){
        actions.moveToElement(questionCircleBtn).build().perform();
        wdWait.until(ExpectedConditions.visibilityOf(infoMsg));
        return infoMsg.isDisplayed();

    }
}
