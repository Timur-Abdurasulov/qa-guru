package pageobject;

import org.junit.jupiter.api.Test;
import pageobject.pages.BaseFunctions;

public class CatalogTests {

    private final String HOME_PAGE_URL = "http://1a.lv";

    @Test
    public void productDetailsCheck() {
        BaseFunctions baseFunctions = new BaseFunctions();
        baseFunctions.openUrl(HOME_PAGE_URL);
    }
}
