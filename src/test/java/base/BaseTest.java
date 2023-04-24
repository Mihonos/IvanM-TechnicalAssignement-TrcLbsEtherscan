package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wdWait;
    public static Actions actions;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdWait = new WebDriverWait(driver, 30);
        driver.get("https://etherscan.io/register");
        driver.manage().window().maximize();
        actions = new Actions(driver);
    }
    //int waitTime = 30;

    /*public void clickElement(WebElement element) {
        try {
            WebDriverWait wdWait = new WebDriverWait(driver, waitTime);
            wdWait.until(ExpectedConditions.visibilityOf(element));
            wdWait.until(ExpectedConditions.elementToBeClickable(element));

            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
            //System.out.println("Clicked " + log);
        } catch (StaleElementReferenceException e) {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
            //System.out.println("Clicked " + log);
        }
    }*/


    @After
    public void tearDown() {
        //driver.quit();
    }
}
