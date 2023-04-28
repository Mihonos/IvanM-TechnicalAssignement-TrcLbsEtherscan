package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.EtherscanPasswordStrengthPage;

public class EtherscanPasswordStrengthTest extends BaseTest {
    EtherscanPasswordStrengthPage etherscanPasswordStrengthPage;

    @Before
    public void setUpTest(){
        etherscanPasswordStrengthPage = new EtherscanPasswordStrengthPage();
    }
    @Test
    public void EtherscanMediumPasswordTest(){
        Assert.assertTrue(etherscanPasswordStrengthPage.passwordCheckEasy());
        Assert.assertTrue(etherscanPasswordStrengthPage.passwordCheckMedium());
        Assert.assertTrue(etherscanPasswordStrengthPage.passwordCheckStrong());
    }
}
