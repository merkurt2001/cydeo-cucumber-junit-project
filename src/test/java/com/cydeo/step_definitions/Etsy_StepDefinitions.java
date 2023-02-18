package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyHomePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Etsy_StepDefinitions {

    @Given("user is on the Etsy homepage")
    public void user_is_on_the_etsy_homepage() {
        Driver.getDriver().get("https://www.etsy.com");
    }
    @Then("user should see title is as expected")
    public void user_should_see_title_is_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        BrowserUtils.verifyTitle(expectedTitle);

    }

    EtsyHomePage etsyHomePage = new EtsyHomePage();

    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyHomePage.searchBox.sendKeys("Wooden Spoon");
    }
    @When("user click to Etsy search button")
    public void user_click_to_etsy_search_button() {
        etsyHomePage.searchButton.click();
    }
    @Then("user sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        BrowserUtils.verifyTitle("Wooden spoon - Etsy");
    }

    @When("user types {string} in the search box")
    public void userTypesInTheSearchBox(String keyword) {

        etsyHomePage.searchBox.sendKeys(keyword);

    }

    @Then("user sees {string} is in the title")
    public void userSeesIsInTheTitle(String expectedTitle) {

        BrowserUtils.verifyTitle(expectedTitle);

    }
}
