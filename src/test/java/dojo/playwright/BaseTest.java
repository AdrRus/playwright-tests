package dojo.playwright;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    protected static Playwright playwright;
    protected static Browser browser;
    protected static BrowserContext context;
    protected static Page page;

    @BeforeAll
    static void setBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(
            new BrowserType.LaunchOptions().setHeadless(false)
        );
        context = browser.newContext();
    }
    @BeforeEach
    void setPage() {
        page = browser.newPage();
    }

    @AfterAll
    static void tearDown() {
        browser.close();
        playwright.close();
    }
}
