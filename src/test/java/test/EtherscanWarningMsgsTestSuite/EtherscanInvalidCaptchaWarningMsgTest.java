package test.EtherscanWarningMsgsTestSuite;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.EtherscanSignUpPage;
import page.EtherscanWarningMsgsPage;

public class EtherscanInvalidCaptchaWarningMsgTest extends BaseTest {

    EtherscanSignUpPage etherscanSignUpPage;
    EtherscanWarningMsgsPage etherscanWarningMsgsPage;

    @Before
    public void SetUpTest() {
        etherscanSignUpPage = new EtherscanSignUpPage();
        etherscanWarningMsgsPage = new EtherscanWarningMsgsPage();
    }
    @Test
    public void EtherscanInvalidCaptchaWarningMsgTest() throws InterruptedException {
        etherscanSignUpPage.enterUserName();
        etherscanSignUpPage.enterEmail();
        etherscanSignUpPage.confirmEmail();
        etherscanSignUpPage.enterPassword();
        etherscanSignUpPage.confirmPassword();
        etherscanSignUpPage.acceptCookies();
        etherscanSignUpPage.check1stCheckBox();
        etherscanSignUpPage.clickCreateAcc();
        Assert.assertTrue(etherscanWarningMsgsPage.showInvalidCaptchaWarningMsg());
    }
}
