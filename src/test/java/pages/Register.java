package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

import static utils.WebDriverUtils.clickButtonByText;
import static utils.WebDriverUtils.inputByPlaceholder;

public class Register {

    private static WebDriver driver;

    public Register (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openRegister() {
        WebDriverUtils.openUrl(driver, "https://hozsklad.ua/ua/auth/register");
    }

    public void inputUserName(String text) {
        inputByPlaceholder(driver, "Введіть Ваше ім'я", text);
    }

    public void inputUserSName(String text) {
        inputByPlaceholder(driver, "Введіть Ваше прізвище", text);
    }

    public void inputUserSecondName(String text) {
        inputByPlaceholder(driver, "Введіть по-батькові", text);
    }

    public void inputUserEmail(String mail) {
        inputByPlaceholder(driver, "Введіть Ваш Email", mail);
    }

    public void inputUserPhoneNumber(String phoneNumber) {
        inputByPlaceholder(driver, "Введіть Ваш телефон", phoneNumber);
    }

    public void inputUserPassword(String password) {
        inputByPlaceholder(driver, "Введіть Ваш пароль", password);
    }

    public void inputUserSPassword(String password) {
        inputByPlaceholder(driver, "Введіть пароль ще раз", password);
    }

    public void clickRegisterButton(String buttonName) {
        clickButtonByText(driver, buttonName);
    }

}
