package lecture11.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePagePom  {

    private final By categoryDogs = By.id("mtd_300");
    private final By categoryCars = By.id("mtd_300");

    public void openPageByCategory(String category) {
        if ("dogs".equals(category)) {
            $(categoryDogs).click();
        } else if ("cars".equals(category)) {
            $(categoryCars).click();
        }
    }

}
