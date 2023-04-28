package test.EtherscanRedirectionsTestSuiteWithScreenshots;

import base.BaseTest;
import org.junit.Before;
import org.junit.Test;
import page.EtherscanRedirectionsPage;

import java.io.IOException;

public class EtherscanTandCRedirectionTest extends BaseTest {

    EtherscanRedirectionsPage etherscanRedirectionsPage;

    @Before
    public void setUpTest(){
        etherscanRedirectionsPage = new EtherscanRedirectionsPage();
    }

    @Test
    public void EtherscanTermsAndConditionsTest() throws IOException {
        etherscanRedirectionsPage.redirectionToTermsAndConditionsPage();

    }
}
