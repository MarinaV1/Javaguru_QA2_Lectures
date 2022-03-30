package lecture8.pages;

import org.openqa.selenium.By;

public class HomePagePom extends BasePage {

    private final By categoryDogs = By.id("mtd_300");
    private final By categoryCars = By.id("mtd_300");

    public void openPageByCategory(String category) {
        if ("dogs".equals(category)) {
            driver.findElement(categoryDogs).click();
        } else if ("cars".equals(category)) {
            driver.findElement(categoryCars).click();
        }
    }

}
