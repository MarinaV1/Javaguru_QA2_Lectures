package lecture11;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static lecture8.pages.BasePage.driver;
import static org.assertj.core.api.Assertions.assertThat;

public class SelenideDemo {

    @Test
    public void firstSeleniumDemoTest() {

        open("https://www.ss.com/");
        Configuration.holdBrowserOpen = true;
        $(By.id("mtd_300")).click();
        String currentUrl = url();
        assertThat(currentUrl).isEqualTo("https://www.ss.com/lv/animals/dogs/");
        $$(By.className("filter_sel")).get(1).selectOptionByValue("riga_f");
        $(By.id("f_o_1276_min")).sendKeys("1");
        $(By.xpath("//input[@class='b s12']")).click();
        String ageText = $(By.id("f_o_1276_min")).getAttribute("value");
        assertThat(ageText).isEqualTo("1");
    }

}

