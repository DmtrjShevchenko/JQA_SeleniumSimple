package example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    private static final Logger log = LoggerFactory.getLogger(SimpleTest.class);
    private WebDriver driver;

    @BeforeEach
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        log.info("ChromeDriver started");
    }

    @Test
    void checkTitleExampleDotCom() throws InterruptedException {
        log.info("Open https://example.com");
        driver.get("https://example.com");

        String title = driver.getTitle();
        log.info("Page title: {}", title);
        assertEquals("Example Domain", title);

        // Небольшая пауза, чтобы увидеть страницу
        Thread.sleep(2000);
    }

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
            log.info(" ChromeDriver stoped");
        }
    }
}
