package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.DashboardPage;
import setup.BaseTest;
import setup.EnvReader;

public class DashboardTest extends BaseTest {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    @BeforeMethod
    public void initPages() {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
    }

    @Test
    public void verifyDashboard() {
        // Step 1: Login
        loginPage.login(EnvReader.get("VALID_USERNAME"), EnvReader.get("VALID_PASSWORD"));

        // Step 2: Assert Dashboard loaded
        Assert.assertTrue(dashboardPage.isDashboardDisplayed(), "Dashboard header not visible!");

        // Step 3: Check important widgets
        Assert.assertTrue(dashboardPage.isQuickLaunchVisible(), "Quick Launch widget missing!");
        Assert.assertTrue(dashboardPage.isTimeAtWorkVisible(), "Time at Work widget missing!");

        // Step 4: Optional title check
        System.out.println("Dashboard title: " + dashboardPage.getDashboardTitle());
    }
}
