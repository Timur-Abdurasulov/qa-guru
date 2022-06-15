package pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseFunctions {

    private WebDriver driver;

    public BaseFunctions() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru 2/Selenium/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void openUrl(String url) {
        driver.get(url);
    }
}
