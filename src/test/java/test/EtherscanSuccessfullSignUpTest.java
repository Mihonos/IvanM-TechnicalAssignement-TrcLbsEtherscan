package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.EtherscanSignUpPage;

public class EtherscanSuccessfullSignUpTest extends BaseTest {
    EtherscanSignUpPage etherscanSignUpPage;

    @Before
    public void setUpTest(){
        etherscanSignUpPage = new EtherscanSignUpPage();
    }
    @Test public void EtherscanSuccessfullSignUpTest() throws InterruptedException {
        //etherscanSignUpPage.setZoom90();
        etherscanSignUpPage.enterUserName();
        etherscanSignUpPage.enterEmail();
        etherscanSignUpPage.confirmEmail();
        etherscanSignUpPage.enterPassword();
        etherscanSignUpPage.confirmPassword();
        etherscanSignUpPage.acceptCookies();
        //etherscanSignUpPage.scrollToCreateAccBtn();
        etherscanSignUpPage.check1stCheckBox();
        etherscanSignUpPage.checkCaptcha();
        etherscanSignUpPage.clickCreateAcc();
        Assert.assertTrue(etherscanSignUpPage.successfullSignUp());
    }
}
