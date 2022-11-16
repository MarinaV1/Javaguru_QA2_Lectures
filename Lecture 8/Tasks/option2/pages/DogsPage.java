package lecture8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DogsPage extends BasePage {


    private final By minPrice = By.id("f_o_8_min");
    private final By maxPrice = By.id("f_o_8_max");
    private final By minAge = By.id("f_o_1276_min");
    private final By maxAgee = By.id("f_o_1276_max");
    private final By dealTypeSelector = By.cssSelector("select[name='sid']");
    private final By submitButton = By.xpath("//input[@class='b s12']");

    public void fillMinMaxAge(String min, String max) {
        driver.findElement(minAge).sendKeys(min);
        driver.findElement(maxAgee).sendKeys(max);
    }

    public void fillMinMaxPrice(String min, String max) {
        driver.findElement(minPrice).sendKeys(min);
        driver.findElement(maxPrice).sendKeys(max);
    }

    public void changeDealTypeTo(String dealTypeValue) {
        Select dealType = new Select(driver.findElement(dealTypeSelector));
        if ("sell".equals(dealTypeValue)) {
            dealType.selectByValue("/ru/animals/dogs/sell/filter/");
        } else if ("buy".equals(dealTypeValue)){
            dealType.selectByValue("/ru/animals/dogs/buy/filter/");
        }else {
            System.out.println("Something went wrong");
        }
    }

    public void pressSubmitButton() {
        driver.findElement(submitButton).click();
    }


}
