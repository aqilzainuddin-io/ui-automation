package tests;

import setup.BaseTest;
import setup.EnvReader;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;
import pages.AddUserPage;
import pages.AdminPage;

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
    public void addAdminUser() throws InterruptedException{
        
        loginPage.login(EnvReader.get("VALID_USERNAME"), EnvReader.get("VALID_PASSWORD")); // Step 1: Login
        
        Assert.assertTrue(dashboardPage.isDashboardHeaderDisplayed(), "Dashboard header not visible!"); // Step 2: Assert dashboard page loaded and check title
        System.out.println("Dashboard title: " + dashboardPage.getDashboardTitle());
        
        Assert.assertTrue(dashboardPage.isAdminPageVisible(), "Admin navigation link not visible!"); // Step 3: Assert admin page navigation link visible and click
        dashboardPage.clickAdminPage();
        
        Assert.assertTrue(adminPage.isAdminHeaderDisplayed(),"Admin header not visible!"); // Step 4: Assert admin page loaded and check title
        System.out.println("Admin title: " + adminPage.getAdminHeaderTitle());
        
        adminPage.clickAddUserBtn(); // Step 5: Click +Add button  
        
        Assert.assertTrue(addUserPage.isAddUserHeaderDisplayed(),"Add user header not visible!"); // Step 7: Assert add user page loaded and check title
        System.out.println("Add user title:" + addUserPage.getAddUserHeaderTitle());
        
        Assert.assertTrue(addUserPage.isUserRoleVisible(),"User role label not visible!"); // Step 8: Assert user role label is visible and select user role as admin
        addUserPage.clickAdminUserRole();
        
        Assert.assertTrue(addUserPage.isEmployeeNameVisible(),"Emplyoyee name label not visible!"); // Step 9: Assert user employee name label is visible and input employee name as tester0001
        addUserPage.addEmployeeName("tester0001");

        Assert.assertTrue(addUserPage.isStatusVisible(),"Status label not visible!"); // Step 10: Assert status label is visible and select status as enable
        addUserPage.clickStatusEnable();

        Assert.assertTrue(addUserPage.isUsernameVisible(),"Username label not visible!"); // Step 11: Assert username label is visible and input tester0001xt as username
        addUserPage.addUsername("tester0001xt");

        Assert.assertTrue(addUserPage.isPasswordVisible(),"Password label not visible"); // Step 12: Assert password label is visible and input xt0001tester as password
        addUserPage.addPassword("xt0001tester");

        Assert.assertTrue(addUserPage.isConfirmPasswordVisible(),"Confirm Password label not visible!"); // Step 13: Assert confirm password is visible and input xt0001tester as confirm password
        addUserPage.addConfirmPassword("xt0001tester");

        addUserPage.clickSaveBtn(); // Step 14: Click save button to add the new user
    }
}
