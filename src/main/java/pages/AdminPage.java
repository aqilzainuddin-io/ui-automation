package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage extends BasePage {
    
    // verify admin/user management page
    private By adminHeader = By.cssSelector("oxd-topbar-header-breadcrumb-module");
    private By systemUsers = By.cssSelector("oxd-table-filter-title");
    private By recordsFound = By.xpath("//span[contains(normalize-space(),'Records Found')]");
    
    // 
    private By usernameLbl = By.xpath("//label[contains(normalize-space(),'Username')]");
    private By usernameInput = By.xpath("//label[text()='Username']/../following-sibling::div//input");
    
    private By userRoleLbl = By.xpath("//label[contains(normalize-space(),'User Role')]");
    private By userRoleInput = By.xpath("//label[text()='User Role']/../following-sibling::div//div[contains(@class,'oxd-select-text-input')]");

    private By employeeNameLbl = By.xpath("//label[contains(normalize-space(),'Employee Name')]");
    private By employeeNameInput = By.xpath("//label[text()='Employee Name']/../following-sibling::div//input");

    private By statusLbl = By.xpath("//label[text()='Status']");
    private By statusInput = By.xpath("//label[text()='Status']/../following-sibling::div//div[contains(@class,'oxd-select-text-input')]");

    private By searchBtn = By.xpath("//button[normalize-space()='Search']");
    private By resetBtn = By.xpath("//button[normalize-space()='Reset']");
    private By addBtn = By.xpath("//button[normalize-space()='Add']");

    // constructor
    public AdminPage(WebDriver driver) {
        super(driver);
    }

}
