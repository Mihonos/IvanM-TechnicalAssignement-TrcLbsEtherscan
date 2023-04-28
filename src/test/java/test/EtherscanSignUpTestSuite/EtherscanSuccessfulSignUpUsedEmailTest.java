package test.EtherscanSignUpTestSuite;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.EtherscanSignUpPage;

public class EtherscanSuccessfulSignUpUsedEmailTest extends BaseTest {
    EtherscanSignUpPage etherscanSignUpPage;
    @Before
    public void setUpTest(){
        etherscanSignUpPage = new EtherscanSignUpPage();
    }
    @Test
    public void EtherscanSuccessfullSignUpTest() throws InterruptedException {
        etherscanSignUpPage.enterUserName();
        etherscanSignUpPage.enterUsedEmail();
        etherscanSignUpPage.reEnterUsedEmail();
        etherscanSignUpPage.enterPassword();
        etherscanSignUpPage.confirmPassword();
        etherscanSignUpPage.acceptCookies();
        etherscanSignUpPage.check1stCheckBox();
        etherscanSignUpPage.checkCaptcha();
        etherscanSignUpPage.clickCreateAcc();
        Assert.assertTrue(etherscanSignUpPage.successfullSignUp());
    }
}

