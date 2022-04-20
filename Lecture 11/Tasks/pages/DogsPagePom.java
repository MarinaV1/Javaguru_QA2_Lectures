package lecture11.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.Assertions.assertThat;

public class DogsPagePom {

    private final By priceMin = By.id("f_o_8_min");
    private final By priceMax = By.id("f_o_8_max");
    private final By ageMin = By.id("f_o_1276_min");
    private final By ageMax = By.id("f_o_1276_max");
    private final By filterSel = By.className("filter_sel");
    private final By mekletButton = By.xpath("//input[@class='b s12']");
    private final String currentUrl = "https://www.ss.com/lv/animals/dogs/";


    public void validatePageUrl() {
        String currentUrl = url();
        assertThat(currentUrl).isEqualTo(currentUrl);
    }

    public void setPrice(String min, String max) {
        $(priceMin).sendKeys(min);
        $(priceMax).sendKeys(max);
    }

    public void setAge(String min, String max) {
        $(ageMin).sendKeys(min);
        $(ageMax).sendKeys(max);
    }

    public void selectRegion(String region) {
        if ("Riga".equals(region)) {
            $$(filterSel).get(1).selectOptionByValue("riga_f");
        } else {
            $$(filterSel).get(1).selectOptionByValue("0");
        }
    }

    public void pressMekletButton() {
        $(mekletButton).click();
    }

    public void validateAge(String min, String max) {
        pressMekletButton();
        String ageMinText = $(ageMin).getAttribute("value");
        assertThat(ageMinText).isEqualTo(min);
        String ageMaxText = $(ageMax).getAttribute("value");
        assertThat(ageMaxText).isEqualTo(max);
    }
}
