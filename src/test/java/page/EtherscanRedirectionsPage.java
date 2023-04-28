package page;

import base.BaseTest;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.File;
import java.io.IOException;


public class EtherscanRedirectionsPage extends BaseTest {

    public EtherscanRedirectionsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[@class='text-muted mb-0']/a")
    WebElement signInButon;
    @FindBy(id = "ContentPlaceHolder1_btnLogin")
    WebElement loginButton;
    @FindBy(xpath = "//label[@class='form-check-label text-muted']/a")
    WebElement tandCButton;
    @FindBy(css = "h1[class='h2 text-white text-print-dark']")
    WebElement tandCHeader;
    @FindBy(css = "a[href='https://info.etherscan.com/how-to-subscribe-unsubscribe-newsletter/']")
    WebElement unsubscribeBtn;
    @FindBy(css = "h1[class='post-title']")
    WebElement unsubscribeHeader;

    public boolean redirectionToSignInPage() {
        signInButon.click();
        wdWait.until(ExpectedConditions.visibilityOf(loginButton));
        return loginButton.isDisplayed();
    }

    public void redirectionToTermsAndConditionsPage() throws IOException {
        String parentHandle = driver.getWindowHandle();
        tandCButton.click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("src/screenshots.png"));
        }
    }

    public void redirectionToUnsubscribePage() throws IOException {
        String parentHandle = driver.getWindowHandle();
        unsubscribeBtn.click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("src/screenshots.png"));
        }
    }
}