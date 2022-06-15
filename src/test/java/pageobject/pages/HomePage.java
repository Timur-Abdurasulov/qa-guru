package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage {

    // Attributes -> Locators
    private final By ACCEPT_COOKIES = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By SEARCH_INPUT_FIELD = By.id("q");
    private BaseFunctions baseFunctions;

    // Constructor
    public HomePage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }

    // Methods (works with this page object using locators)
    public void acceptCookies() {
        baseFunctions.click(ACCEPT_COOKIES);
    }

    public void searchFor(String textToFind) {
        baseFunctions.type(SEARCH_INPUT_FIELD, textToFind);
        baseFunctions.pressKey(SEARCH_INPUT_FIELD, Keys.ENTER);
    }
}
