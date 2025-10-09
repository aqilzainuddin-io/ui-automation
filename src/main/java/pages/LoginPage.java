package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    // ===== Locators =====
    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.cssSelector("button[type='submit']");
    private By errorMessage = By.cssSelector(".oxd-alert-content-text");

    // ===== Constructor =====
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // ===== Actions =====
    public void login(String username, String password) {
        type(usernameField, username);
        type(passwordField, password);
        click(loginButton);
    }

    // ===== Getters =====
    public boolean isErrorMessageVisible() {
        return isElementDisplayed(errorMessage);
    }

    public String getErrorMessage() {
        return getText(errorMessage);
    }
}
