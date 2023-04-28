package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.EtherscanWarningMsgsPage;

public class EtherscanInfoMsgTest extends BaseTest {
    EtherscanWarningMsgsPage etherscanWarningMsgsPage;
    @Before
    public void setUpTest(){
        etherscanWarningMsgsPage = new EtherscanWarningMsgsPage();
    }
    @Test
    public void EtherscanInfoMsgTest(){
        Assert.assertTrue(etherscanWarningMsgsPage.showHiddenInfoMsg());

    }
}
