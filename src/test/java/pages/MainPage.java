package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverUtils;

import java.time.Duration;

public class MainPage {

    private WebDriver driver;

    @FindBy(xpath = "//button[contains(text(), 'Каталог')]")
    private WebElement catalogButton;

    @FindBy(xpath = "//button[contains(text(), 'Зберегти')]")
    private WebElement saveButton;

    @FindBy(xpath = "//a[@href=\"/ua/avtotovary\"]/div[contains(@class, 'left_menu__categories_img_wrapper')]")
    private  WebElement categoryButton;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Клик или наведение на категорию по тексту в span
     * @param categoryText Текст категории (например: "Товари для дому")
     * @param actionType "click" или "hover"
     */
    public void interactWithCategoryByText(String categoryText, String actionType) {
        String xpath = String.format(
                "//li[contains(@class, 'left_menu__categories_item')]//span[contains(text(), '%s')]/ancestor::a",
                categoryText
        );

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement categoryElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));

        switch (actionType.toLowerCase()) {
            case "click":
                categoryElement.click();
                System.out.println("Клик по категории: " + categoryText);
                break;
            case "hover":
                new Actions(driver).moveToElement(categoryElement).perform();
                System.out.println("Наведение на категорию: " + categoryText);
                break;
            default:
                throw new IllegalArgumentException("Неизвестный тип действия: " + actionType);
        }
    }

    public void open() {
        WebDriverUtils.openUrl(driver, "https://hozsklad.ua/ua");
    }

    public void clickSaveLng() {
        saveButton.click();
        System.out.println("Кнопка Зберегти натиснута...");
    }

    public void waitSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L); // Переводим секунды в миллисекунды
            System.out.println("Ожидание " + seconds + " секунд...");
        } catch (InterruptedException e) {
            System.err.println("Ошибка при ожидании: " + e.getMessage());
            Thread.currentThread().interrupt(); // Восстанавливаем статус прерывания
        }
    }

}