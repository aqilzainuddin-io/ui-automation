package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage extends BasePage {
    
    // locators
    private By adminHeader = By.cssSelector("oxd-topbar-header-breadcrumb-module");
    private By systemUsers = By.cssSelector("oxd-table-filter-title");
    private By recordsFound = By.xpath("//span[contains(normalize-space(),'Records Found')]");
    
    private By usernameLbl = By.xpath("//label[contains(normalize-space(),'Username')]");
    private By userRoleLbl = By.xpath("//label[contains(normalize-space(),'User Role')]");
    private By employeeNameLbl = By.xpath("//label[contains(normalize-space(),'Employee Name')]");
    private By statusLbl = By.xpath("//label[contains(normalize-space(),'Status')]");
    

    private By usernameInput = By.xpath("//label[normalize-space()='Username']/ancestor::div[contains(@class,'oxd-input-group')]//input");
    

    //input

    // constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
