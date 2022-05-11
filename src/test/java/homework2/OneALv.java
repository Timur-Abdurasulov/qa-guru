package homework2;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneALv {
    private final String HOME_PAGE_URL = "http://1a.lv";
    private final By LOGO = By.className("main-logo");
    private final By LANGUAGE_SWITCH = By.xpath("/html/body/div[2]/div[1]/div/ul/li[4]/a");
    private final By ORDER_SEARCH = By.xpath("/html/body/div[2]/div[1]/div/div/ul/li[6]/a");
    private final By SEARCH_INPUT_FIELD = By.id("q");
    private final By SEARCH_ICON = By.xpath(".//button[@class = 'main-search-submit']");
    private final By WISHLIST = By.xpath(".//a[@class = 'favorite-items__handle']");
    private final By COOKIES = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By SUBMENU_PC = By.xpath(".//a[@href = '/c/datortehnika-preces-birojam/2pd']");
    //private final By SUBMENU_PC = By.xpath(".//a[@class = 'submenu-lvl1__link']");
    //private final By SUBMENU_PC = By.xpath(".//a[@class = 'submenu-lvl1__link']");
    //private final By SUBMENU_PC = By.xpath(".//a[@class = 'submenu-lvl1__link']");
    private final By MAIN_BANNER = By.xpath(".//a[@class = 'welcome-carousel-slider__slide-link']");

    @Test
    public void logoCheck() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement logo = browser.findElement(LOGO);
        logo.click();
    }

    @Test
    public void languageSwitch() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement languageSwitch = browser.findElement(LANGUAGE_SWITCH);
        languageSwitch.click();
    }

    @Test
    public void orderSearch() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement orderSearch = browser.findElement(ORDER_SEARCH);
        orderSearch.click();
    }

    @Test
    public void searchIcon() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement searchField = browser.findElement(SEARCH_INPUT_FIELD);
        WebElement searchIcon = browser.findElement(SEARCH_ICON);
        searchField.sendKeys("Apple");
        searchIcon.click();
    }

    @Test
    public void wishlist() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement wishlist = browser.findElement(WISHLIST);
        wishlist.click();
    }

    @Test
    public void cookies() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement cookies = browser.findElement(COOKIES);
        cookies.click();
    }

    @Test
    public void subMenu() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement subMenuPc = browser.findElement(SUBMENU_PC);
        subMenuPc.click();
    }

    @Test
    public void mainBanner() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement mainBanner = browser.findElement(MAIN_BANNER);
        mainBanner.click();
    }
}