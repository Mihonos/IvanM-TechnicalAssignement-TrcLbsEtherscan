package test.EtherscanRedirectionsTestSuiteWithScreenshots;

import base.BaseTest;
import org.junit.Before;
import org.junit.Test;
import page.EtherscanRedirectionsPage;

import java.io.IOException;

public class EtherscanUnsubscribeRedirectionTest extends BaseTest {
    EtherscanRedirectionsPage etherscanRedirectionsPage;

    @Before
    public void setUpTest(){ etherscanRedirectionsPage = new EtherscanRedirectionsPage();}

    @Test
    public void EtherscanUnsubscribeRedirectionTest() throws IOException {
        etherscanRedirectionsPage.redirectionToUnsubscribePage();
    }
}
