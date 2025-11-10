package tests.PIM;
import setup.EnvReader;
import setup.BaseTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.dashboard.DashboardPage;
import pages.login.LoginPage;
import pages.pim.PIMPage;

public class PIMTest extends BaseTest  {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private PIMPage pimPage;

    @BeforeMethod
    public void initPages(){
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        pimPage = new PIMPage(driver);
    }

    @Test
    public void searchEmployee() throws InterruptedException{

    }
}
