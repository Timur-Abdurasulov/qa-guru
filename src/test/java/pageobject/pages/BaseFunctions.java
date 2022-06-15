package pageobject.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseFunctions {

    private WebDriver driver;
    private WebDriverWait wait;

    public BaseFunctions() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru 2/Selenium/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void openUrl(String url) {
//        if (url.startsWith("http://") || url.startsWith("https://")) {
//
//        } else {
//            url = "http://" + url;
//        }

        if (url.startsWith("http://") || url.startsWith("https://")) {

        }
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }

        // !true -> false           !false -> true    ! = "не"
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }

        driver.get(url);
    }

    public void click(By locator) {
//        wait.until(ExpectedConditions.elementToBeClickable(locator));
//        WebElement we = driver.findElement(locator);
        WebElement we = wait.until(ExpectedConditions.elementToBeClickable(locator));

        try {
            we.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("Report: First try failed. Second try processing");
            we.click();
        }

    }

    public void type(By locator, String text) {
//        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//        WebElement we = driver.findElement(locator);
        WebElement we = findElement(locator);

        we.clear();
        we.sendKeys(text);
    }

    public void pressKey(By locator, Keys key) {
//        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//        WebElement we = driver.findElement(locator);
//
//        we.sendKeys(key);
        findElement(locator).sendKeys(key);
    }

    public WebElement findElement(By locator) {
//        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//        WebElement we = driver.findElement(locator);
//        return we;
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
