package pages.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class AddUserPage extends BasePage {
    
    //locators
    private By adminHeader = By.xpath("//h6[contains(normalize-space(),'Admin')]");
    private By adduserLbl = By.xpath("//h6[contains(normalize-space(),'Add User')]");

    private By userRoleLbl = By.xpath("//label[normalize-space()='User Role']");
    private By userRoleInput = By.xpath("//label[normalize-space()='User Role']/../following-sibling::div");
    private By adminUserRole = By.xpath("//label[text() ='User Role']/following::span[contains(text(), 'Admin')]");
    private By essUserRole = By.xpath("//label[text() ='User Role']/following::span[contains(text(), 'ESS')]");

    
    private By employeeNameLbl = By.xpath("//label[normalize-space()='Employee Name']");
    private By employeeNameInput = By.xpath("//label[normalize-space()='Employee Name']/../following-sibling::div//input");
    
    private By statusLbl = By.xpath("//label[normalize-space()='Status']");
    private By statusInput = By.xpath("//label[normalize-space()='Status']/../following-sibling::div");
    private By statusEnable = By.xpath("//label[normalize-space()='Status']/../following-sibling::div//span[contains(normalize-space(),'Enable')]");
    private By statusDisabled = By.xpath("//label[normalize-space()='Status']/../following-sibling::div//span[contains(normalize-space(),'Disabled')]");

    private By usernameLbl = By.xpath("//label[normalize-space()='Username']");
    private By usernameInput = By.xpath("//label[normalize-space()='Username']/../following-sibling::div//input");
    private By passwordLbl = By.xpath("//label[normalize-space()='Password']");
    private By passwordInput = By.xpath("//label[normalize-space()='Password']/../following-sibling::div//input[@type='password']");
    private By confirmPasswordLbl = By.xpath("//label[normalize-space()='Confirm Password']");
    private By confirmPasswordInput = By.xpath("//label[normalize-space()='Confirm Password']/../following-sibling::div//input[@type='password']");
    private By saveBtn = By.xpath("//button[normalize-space()='Save']");
    private By cancelBtn = By.xpath("//button[normalize-space()='Cancel']");
    
    
    // constructor
    public AddUserPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAddUserHeaderDisplayed() {
        return isElementDisplayed(adminHeader);
    }
    public boolean isAddUserVisible(){
        return isElementDisplayed(adduserLbl);
    }
    public boolean isUserRoleVisible(){
        return isElementDisplayed(userRoleLbl);
    }
    public boolean isEmployeeNameVisible(){
        return isElementDisplayed(employeeNameLbl);
    }
    public boolean isStatusVisible(){
        return isElementDisplayed(statusLbl);
    }
    public boolean isUsernameVisible(){
        return isElementDisplayed(usernameLbl);
    }
    public boolean isPasswordVisible(){
        return isElementDisplayed(passwordLbl);
    }
    public boolean isConfirmPasswordVisible(){
        return isElementDisplayed(confirmPasswordLbl);
    }
    
    // return header title text
    public String getAddUserHeaderTitle(){
        return getText(adminHeader);
    }

    public void clickESSUserRole(){
        click(userRoleInput);
        click(essUserRole);
    }

    public void clickAdminUserRole(){
        click(userRoleInput);
        click(adminUserRole);
    }

    public void addEmployeeName(String employeeName){
        type(employeeNameInput, employeeName);
    }

    public void clickStatusEnable(){
        click(statusInput);
        click(statusEnable);
    }

    public void clickStatusDisabled(){
        click(statusInput);
        click(statusDisabled);
    }

    public void addUsername(String username){
        type(usernameInput,username);
    }

    public void addPassword(String password){
        type(passwordInput, password);
    }

    public void addConfirmPassword(String confirmPassword){
        type(confirmPasswordInput, confirmPassword);
    }

    public void clickSaveBtn(){
        click(saveBtn);
    }

    public void clickCancelBtn(){
        click(cancelBtn);
    }
}
