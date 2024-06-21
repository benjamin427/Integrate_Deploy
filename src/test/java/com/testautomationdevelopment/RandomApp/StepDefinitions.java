package com.testautomationdevelopment.RandomApp;

import io.cucumber.java.en.*;
import com.testautomationdevelopment.RandomApp.pageObjects.Chrome_pageObjects;

public class StepDefinitions {

    Chrome_pageObjects chromePageObjects = new Chrome_pageObjects();

    @Given("navigate to the website")
    public void openingScenario() {
        chromePageObjects.navigateWebsite();
    }

    @And("type any random word in the text field")
    public void middleScenario() {
        chromePageObjects.typeRandomWord("AI");
    }

    @And("click the search button")
    public void endingScenario() {
        chromePageObjects.clickButton();
    }

    @Then("close the browser")
    public void closingScenario() {
        chromePageObjects.closeBrowser();
    }

}
