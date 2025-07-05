package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
import pages.Register;

import java.time.Duration;

public class HozskladTests {

    private static WebDriver driver;
    private static MainPage mainPage;
    private static Register register;


    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        mainPage = new MainPage(driver);
        register = new Register(driver);
        mainPage.open();
    }

    @Test
    @DisplayName("Тест 1: Открытие главной страницы")
    void testOpenHomePage() {
        mainPage.waitSeconds(5);
        mainPage.clickSaveLng();
        mainPage.waitSeconds(5);
    }

    @Test
    @DisplayName("Тест: Клик по категории 'Автотовары'")
    void testClickAutoCategory() {
        mainPage.waitSeconds(5);
        mainPage.clickSaveLng();
        mainPage.interactWithCategoryByText("Автотовари", "click");
        mainPage.waitSeconds(5);
    }

    @Test
    @DisplayName("Тест: Наведение на категорию 'Строительные материалы'")
    void testHoverBuildCategory() {
        mainPage.clickSaveLng();
        mainPage.interactWithCategoryByText("Все для кухні", "hover");
        mainPage.waitSeconds(5);
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}