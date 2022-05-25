package homework2;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneALv {
    private final String HOME_PAGE_URL = "http://1a.lv";
    private final By LOGO = By.className("main-logo");
    private final By LANGUAGE_SWITCH = By.xpath(".//a[@hreflang = 'ru']");
    private final By ORDER_SEARCH = By.xpath(".//a[@href = '/order_search']");
    private final By SEARCH_INPUT_FIELD = By.id("q");
    private final By SEARCH_ICON = By.xpath(".//button[@class = 'main-search-submit']");
    private final By WISHLIST = By.xpath(".//a[@class = 'favorite-items__handle']");
    private final By COOKIES = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By SUBMENU_PC = By.xpath(".//li[@class = 'submenu-lvl1__list-item color-theme-17 submenu-lvl1__list-item--has-child']");
    private final By SUBMENU_PC_COMPONENTS = By.xpath(".//a[@href = '/c/datoru-komponentes-tikla-produkti/2pe']");
    private final By SUBMENU_SMARTPHONES = By.xpath(".//a[@href = '/c/telefoni-plansetdatori-apple-veikals/2pc']");
    private final By SUBMENU_TV = By.xpath(".//a[@href = '/c/tv-audio-video-spelu-konsoles/2pf']");
    private final By MAIN_BANNER = By.xpath(".//a[@class = 'welcome-carousel-slider__slide-link']");

    @Test
    public void logoCheck() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru 2/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement logo = browser.findElement(LOGO);
        logo.click();
    }

    @Test
    public void languageSwitch() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru 2/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement languageSwitch = browser.findElement(LANGUAGE_SWITCH);
        languageSwitch.click();
    }

    @Test
    public void orderSearch() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru 2/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement orderSearch = browser.findElement(ORDER_SEARCH);
        orderSearch.click();
    }

    @Test
    public void searchIcon() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru 2/Selenium/chromedriver.exe");
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
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru 2/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement wishlist = browser.findElement(WISHLIST);
        wishlist.click();
    }

    @Test
    public void cookies() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru 2/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement cookies = browser.findElement(COOKIES);
        cookies.click();
    }

    @Test
    public void subMenuPc() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru 2/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement subMenuPc = browser.findElement(SUBMENU_PC);
        subMenuPc.click();
    }

    @Test
    public void subMenuPcComponents() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru 2/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement subMenuPcComponents = browser.findElement(SUBMENU_PC_COMPONENTS);
        subMenuPcComponents.click();
    }

    @Test
    public void subMenuSmartphones() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru 2/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement subMenuSmartphones = browser.findElement(SUBMENU_SMARTPHONES);
        subMenuSmartphones.click();
    }

    @Test
    public void subMenuTv() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru 2/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement subMenuTv = browser.findElement(SUBMENU_TV);
        subMenuTv.click();
    }

    @Test
    public void mainBanner() {
        System.setProperty("webdriver.chrome.driver", "D:/QAGuru 2/Selenium/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement mainBanner = browser.findElement(MAIN_BANNER);
        mainBanner.click();
    }
}