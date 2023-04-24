package test;

import base.BaseTest;
import org.junit.Before;
import org.junit.Test;
import page.EtherscanSignUpPage;

public class EtherscanWarningMsgsTest extends BaseTest {
    EtherscanSignUpPage etherscanSignUpPage;

    @Before
    public void SetUpTest(){
        etherscanSignUpPage = new EtherscanSignUpPage();
    }
    @Test
    public void EtherscanWarningMsgsTest() throws InterruptedException {
        etherscanSignUpPage.acceptCookies();
        etherscanSignUpPage.scrollToCreateAccBtn();
        //etherscanSignUpPage.setZoom90();
        etherscanSignUpPage.clickCreateAcc();
    }
}
