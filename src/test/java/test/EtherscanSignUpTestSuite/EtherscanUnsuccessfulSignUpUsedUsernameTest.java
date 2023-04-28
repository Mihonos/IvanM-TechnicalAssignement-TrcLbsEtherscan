package test.EtherscanSignUpTestSuite;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.EtherscanSignUpPage;

public class EtherscanUnsuccessfulSignUpUsedUsernameTest extends BaseTest {
    EtherscanSignUpPage etherscanSignUpPage;
    @Before
    public void setUpTest(){
        etherscanSignUpPage = new EtherscanSignUpPage();
    }
    @Test
    public void EtherscanSuccessfullSignUpTest() throws InterruptedException {
        etherscanSignUpPage.enterUsedUsername();
        etherscanSignUpPage.enterEmail();
        etherscanSignUpPage.confirmEmail();
        etherscanSignUpPage.enterPassword();
        etherscanSignUpPage.confirmPassword();
        etherscanSignUpPage.acceptCookies();
        etherscanSignUpPage.check1stCheckBox();
        etherscanSignUpPage.checkCaptcha();
        etherscanSignUpPage.clickCreateAcc();
        Assert.assertTrue(etherscanSignUpPage.usedUsernameWarningMsg());
    }
}
