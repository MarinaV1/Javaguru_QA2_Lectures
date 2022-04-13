package lecture10.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lecture8.pages.DogsPagePom;

public class DogsPageSteps {

    DogsPagePom dogsPagePom = new DogsPagePom();


    @And("Validate that DogPage is open")
    public void validateThatDogPageIsOpen() {
        dogsPagePom.validatePageUrl();

    }

    @When("^Set min price to (.*) and max price (.*)$")
    public void setMinPriceToAndMaxPrice(String minPrice, String maxPrice) {
        dogsPagePom.setPrice(minPrice, maxPrice);

    }

    @And("^Set min age to (.*) and max age (.*)$")
    public void setMinAgeToAndMaxAge(String minAge, String maxAge) {
        dogsPagePom.setAge(minAge, maxAge);

    }

    @And("^Change region to (Riga|all)$")
    public void changeRegionTo(String region) {
        dogsPagePom.selectRegion(region);
    }

    @Then("Press search button")
    public void pressSearchButton() {
        dogsPagePom.pressMekletButton();
    }
}
