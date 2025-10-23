package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUserPage extends BasePage {
    
    //locators
    private By addUserRoleLbl = By.xpath("//label[normalize-space()='User Role']");
    private By addUserRoleInput = By.xpath("//label[normalize-space()='User Role']/following::div[contains(@class,'oxd-select-text-input')]");
    private By addEmployeeNameLbl = By.xpath("//label[normalize-space()='Employee Name']");
    private By addEmployeeNameInput = By.xpath("//label[normalize-space()='Employee Name']/../following-sibling::div//input");
    private By addStatusLbl = By.xpath("//label[normalize-space()='Status']");
    private By addStatusInput = By.xpath("//label[normalize-space()='Status']/following::div[contains(@class,'oxd-select-text-input')]");
    private By addUsernameLbl = By.xpath("//label[normalize-space()='Username']");
    private By addUsernameInput = By.xpath("//label[normalize-space()='Username']/../following-sibling::div//input");
    private By addPasswordLbl = By.xpath("//label[normalize-space()='Password']");
    private By addPasswordInput = By.xpath("//label[normalize-space()='Password']/../following-sibling::div//input[@type='password']");
    private By addConfirmPasswordLbl = By.xpath("//label[normalize-space()='Confirm Password']");
    private By addConfirmPasswordInput = By.xpath("//label[normalize-space()='Confirm Password']/../following-sibling::div//input[@type='password']");
    private By saveBtn = By.xpath("//button[normalize-space()='Save']");
    private By cancelBtn = By.xpath("//button[normalize-space()='Cancel']");
    
    
    // constructor
    public AddUserPage(WebDriver driver) {
        super(driver);
    }

}
