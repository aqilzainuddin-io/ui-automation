package tests.Admin;

import setup.BaseTest;
import setup.EnvReader;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.admin.AddUserPage;
import pages.admin.AdminPage;
import pages.dashboard.DashboardPage;
import pages.login.LoginPage;

public class AddUserTest extends BaseTest {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private AdminPage adminPage;
    private AddUserPage addUserPage;

    @BeforeMethod
    public void initPages(){
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        adminPage = new AdminPage(driver);
        addUserPage = new AddUserPage(driver);
    }

    // inorder to create admin user, you need to create employee first, with same name
    @Test
    public void addUserRole() throws InterruptedException{
        
        /** 
            1. Login using  
        **/

        loginPage.login(EnvReader.get("VALID_USERNAME"), EnvReader.get("VALID_PASSWORD")); 
        
        Assert.assertTrue(dashboardPage.isDashboardHeaderDisplayed(), "Dashboard header not visible!");
        System.out.println("Dashboard title: " + dashboardPage.getDashboardTitle());
        
    }
}
