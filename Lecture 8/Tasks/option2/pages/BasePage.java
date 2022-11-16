package lecture8.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static ChromeDriver driver;


    public void startDriver() {
        String path = "C:\\Users\\user\\Downloads\\someProject\\SomePRojectGradle\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
    }

    public void stopDriver() {
        driver.quit();
    }
}
