package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtils {

    public static void openUrl(WebDriver driver, String url) {
        driver.get(url);
        System.out.println("Открыта страница: " + url);
    }

    public static void clickButtonByText(WebDriver driver, String buttonText) {
        WebElement button = driver.findElement(By.xpath("//*[text()='" + buttonText + "']"));
        button.click();
        System.out.println("Нажата кнопка: " + buttonText);
    }

    public static void inputSearchText(WebDriver driver, String text) {
        WebElement field = driver.findElement(By.xpath("//input[contains(@class,'header__search')]"));
        field.sendKeys(text);
        System.out.println("Введен текст '" + text + "' в поле пошук '");
    }

    public static void hoverOverElement(WebDriver driver, WebElement element) {
        new Actions(driver).moveToElement(element).perform();
        System.out.println("Наведение на элемент: " + element.getText());
    }

    public static void inputByPlaceholder(WebDriver driver, String placeholder, String text) {
        String xpath = String.format("//input[@placeholder=\"%s\"]", placeholder);
        WebElement field = driver.findElement(By.xpath(xpath));
        field.clear();
        field.sendKeys(text);
        System.out.printf("Введено значеня '%s' у поле з placeholder='%s'%n", text, placeholder);
    }

}