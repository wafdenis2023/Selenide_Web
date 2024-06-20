package stepdefinitions;

import com.codeborne.selenide.Condition;
import common.DataManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

/**
 * This class contains the step definitions for the Cucumber feature file.
 */
public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Before
    public void setup() {
        DataManager.setup();
        DataManager.openBrowser();
    }

    @After
    public void tearDown() {
        DataManager.tearDown();
    }

    @When("user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        try {
            loginPage.login(username, password);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Then("user should be redirected to {string}")
    public void userShouldBeRedirectedTo(String expectedUrl) {
        try {
             webdriver().shouldHave(url(expectedUrl));
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Then("error message {string} should be displayed")
    public void errorMessageShouldBeDisplayed(String expectedMessage) {
        try {
            loginPage.errorMessage.shouldHave(Condition.text(expectedMessage));
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
