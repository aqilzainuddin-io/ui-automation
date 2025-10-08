package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoSuchElementException;


public class DashboardPage {
    private WebDriver driver;

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
        this.driver = driver;
    }

    public boolean isDashboardDisplayed() {
    try {
        return driver.findElement(dashboardHeader).isDisplayed();
    } catch (NoSuchElementException e) {
        return false;
    }
}

    public String getDashboardTitle() {
        return driver.findElement(dashboardHeader).getText();
    }

    // Verify quick launch widget visible
    public boolean isQuickLaunchVisible() {
    try {
            return driver.findElement(quickLaunch).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isTimeAtWorkVisible() {
    try {
            return driver.findElement(timeAtWork).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isMyActionsVisible() {
    try {
            return driver.findElement(myActions).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isBuzzLatestPostsVisible() {
    try {
            return driver.findElement(buzzLatestPosts).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isEmployeesOnLeaveTodayVisible() {
    try {
            return driver.findElement(employeesOnLeaveToday).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isEmployeeDistributionBySubUnitVisible() {
    try {
            return driver.findElement(employeeDistributionbySubUnit).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isEmployeeDistributionByLocationVisible() {
    try {
            return driver.findElement(employeeDistributionbyLocation).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    
}
