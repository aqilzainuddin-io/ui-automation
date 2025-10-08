package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
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
    public void invalidLoginShowsError() {
        loginPage.login(EnvReader.get("INVALID_USERNAME"), EnvReader.get("INVALID_PASSWORD"));
        Assert.assertTrue(loginPage.getErrorMessage().contains("Invalid credentials"));
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
