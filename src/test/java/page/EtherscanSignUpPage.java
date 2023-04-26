package page;

import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EtherscanSignUpPage extends BaseTest {

    public EtherscanSignUpPage(){

        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtUserName']")
    WebElement usernameField;
    @FindBy(css = "input[name='ctl00$ContentPlaceHolder1$txtEmail']")
    WebElement emailField;
    @FindBy(css = "input[name='ctl00$ContentPlaceHolder1$txtConfirmEmail']")
    WebElement confirmEmailField;
    @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtPassword']")
    WebElement passwordField;
    @FindBy(css = "input[name='ctl00$ContentPlaceHolder1$txtPassword2']")
    WebElement confirmPasswordField;
    @FindBy(css = ".btn.btn-primary.text-nowrap.px-4")
    WebElement gotItBtn;
    @FindBy(css = "input[name='ctl00$ContentPlaceHolder1$MyCheckBox']")
    WebElement firstCheckBox;
    @FindBy(css = "iframe[title='reCAPTCHA']")
    WebElement captchaIframe;
    @FindBy(css=".recaptcha-checkbox-unchecked")
    WebElement captchaCheckBox;
    @FindBy(css = "#ContentPlaceHolder1_btnRegister")
    WebElement createAccountBtn;
    @FindBy(css = ".alert-info")
    WebElement successfullSignUpMsg;

    public void enterUserName(){
        usernameField.sendKeys("tet"+System.currentTimeMillis()/100+"hersome");
    }
    public void enterEmail(){
        emailField.sendKeys("test"+System.currentTimeMillis()/100+"@mailinator.com");
    }
    public void confirmEmail(){
        String mail = emailField.getAttribute("value");
        confirmEmailField.sendKeys(mail);
    }
    public void enterPassword(){
        passwordField.sendKeys("abdulrahman");
    }
    public void confirmPassword(){
        confirmPasswordField.sendKeys("abdulrahman");
    }
    public void acceptCookies(){
        gotItBtn.click();
    }
    public void check1stCheckBox(){
        wdWait.until(ExpectedConditions.visibilityOf(firstCheckBox));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", firstCheckBox);
        actions.moveToElement(firstCheckBox).build().perform();
        firstCheckBox.click();
    }
    public void checkCaptcha() throws InterruptedException {
        wdWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(captchaIframe));
        wdWait.until(ExpectedConditions.elementToBeClickable(captchaCheckBox));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", captchaCheckBox);
        actions.moveToElement(captchaCheckBox,28,28).build().perform();
        Thread.sleep(5000);
        captchaCheckBox.click();
        driver.switchTo().defaultContent();
    }
    public void setZoom90(){
        ((JavascriptExecutor)driver).executeScript("document.body.style.zoom='90%';");
    }
    public void scrollToCreateAccBtn(){
        ((JavascriptExecutor)driver).executeScript("javascript:window.scrollBy(1360,846)");
    }
    public void clickCreateAcc(){
        //driver.switchTo().defaultContent();
        wdWait.until(ExpectedConditions.elementToBeClickable(createAccountBtn));
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createAccountBtn);
        //actions.moveToElement(createAccountBtn, (int) 317.220, (int) 22.500).build().perform();
        createAccountBtn.click();
    }
    public boolean successfullSignUp(){
        wdWait.until(ExpectedConditions.visibilityOf(successfullSignUpMsg));
        return successfullSignUpMsg.isDisplayed();
    }

}
