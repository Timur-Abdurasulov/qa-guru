package homework5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Pdp {

    private WebDriver driver;
    private WebDriverWait wait;
    private final String HOME_PAGE_URL = "http://1a.lv";
    private final By SUBMENU_PHOTO = By.xpath(".//li[@class = 'submenu-lvl1__list-item color-theme-20 submenu-lvl1__list-item--has-child']");
    private final By PHOTO_DEVICES = By.xpath(".//a[@href = 'https://www.1a.lv/c/foto-tehnika-optika/foto-sporta-kameras-binokli/30l']");
    private final By PHOTO_CAMERAS = By.xpath(".//a[@href = 'https://www.1a.lv/c/foto-tehnika-optika/foto-sporta-kameras-binokli/spogulkameras/30r']");
    private final By CANON_CAMERA = By.xpath(".a[@href = 'https://www.1a.lv/p/spogulkamera-canon-eos-850d-18-55mm-is-stm/96tl?cat=30r&index=1']");
    private final By PRICE = By.xpath("span[@class = 'price']");

    @Test
    public void productDescriptionPage() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru 2/Selenium/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE_URL);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement subMenuPhoto = wait.until(ExpectedConditions.elementToBeClickable(SUBMENU_PHOTO));
        driver.findElement(SUBMENU_PHOTO);
        subMenuPhoto.click();

        WebElement photoDevices = wait.until(ExpectedConditions.elementToBeClickable(PHOTO_DEVICES));
        driver.findElement(PHOTO_DEVICES);
        photoDevices.click();

        WebElement photoCameras = wait.until(ExpectedConditions.elementToBeClickable(PHOTO_CAMERAS));
        driver.findElement(PHOTO_CAMERAS);
        photoCameras.click();

        WebElement canonCamera = wait.until(ExpectedConditions.elementToBeClickable(CANON_CAMERA));
        driver.findElement(CANON_CAMERA);
        canonCamera.click();

        WebElement price = driver.findElement(PRICE);
        System.out.println(price);
    }
}
