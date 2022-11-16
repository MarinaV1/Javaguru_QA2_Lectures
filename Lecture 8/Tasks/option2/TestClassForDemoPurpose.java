package lecture8;

import lecture8.pages.DogsPage;
import lecture8.pages.HomePage;
import org.junit.jupiter.api.Test;

public class TestClassForDemoPurpose {

    HomePage homePage = new HomePage();
    DogsPage dogsPage = new DogsPage();

    @Test
    public void someDemoTest() {
        homePage.openBaseUrl();
        homePage.chooseCategory("dogs");
        dogsPage.fillMinMaxAge("10","101");
        dogsPage.fillMinMaxPrice("","1000000");
        dogsPage.pressSubmitButton();
        dogsPage.changeDealTypeTo("sell");
        homePage.stopDriver();
    }

}
