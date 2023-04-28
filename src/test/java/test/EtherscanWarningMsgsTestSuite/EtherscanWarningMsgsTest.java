package test.EtherscanWarningMsgsTestSuite;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.EtherscanSignUpPage;
import page.EtherscanWarningMsgsPage;

public class EtherscanWarningMsgsTest extends BaseTest {
    EtherscanSignUpPage etherscanSignUpPage;
    EtherscanWarningMsgsPage etherscanWarningMsgsPage;

    @Before
    public void SetUpTest(){
        etherscanSignUpPage = new EtherscanSignUpPage();
        etherscanWarningMsgsPage = new EtherscanWarningMsgsPage();

    }
    @Test
    public void EtherscanWarningMsgsTest() throws InterruptedException {
        etherscanSignUpPage.acceptCookies();
        etherscanSignUpPage.scrollToCreateAccBtn();
        //etherscanSignUpPage.setZoom90();
        etherscanSignUpPage.clickCreateAcc();
        Assert.assertTrue(etherscanWarningMsgsPage.showEnterUsernameWarningMsg());
        Assert.assertTrue(etherscanWarningMsgsPage.showEnterAtLeast5ChUsernameWarningMsg());
        Assert.assertTrue(etherscanWarningMsgsPage.showOnlyAlphanumericChUsernameWarningMsg());
        Assert.assertTrue(etherscanWarningMsgsPage.showEnterValidEmailWarningMsg());
        Assert.assertTrue(etherscanWarningMsgsPage.showReEnterEmailWarningMsg());
        Assert.assertTrue(etherscanWarningMsgsPage.showEmailDontMatchWarningMsg());
        Assert.assertTrue(etherscanWarningMsgsPage.showEnterPasswordWarningMsg());
        Assert.assertTrue(etherscanWarningMsgsPage.showPassMustBe8ChLongWarningMsg());
        Assert.assertTrue(etherscanWarningMsgsPage.showPassDontMatchWarningMessage());
        Assert.assertTrue(etherscanWarningMsgsPage.showAcceptTandCWarningMsg());
    }
}
