package tests;

import pages.LoginPage;
import setup.BaseTest;
import setup.EnvReader;

import org.testng.Assert;
import pages.DashboardPage;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;


public class LoginTest extends BaseTest {
    private LoginPage loginPage;

    @BeforeMethod
    public void initPage() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void invalidLogin() {
        loginPage.login(EnvReader.get("INVALID_USERNAME"), EnvReader.get("INVALID_PASSWORD"));
        Assert.assertTrue(loginPage.getErrorMessage().contains("Invalid credentials"));
    }

    @Test
    public void validLogin() {
        loginPage.login(EnvReader.get("VALID_USERNAME"), EnvReader.get("VALID_PASSWORD"));
        DashboardPage dashboardPage = new DashboardPage(driver);
        Assert.assertTrue(dashboardPage.isDashboardDisplayed(), "Dashboard not visible after valid login!");
    }
}
