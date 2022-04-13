package lecture10.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import lecture8.pages.BasePage;
import lecture8.pages.HomePagePom;

public class HomePageSteps {

    BasePage basePage = new BasePage();
    HomePagePom homePagePom = new HomePagePom();

    @Given("Open HomePage")
    public void openHomePage() {
        basePage.openChromeByUrl("https://www.ss.com/lv/");
    }


    @And("Open Dog category")
    public void openDogCategory() {
        homePagePom.openPageByCategory("dogs");
    }
}
