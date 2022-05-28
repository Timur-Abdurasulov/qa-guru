package homework3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFilling {
    private final String HOME_PAGE_URL = "http://www.qaguru.lv:8089/tickets/step2.php?afrom=CPT&bfrom=BCN";
    private final By NAME_FIELD = By.id("name");
    private final By SURNAME_FIELD = By.id("surname");
    private final By DISCOUNT_FIELD = By.id("discount");
    private final By ADULTS_FIELD = By.id("adults");
    private final By CHILDREN_FIELD = By.id("children");
    private final By LUGGAGE_FIELD = By.id("bugs");
    private final By DATE_SELECTION_FIELD = By.xpath(".//option[@value = '12']");
    private final By GET_PRICE = By.xpath(".//span[@style = 'cursor: pointer;']");
    private final By BOOK_FLIGHT = By.id("book2");
    private final By SEAT = By.xpath(".//div[@onclick = 'seat(4)']");

    @Test
    public void formFilling() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru 2/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement nameField = browser.findElement(NAME_FIELD);
        nameField.sendKeys("Timur");
        WebElement surnameField = browser.findElement(SURNAME_FIELD);
        surnameField.sendKeys("Abdurasulov");
        WebElement discountField = browser.findElement(DISCOUNT_FIELD);
        discountField.sendKeys("QAGURU");
        WebElement adultsField = browser.findElement(ADULTS_FIELD);
        adultsField.sendKeys("1");
        WebElement childrenField = browser.findElement(CHILDREN_FIELD);
        childrenField.sendKeys("0");
        WebElement luggageField = browser.findElement(LUGGAGE_FIELD);
        luggageField.sendKeys("2");
        WebElement dateSelectionField = browser.findElement(DATE_SELECTION_FIELD);
        dateSelectionField.click();
        WebElement getPrice = browser.findElement(GET_PRICE);
        getPrice.click();
        WebElement bookFlight = browser.findElement(BOOK_FLIGHT);
        bookFlight.click();
        WebElement seat = browser.findElement(SEAT);
        seat.click();
    }
}
