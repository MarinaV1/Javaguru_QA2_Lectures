package lecture11;

import com.codeborne.selenide.Configuration;
import lecture11.pages.DogsPagePom;
import lecture11.pages.HomePagePom;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;


public class SeleniumTask1 {

    HomePagePom homePagePom = new HomePagePom();
    DogsPagePom dogsPagePom = new DogsPagePom();


    @Test
    public void ssLvTest() {
        Configuration.holdBrowserOpen = true;
        open("https://www.ss.com/lv/");
        homePagePom.openPageByCategory("dogs");
        dogsPagePom.validatePageUrl();
        dogsPagePom.setPrice("1000", "");
        dogsPagePom.setAge("1", "12");
        dogsPagePom.validateAge("1", "12");
        dogsPagePom.selectRegion("Riga");
        dogsPagePom.pressMekletButton();

    }
}
