package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage extends BasePage {
    
    // navigators locators
    private By adminHeader = By.xpath("//h6[contains(normalize-space(),'Admin')]");

    private By systemUsersLbl = By.xpath("//h5[contains(normalize-space(),'System Users')]");
    private By recordsFound = By.xpath("//span[contains(normalize-space(),'Records Found')]");                                  
    
    private By usernameLbl = By.xpath("//label[contains(normalize-space(),'Username')]");
    private By usernameInput = By.xpath("//label[text()='Username']/../following-sibling::div//input");
    private By userRoleLbl = By.xpath("//label[contains(normalize-space(),'User Role')]");
    
    private By userRoleInput = By.xpath("//label[text()='User Role']/../following-sibling::div//div[contains(@class,'oxd-select-text-input')]");
    private By userRoleAdmin = By.xpath("//div/span[text()='Admin']");
    private By userRoleESS = By.xpath("//div/span[text()='ESS']");

    private By employeeNameLbl = By.xpath("//label[contains(normalize-space(),'Employee Name')]");
    private By employeeNameInput = By.xpath("//label[text()='Employee Name']/../following-sibling::div//input");
    private By statusLbl = By.xpath("//label[text()='Status']");
    
    private By statusInput = By.xpath("//label[text()='Status']/../following-sibling::div//div[contains(@class,'oxd-select-text-input')]");
    private By statuEnable = By.xpath("//div/span[text()='Enabled']");
    private By statusDisable = By.xpath("//div/span[text()='Disabled']");
    
    private By searchBtn = By.xpath("//button[normalize-space()='Search']");
    private By resetBtn = By.xpath("//button[normalize-space()='Reset']");
    private By addBtn = By.xpath("//button[normalize-space()='Add']");

    // constructor
    public AdminPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAdminHeaderDisplayed(){
        return isElementDisplayed(adminHeader); 
    }
    public String getAdminHeaderTitle(){
        return getText(adminHeader);
    }
    public void clickAddUserBtn(){
        if (isElementDisplayed(addBtn)) {
        click(addBtn);
        System.out.println("Add User button was displayed and clicked.");
        } else {
            throw new RuntimeException("Add User button is not displayed!");
        }
    }
    public void clickSearchBtn(){
        if (isElementDisplayed(searchBtn)) {
        click(searchBtn);
        System.out.println("Search button was displayed and clicked.");
        } else {
            throw new RuntimeException("Search button is not displayed!");
        }
    }
    public void clickResetBtn(){
        if (isElementDisplayed(resetBtn)) {
        click(resetBtn);
        System.out.println("Reset button was displayed and clicked.");
        } else {
            throw new RuntimeException("Reset button is not displayed!");
        }
    }
    public void inputUsername(String username){
        if (isElementDisplayed(usernameInput)) {
        click(usernameInput);
        System.out.println("Username text field was displayed.");
        type(usernameInput, username);
        } else {
            throw new RuntimeException("Username text field is not displayed!");
        }
    }
    public void inputUserRoleAdmin(){
        if (isElementDisplayed(userRoleInput)) {
        click(userRoleInput);
        System.out.println("User role text field was displayed and clicked.");
        click(userRoleAdmin);
        } else {
            throw new RuntimeException("User role text field is not displayed!");
        }
    }
    public void inputUserRoleESS(){
        if (isElementDisplayed(userRoleInput)) {
        click(userRoleInput);
        System.out.println("User role text field was displayed and clicked.");
        click(userRoleESS);
        } else {
            throw new RuntimeException("User role text field is not displayed!");
        }
    }
    public void inputEmployeeName(String employeename){
        if (isElementDisplayed(employeeNameInput)) {
        click(employeeNameInput);
        System.out.println("Employee name text field was displayed.");
        type(employeeNameInput, employeename);
        } else {
            throw new RuntimeException("Employee name text field is not displayed!");
        }
    }
    public void inputStatusEnable(){
        if (isElementDisplayed(statusInput)) {
        click(statusInput);
        System.out.println("Employee name text field was displayed.");
        click(statuEnable);
        } else {
            throw new RuntimeException("Employee name text field is not displayed!");
        }
    }
    public void inputStatusDisable(){
        if (isElementDisplayed(statusInput)) {
        click(statusInput);
        System.out.println("Employee name text field was displayed.");
        click(statusDisable);
        } else {
            throw new RuntimeException("Employee name text field is not displayed!");
        }
    }

    public boolean isSystemUsersVisible(){
        return isElementDisplayed(systemUsersLbl);
    }
    public boolean isRecordsFoundVisible(){
        return isElementDisplayed(recordsFound);
    }
    public boolean isUsernameVisibile(){
        return isElementDisplayed(usernameLbl);
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

    

}
