package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.DashboardPage;
import pages.LoginPage;
import utils.DriverFactory;
import utils.EnvReader;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.initializeDriver();
        driver.get(EnvReader.get("BASE_URL"));
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

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
