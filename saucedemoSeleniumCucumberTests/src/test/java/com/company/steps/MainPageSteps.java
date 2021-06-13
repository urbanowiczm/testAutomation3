package com.company.steps;

import com.company.pages.InventoryPage;
import com.company.utils.DriverSingleton;
import com.company.pages.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageSteps {
    private MainPage mainPage;
    private InventoryPage inventoryPage;

    public MainPageSteps() {
        mainPage = new MainPage();
        inventoryPage = new InventoryPage();
    }

    @Given("Go to the home page")
    public void goToTheHomePage() {
        mainPage.goToPage();
    }

    @And("User login with username {string} and password as {string}")
    public void theUserProvidesTheUsernameAsAndPasswordAs(String username, String password) {
        mainPage.login(username, password);
    }

    @Then("The user should login successfully and is brought to the inventory page")
    public void theUserShouldLoginSuccessfullyAndIsBroughtToTheInventoryPage() {
        assertTrue(inventoryPage.browserIsOnThePage());
    }
}
