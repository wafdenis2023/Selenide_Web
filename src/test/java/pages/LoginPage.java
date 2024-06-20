package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * This class represents the login page and provides methods to interact with the login elements.
 */
public class LoginPage {

    public SelenideElement usernameField = $(By.name("user-name"));
    public SelenideElement passwordField = $(By.name("password"));
    public SelenideElement loginButton = $(By.name("login-button"));
    public SelenideElement errorMessage = $(By.xpath("//h3[@data-test='error']"));

    /**
     * Logs in with the specified username and password.
     *
     * @param username the username to log in with.
     * @param password the password to log in with.
     */
    public void login(String username, String password) {
        usernameField.setValue(username);
        passwordField.setValue(password);
        loginButton.click();
    }
}
