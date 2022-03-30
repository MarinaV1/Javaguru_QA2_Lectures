package lecture8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.assertThat;

public class DogsPagePom extends BasePage {

    private final By priceMin = By.id("f_o_8_min");
    private final By priceMax = By.id("f_o_8_max");
    private final By ageMin = By.id("f_o_1276_min");
    private final By ageMax = By.id("f_o_1276_max");
    private final By filterSel = By.className("filter_sel");
    private final By mekletButton = By.xpath("//input[@class='b s12']");
    private final String baseUrl = "https://www.ss.com/lv/animals/dogs/";


    public void validatePageUrl() {
        String currentUrl = driver.getCurrentUrl();
        assertThat(currentUrl).isEqualTo(baseUrl);
    }

    public void setPrice(String min, String max) {
        driver.findElement(priceMin).sendKeys(min);
        driver.findElement(priceMax).sendKeys(max);
    }

    public void setAge(String min, String max) {
        driver.findElement(ageMin).sendKeys(min);
        driver.findElement(ageMax).sendKeys(max);
    }

    public void selectRegion(String region) {
        Select dogType = new Select(driver.findElements(filterSel).get(1));
        if ("Riga".equals(region)) {
            dogType.selectByValue("riga_f");
        } else {
            dogType.selectByValue("0");
        }
    }

    public void pressMekletButton() {
        driver.findElement(mekletButton).click();
    }

    public void validateAge(String min, String max) {
        pressMekletButton();
        String ageMinText = driver.findElement(ageMin).getAttribute("value");
        assertThat(ageMinText).isEqualTo(min);
        String ageMaxText = driver.findElement(ageMax).getAttribute("value");
        assertThat(ageMaxText).isEqualTo(max);
    }
}
