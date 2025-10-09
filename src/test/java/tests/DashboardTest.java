package tests;

import setup.BaseTest;
import pages.LoginPage;
import setup.EnvReader;
import org.testng.Assert;
import pages.DashboardPage;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;


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
        Assert.assertTrue(dashboardPage.isMyActionsVisible(), "My Actions widget missing!");
        Assert.assertTrue(dashboardPage.isBuzzLatestPostsVisible(), "Buzz Latest Posts widget missing!");
        Assert.assertTrue(dashboardPage.isEmployeesOnLeaveTodayVisible(), "Employees On Leave Today widget missing!");
        Assert.assertTrue(dashboardPage.isEmployeeDistributionBySubUnitVisible(), "Employee Distribution By Unit missing!");
        Assert.assertTrue(dashboardPage.isEmployeeDistributionByLocationVisible(), "Employee Distribution By Location widget missing!");

        // Step 4: Title check
        System.out.println("Dashboard title: " + dashboardPage.getDashboardTitle());
    }
}
