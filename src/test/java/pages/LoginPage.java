package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.StaleElementReferenceException;

public class LoginPage {
    
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("button[type='submit']");
    private By successMessage = By.cssSelector(".flash.success");
    private By errorMessage = By.cssSelector(".flash.error");

    // Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    // Actions
    private void clearFields(){
        driver.findElement(usernameField).clear();
        driver.findElement(passwordField).clear();
    }
    
    public void login(String username, String password){
        clearFields();
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public String getSuccessMessage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).getText();
    }

    public String getErrorMessage() {
        try {
            // Wait for the error message to appear
            return wait.until(ExpectedConditions
                    .visibilityOfElementLocated(errorMessage)).getText();
        } catch (StaleElementReferenceException e) {
            // If stale, re-locate and read again
            return driver.findElement(errorMessage).getText();
        }
    }
}
