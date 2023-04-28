package page;

import base.BaseTest;
import net.bytebuddy.implementation.attribute.AnnotationValueFilter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EtherscanPasswordStrengthPage extends BaseTest {
    public EtherscanPasswordStrengthPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtPassword']")
    WebElement passwordField;
    @FindBy(css = "span[style='color: brown;']")
    WebElement mediumPassword;
    @FindBy(css = "span[class='progress-label fs-sm text-warning']")
    WebElement easyPassword;
    @FindBy(css = "span[class='progress-label fs-sm text-success']")
    WebElement strongPassword;

    // The idea behind PasswordStrengthText is to check if the strength slider is working properly

    // Password made of min 8 letters, or 8 special characters or 8 numbers should return Weak!
    public boolean passwordCheckEasy(){
        passwordField.sendKeys("colindas");
        wdWait.until(ExpectedConditions.visibilityOf(easyPassword));
        return easyPassword.isDisplayed();
    }
    /* Password made of min 8 mixed letters and numbers or mixed letters and special characters
    or mixed numbers and special characters should return Medium! */
    public boolean passwordCheckMedium(){
        passwordField.clear();
        passwordField.sendKeys("colinda6542");
        wdWait.until(ExpectedConditions.visibilityOf(mediumPassword));
        return mediumPassword.isDisplayed();
    }
    // Password made of mixed capital and small letters, numbers and special characters should return Strong!
    public boolean passwordCheckStrong(){
        passwordField.clear();
        passwordField.sendKeys("colindascolinda6542DJJ<<>>");
        wdWait.until(ExpectedConditions.visibilityOf(strongPassword));
        return strongPassword.isDisplayed();
    }
}
