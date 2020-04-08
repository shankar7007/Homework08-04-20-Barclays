package uk.gov.harrow.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.gov.harrow.browserselector.BrowserSelector;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.testbase.TestBase;

public class TestCase extends TestBase{
    HomePage homePage = new HomePage();
    @Test
    public void userShouldclickOnloginOrRegisterLink(){
   homePage.clickOnLoginRegisterLink();
    }
    @Test
    public void userShouldclickOnservicesBtn(){
        homePage.clickOnServiceBtn();
    }







}
