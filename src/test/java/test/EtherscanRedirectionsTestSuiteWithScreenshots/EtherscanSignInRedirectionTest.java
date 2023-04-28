package test.EtherscanRedirectionsTestSuiteWithScreenshots;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.EtherscanRedirectionsPage;

public class EtherscanSignInRedirectionTest extends BaseTest {

    EtherscanRedirectionsPage etherscanRedirectionsPage;

    @Before
    public void setUpTest(){ etherscanRedirectionsPage = new EtherscanRedirectionsPage();}

    @Test
    public void EtherscanSignInRedirectionTest(){
        Assert.assertTrue(etherscanRedirectionsPage.redirectionToSignInPage());
    }

}
