package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DashboardPage extends BasePage {

    // locator for something visible only when login is successful
    private By dashboardHeader = By.xpath("//h6[text()='Dashboard']");
    private By quickLaunch = By.xpath("//p[text()='Quick Launch']");
    private By timeAtWork = By.xpath("//p[text()='Time at Work']");
    private By myActions = By.xpath("//p[text()='My Actions']");
    private By buzzLatestPosts = By.xpath("//p[text()='Buzz Latest Posts']");
    private By employeesOnLeaveToday = By.xpath("//p[text()='Employees on Leave Today']");
    private By employeeDistributionbySubUnit = By.xpath("//p[text()='Employee Distribution by Sub Unit']");
    private By employeeDistributionbyLocation = By.xpath("//p[text()='Employee Distribution by Location']");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDashboardDisplayed() {
        return isElementDisplayed(dashboardHeader);
    }

    public String getDashboardTitle() {
        return getText(dashboardHeader);
    }

    // Verify quick launch widget visible
    public boolean isQuickLaunchVisible() {
        return isElementDisplayed(quickLaunch);
    }

    public boolean isTimeAtWorkVisible() {
        return isElementDisplayed(timeAtWork);
    }

    public boolean isMyActionsVisible() {
        return isElementDisplayed(myActions);
    }

    public boolean isBuzzLatestPostsVisible() {
        return isElementDisplayed(buzzLatestPosts);
    }

    public boolean isEmployeesOnLeaveTodayVisible() {
        return isElementDisplayed(employeesOnLeaveToday);
    }

    public boolean isEmployeeDistributionBySubUnitVisible() {
        return isElementDisplayed(employeeDistributionbySubUnit);
    }

    public boolean isEmployeeDistributionByLocationVisible() {
        return isElementDisplayed(employeeDistributionbyLocation);
    }
    
}
