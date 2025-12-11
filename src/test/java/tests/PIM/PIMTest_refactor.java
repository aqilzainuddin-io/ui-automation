package tests.PIM;
import setup.EnvReader;
import setup.BaseTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.dashboard.DashboardPage;
import pages.login.LoginPage;
import pages.pim.PIMPage;

public class PIMTest_refactor extends BaseTest  {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private PIMPage pimPage;

    @BeforeMethod
    public void initPages(){
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        pimPage = new PIMPage(driver);
    }

    // @Test
    // public void searchEmployeeByID() throws InterruptedException{
    //     loginPage.login(EnvReader.get("VALID_USERNAME"), EnvReader.get("VALID_PASSWORD"));
    //     Assert.assertTrue(dashboardPage.isDashboardHeaderDisplayed(),"Dashboard header not displayed!");
    //     Assert.assertTrue(dashboardPage.isPIMPageVisible(),"PIM navigator link not displayed!");
    //     dashboardPage.clickPIMPage();

    //     Assert.assertTrue(pimPage.isPIMHeaderDisplayed(),"PIM header not displayed!");
    //     pimPage.inputEmployeeID("8989");
    //     pimPage.clickSearchBtn();
    //     Assert.assertTrue(pimPage.isRecordFoundByIDVisible(),"Registered ID not displayed!");
    // }

    // @Test
    // public void searchByEmployeeName() throws InterruptedException{
    //     loginPage.login(EnvReader.get("VALID_USERNAME"), EnvReader.get("VALID_PASSWORD"));
    //     Assert.assertTrue(dashboardPage.isDashboardHeaderDisplayed(),"Dashboard header not displayed!");
    //     Assert.assertTrue(dashboardPage.isPIMPageVisible(),"PIM navigator link not displayed!");
    //     dashboardPage.clickPIMPage();

    //     Assert.assertTrue(pimPage.isPIMHeaderDisplayed(),"PIM header not displayed!");
    //     pimPage.inputEmployeeName("John52 Doe");
    //     pimPage.clickSearchBtn();
    //     Assert.assertTrue(pimPage.isRecordFoundByFirstLastNameVisible(),"Registered first name and last name not displayed!");
    // }

    // @Test
    // public void searchByEmployeeNameAndID() throws InterruptedException{
    //     loginPage.login(EnvReader.get("VALID_USERNAME"), EnvReader.get("VALID_PASSWORD"));
    //     Assert.assertTrue(dashboardPage.isDashboardHeaderDisplayed(),"Dashboard header not displayed!");
    //     Assert.assertTrue(dashboardPage.isPIMPageVisible(),"PIM navigator link not displayed!");
    //     dashboardPage.clickPIMPage();

    //     Assert.assertTrue(pimPage.isPIMHeaderDisplayed(),"PIM header not displayed!");
    //     pimPage.inputEmployeeName("John52 Doe");
    //     pimPage.inputEmployeeID("8989");
    //     pimPage.clickSearchBtn();
    //     Assert.assertTrue(pimPage.isRecordFoundByFirstLastNameVisible(),"Registered first name and last name not displayed!");
    //     Assert.assertTrue(pimPage.isRecordFoundByIDVisible(),"Registered ID not displayed!");
    // }
}
